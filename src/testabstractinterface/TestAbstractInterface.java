package testabstractinterface;

interface InterfA {
    // interface variables are called fields
    // public, final & static are redundant - interface fields always implicitly have those modifiers
    // private & protected are not allowed
    public final static int field1 = 1;

    // public & abstract are redundant - interface methods always implicitly have those modifiers
    // private, protected & final are not allowed
    public abstract void method1();

    // a body is mandatory for static methods
    static void methodStatic() {
    }

    ;

    // multiple default methods can be implemented in a single interface
    // same rules as for other interface methods, but CANNOT be abstract
    public default void defaultMethod() {
        System.out.println("I'm a default method, which means I'm automatically available" +
                " in the classes where my interface is implemented");
    }

    // constructor is NOT allowed
    // InterfA {}
}

interface InterfB {
    int field1 = 10;
}

interface InterfC {
    int field1 = 20;
    int field2 = 40;
    int field3 = 60;
}

// interfaces can extend any number of interfaces
interface InterfD extends InterfB, InterfC {
    // InterfB.field1, InterfC.field1 & InterfC.field2 cannot be reassigned because they are implicitly final, but they
    // seem to be overridden completely in the following statements
    int field1 = 30;
    int field2 = 50;
    // InterfC.field3 is implicitly available
}

abstract class Foo {
    // legal variable modifiers
    private int priv = 100;
    protected int prot = 101;
    public int pub = 102;
    static int stat = 103;
    final int fin = 104;

    // constructors are allowed
    Foo() {
        this.priv = 20;
    }

    Foo(int i) {
        this.priv = this.priv + i;
    }

    // implicitly public
    abstract void method2();

    // explicitly public
    public abstract void method3();
}

// a class can extend ATMOST 1 class
// a class can implement ANY NUMBER of interfaces
public class TestAbstractInterface extends Foo implements InterfA, InterfD {
    // method implementation from interface needs to be explicitly public
    public void method1() {
        System.out.println("method1() from InterfA");

        // field1 needs to be accessed in the following way, since both InterfA & InterfD implement it
        System.out.println("InterfA field1 = " + InterfA.field1);
        System.out.println("InterfD field1 = " + InterfD.field1);
        System.out.println("InterfD field2 = " + InterfD.field2);
        System.out.println("InterfD field3 = " + InterfD.field3);
        // InterfB & InterfC fields still can be accessed in the following way, but their values are overridden
        System.out.println("InterfB field1 = " + InterfD.field1);
        System.out.println("InterfC field1 = " + InterfD.field1);
    }

    // implicitly public parent class method - public modifier IS NOT mandatory
    void method2() {
    }

    // explicitly public parent class method - public modifier IS mandatory
    public void method3() {
    }

    public static void main(String[] args) {
        TestAbstractInterface t = new TestAbstractInterface();
        t.method1();

        // by default not available to the implementation class - called by using the interface name
        InterfA.methodStatic();

        t.defaultMethod();
    }
}