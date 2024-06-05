package student.examples;

public class App {

    public static void main( String[] args )throws Exception {
        TV tv1 = new TV(42);
        Frige frige1 = new Frige(214);

        tv1.switchOn();
        tv1.standBy();
        frige1.switchOn();

        System.out.println(tv1);
        System.out.println(frige1);
    }
}
