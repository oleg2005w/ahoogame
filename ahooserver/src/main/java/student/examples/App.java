package student.examples;

public class App {

    public static void main( String[] args )throws Exception {
        Coordinate coordinate = new Coordinate(23,0);
        System.out.println(coordinate);

        Rectangle rectangle = new Rectangle(coordinate);
        System.out.println(rectangle);
    }
}
