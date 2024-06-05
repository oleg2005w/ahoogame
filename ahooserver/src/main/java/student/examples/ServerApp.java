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
        List<String> names = new ArrayList<>();
        names.add("James");
        names.add("Anton");
        names.add("James");
        names.add("Oleg");
        names.add("John");

//        names.forEach(System.out::println);
//        names.forEach(name -> System.out.println(name));
//        names.removeIf(name -> (name.charAt(0) == 'J'));
        names.removeIf(new Remove<String>()::test);
        names.forEach(new Printer<String>()::accept);

    }
}
