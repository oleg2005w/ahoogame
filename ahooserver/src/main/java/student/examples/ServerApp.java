package student.examples;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Hello world!
 *
 */
public class ServerApp {

    public static void main( String[] args )throws Exception {
        List<Player> players = new ArrayList<>();
        players.add(new Player("jimmy", 0));
        players.add(new Player("marry", 10));
        players.add(new Player("peter", 100));
        players.forEach(ServerApp::printPair);

        myUselessForEach(System.out::println);
    }
    public static void printPair(Player player){
        System.out.println(player);
    }
    public static void myUselessForEach(Consumer<Object> cb){
        cb.accept("This is test");
    }
}
