package testconversion;

public class TestConversion {
    public static void m1(int x) {
        System.out.print("int");
    }

    public static void m1(long l) {
        System.out.print("long");
    }

    public static void m1(float f) {
        System.out.print("float");
    }

    public static void m1(Object o) {
        System.out.print("Object");
    }

    public static void m1(Number n) {
        System.out.print("Object");
    }

    public static void main(String[] args) {
//      char->int
        m1('a');
//      boolean->Boolean->Object
        m1(true);
//      double->Double->Object
        m1(10.5);
    }
}