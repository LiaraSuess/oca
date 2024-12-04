package testdefaultvalues;

public class TestDefaultValues {
    static int fieldInt;
    static boolean fieldBool;
    boolean nonStaticFieldBool;

    public static void main(String[] args) {
        int localVarInt = 0; // needs initialization

        System.out.println(fieldInt);
        System.out.println(localVarInt);

        boolean localVarBool = false; // needs initialization
        System.out.println(fieldBool);
        System.out.println(localVarBool);

        TestDefaultValues t = new TestDefaultValues();
        System.out.println(t.nonStaticFieldBool);
    }
}
