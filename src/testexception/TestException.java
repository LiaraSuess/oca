package testexception;

import java.io.FileNotFoundException;
import java.io.IOException;

class Base {
    Base() throws IOException {
        System.out.print(1);
    }

    Base(int i) throws FileNotFoundException {
        System.out.print(2);
    }
}

class Derived extends Base {
    // constructors must throw its parent's exception or the parent's exception parent
    // methods can also use the child exception
    Derived() throws IOException {
        System.out.print(3);
    }

    Derived(int i) throws IOException {
        super(i);
        System.out.print(3);
    }
}

public class TestException {
    static void foo() throws IOException, RuntimeException, Exception {
        if (true) {
            throw new RuntimeException("LENGTH SHOULD BE GREATER THAN 0");
        }
        throw new IllegalArgumentException("Foo");
    }

    public static void main(String[] args) {
        try {
            foo();
        // multi-catch must be disjoint e.g. can't have RuntimeException and Exception in one multi-catch
        } catch (IOException | RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}