package student.examples;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class ServerApp {

    public static void main( String[] args )throws Exception {
        ServerSocket serverSocket = new ServerSocket(10001);

        Map<String, Object> playerSocketMap = new HashMap<>();

        playerSocketMap.put("socket", new Socket("localhost", 10001));
        playerSocketMap.put("player", new Player("jimmy", 0));

        System.out.println(playerSocketMap.size());
        System.out.println(playerSocketMap.get("socket"));
        System.out.println(playerSocketMap.get("jimmy"));
        System.out.println(playerSocketMap.get("player"));

        playerSocketMap.forEach(ServerApp::printPair);
    }
    public static void printPair(String key, Object value){
        System.out.println(key + " : " + value);
    }
}
