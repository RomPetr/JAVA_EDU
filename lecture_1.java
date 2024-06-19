public class lecture_1 {
    public static void main(String[] args){
        // System.out.println("Hello World!");
        // char ch = 123;
        // System.out.println(ch);
        // System.out.println(getType(ch));
        // var d = 12.45;
        // System.out.println(d);
        // System.out.println(getType(d));
        // int i = 123;
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);
        // String s = "qwer";
        // System.out.println(s.charAt(1));
        // int a = 24;
        // a = --a - a--;
        // System.out.println(a);
        // boolean f = 123 > 234;
        // System.out.println(f);
        // System.out.println(getType(f));
        // String s = "qwer";
        // boolean b = s.length() == 4 && s.charAt(1) == 119;
        // System.out.println(b);
        int[] arr = new int[10];
        System.out.println(arr.length);
        arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(arr.length);
        System.out.println(arr[0]);

    }
    static String getType(Object obj){
        return obj.getClass().getSimpleName();
    }
}

