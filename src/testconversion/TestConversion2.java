package testconversion;

public class TestConversion2 {
    TestConversion2(Integer I) {
        System.out.print(0);
    }

    TestConversion2(int... i) {
        System.out.print(1);
    }

    TestConversion2(double d) {
        System.out.print(2);
    }

    TestConversion2(Object o) {
        System.out.print(3);
    }

    TestConversion2(Double doub) {
        System.out.print(4);
    }

    public static void main(String[] args) {
        new TestConversion2('a');
        new TestConversion2(10);
        new TestConversion2(10.5);
    }
}

/*
While resolving method calls, compiler will always gives the precedence in the following order.
1. Exact Match
2. Widening
3. Auto-Boxing
4. var-arg
new Test('a');==>Exact Match is not there and hence by widening double-arg constructor will get chance.
new Test(10);==>Exact Match is not there and hence by widening double-arg constructor will get chance.
new Test(10.5);===>Exact Match is available and hence by double-arg constructor will get chance.
*/

// https://www.geeksforgeeks.org/type-conversion-java-examples/
// https://miro.medium.com/v2/resize:fit:4800/format:webp/1*GA514JG3qrheTzf4d8DpXA.png