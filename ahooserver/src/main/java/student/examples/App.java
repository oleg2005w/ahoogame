package student.examples;

public class App {

    public static void main( String[] args )throws Exception {
        TV tv1 = new TV(42);
        Frige frige1 = new Frige(214);
        Laptop laptop = new Laptop(12121);

        tv1.switchOn();
        tv1.standBy();
        frige1.switchOn();
        laptop.standBy();

        System.out.println(tv1);
        System.out.println(frige1);
        System.out.println(laptop);

        PowerMode powerMode = PowerMode.ON;
        System.out.println(powerMode.ordinal());
        System.out.println(PowerMode.values()[1]);

    }
}
