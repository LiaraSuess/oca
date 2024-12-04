public class Test {
    public static void main(String[] args) {
        final boolean flag = false;
        if(flag) {
            System.out.println("Good Morning!");
        }
    }
}

//public class Test {
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 30};
//        int i = 0;
//        arr[i++] = arr[++i] = 40;
//        for (int x : arr)
//            System.out.println(x);
//    }
//}

//public class Test {
//    public static void main(String[] args) {
//        String[] arr1, arr2, arr3 = {"1","47"}; //Line n1
//        arr1 = new String[2];
//        arr1[0] = "A";
//        arr1[1] = "B";
//        arr2 = arr1 = arr3; //Line n2
//        log(arr2); //Line n3
//    }
//
//    private static void log(String... vals) {
//        for(String s : vals)
//            System.out.print(s);
//    }
//}