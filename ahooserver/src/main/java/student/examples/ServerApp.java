package student.examples;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Hello world!
 *
 */
public class ServerApp
{
    static Player player1;
    static Player player2;

    public static void main( String[] args )throws Exception
    {
        ServerSocket serverSocket = new ServerSocket(10001);

//        ---------------------
        System.out.println("SERVER RUNNING...");
        Socket clientSocket = serverSocket.accept();
        System.out.println("A CLIENT HAS CONNECTED!");

        InputStream is = clientSocket.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(is);

        Frame frame1 = (Frame) ois.readObject();
//        is.close();
//        clientSocket.close();

        if (frame1.getHeader().equals("connect")){
            player1 = (Player)frame1.getBody();
            System.out.println("PLAYER CONNECTED: " + ((Player)frame1.getBody()).getNickName());
        }
//        ----------------------
        Socket clientSocket1 = serverSocket.accept();
        System.out.println("A CLIENT HAS CONNECTED!");

        InputStream is1 = clientSocket1.getInputStream();
        ObjectInputStream ois1 = new ObjectInputStream(is1);

        Frame frame2 = (Frame) ois1.readObject();
//        is.close();
//        clientSocket.close();

        if (frame2.getHeader().equals("connect")){
            player2 = (Player)frame2.getBody();
            System.out.println("PLAYER CONNECTED: " + ((Player)frame2.getBody()).getNickName());
        }
        System.out.println("Client sent: " +  frame1);
    }
}
