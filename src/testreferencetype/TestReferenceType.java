package testreferencetype;

class Parent {
    static String stat = "Parent Static Variable";
    String s = "Parent Variable";

    public static void m1() {
        System.out.println("Parent Static Method");
    }

    public void m2() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    String stat = "Child Static Variable";
    String s = "Child Variable";

    public static void m1() {
        System.out.println("Child Static Method");
    }

    public void m2() {
        System.out.println("Child Method");
    }
}

public class TestReferenceType {
    public static void main(String[] args) {
//      variable and static method resolution is always based on reference type but not based on runtime object
        Parent p = new Child();
        Child c = new Child();

//      reference type is Parent
        System.out.println(p.stat);
        System.out.println(p.s);
//        System.out.println(((Parent) c).s);
        p.m1();
//        ((Parent) c).m1();
        p.m2(); // non-static therefore child method gets called

        System.out.println("_____________________");

//      reference type is Child
        System.out.println(c.stat);
        System.out.println(c.s);
        c.m1();
        c.m2();
    }
}