package student.examples;

import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class ClientApp
{
    public static void main( String[] args )throws Exception
    {
        System.out.println("Client started");
        Socket socket = new Socket("localhost", 10001);
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

        Scanner inp = new Scanner(System.in);
        System.out.print("Nick name: ");
        String nickname = inp.next();
        Player player = new Player(nickname, 0);

        Frame frame = new Frame("connect", player);





        oos.writeObject(frame);
        oos.close();;
        socket.close();
        System.out.println("Client: sent frame");
    }
}
