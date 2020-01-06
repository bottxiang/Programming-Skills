package string;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        String s = new String("this is string");
//      StringTest.changeString(s);
        System.out.println(s);
        StringBuilder sb = new StringBuilder("java");
        System.out.println("length:" + sb.length() + " capacity:" + sb.capacity());
        sb.setLength(5);
        sb.trimToSize();
        System.out.println("length:" + sb.length() + " capacity:" + sb.capacity());
//
        String s1 = "a";
        String s2 = "a";
        String s3 = new String();
        String s4 = new String();
        String s5="b";
        String[] arr = s5.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(s1.compareTo(s5));
    }
    public static void changeString(String s) {
        s = "changed string";
    }
}
