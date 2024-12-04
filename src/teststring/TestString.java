package teststring;

public class TestString {
    public static void main(String[] args) {
        String string1 = new String("Hello World!");
        String string2 = string1;
        String string3 = new String("Hello World!");

        System.out.println("string1 == string2: " + (string1 == string2));
        System.out.println("string1.equals(string2): " + string1.equals(string2));
        System.out.println("string1 == string3: " + (string1 == string3));
        System.out.println("string1.equals(string3): " + string1.equals(string3));

        string1 = string1.substring(6, 11);
        System.out.println("string1 = string1.substring(6,11): " + string1);
        System.out.println("String is immutable, but its reference variable a is not. A new object in memory is created and is assigned a reference string1: " + string1);

        System.out.println(string1.concat(string3));
        string1 = string1 + string3;
        System.out.println(string1);

        System.out.println("________________________");


        /*
        * equals() checks for:
        * the argument object is not null
        * it’s a String object
        * the sequence of characters are identical
        *
        * contentEquals() takes any implementation of CharSequence:
        * String, StringBuffer, StringBuilder, CharBuffer, or Segment can be compared
        */

        String actualString = "foobar";
        String identicalString = "foobar";
        System.out.println(actualString.equals(identicalString));
        System.out.println(actualString.contentEquals(identicalString));

        CharSequence identicalStringInstance = "foobar";
        System.out.println(actualString.equals(identicalStringInstance));
        System.out.println(actualString.contentEquals(identicalStringInstance));

        CharSequence identicalStringBufferInstance = new StringBuffer("foobar");
        System.out.println(actualString.equals(identicalStringBufferInstance));
        System.out.println(actualString.contentEquals(identicalStringBufferInstance));
    }
}