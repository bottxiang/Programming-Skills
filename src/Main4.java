import java.util.*;

public class Main4 {
    public static long c(long n1, long n2) {
        long n3 = n1 ^ n2;
        long t = 0x080000000;
        t &= n3;
        t >>>= 31;
        n3 <<= 1;
        long n4 = n3 | t;
        return n4;
    }
    public static int c2(int n3) {
        int t = 0xE0000000;
        System.out.println("t:" + Integer.toHexString(t));
        t = t & n3;
        System.out.println("t:" + Integer.toHexString(t));
        t >>>= 29;
        System.out.println("t:" + Integer.toHexString(t));
        n3 <<= 3;
        System.out.println("n3:" + Integer.toHexString(n3));
        int n4 = n3 | t;
        System.out.println("n4:" + Integer.toHexString(n4));
        return n4;
    }
    public static long go(List<Integer> list) {
        long result = c(list.get(0), list.get(1));

        for (int i = 2; i < list.size(); i++) {
            result = c(result, list.get(i));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        Map<Integer, List<Integer>> childMap = new HashMap<Integer, List<Integer>>();
        Map<Integer, List<Integer>> fatherMap = new HashMap<Integer, List<Integer>>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (childMap.containsKey(a)) {
                childMap.get(a).add(b);
            } else {
                List<Integer> childList = new ArrayList<>();
                childList.add(b);
                childMap.put(a, childList);
            }
            if (fatherMap.containsKey(b)) {
                fatherMap.get(b).add(a);
            } else {
                List<Integer> fatherList = new ArrayList<>();
                fatherList.add(a);
                fatherMap.put(b, fatherList);
            }
        }
//        for (int i = 1; i <= n; i++) {
//            System.out.print(i+":");
//            if(fatherMap.containsKey(i)) {
//                int len = fatherMap.get(i).size();
//                for (int j = 0; j < len - 1; j++) {
//                    System.out.print(fatherMap.get(i).get(j) + " ");
//                }
//                System.out.print(fatherMap.get(i).get(len-1));
//            }
//            System.out.print(":");
//            if(childMap.containsKey(i)) {
//                int len = childMap.get(i).size();
//                for (int j = 0; j < len - 1; j++) {
//                    System.out.print(childMap.get(i).get(j) + " ");
//                }
//                System.out.print(childMap.get(i).get(len-1));
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= n; i++) {
            list.add(i);
            //System.out.print(i+":");
            if(fatherMap.containsKey(i)) {
                int len = fatherMap.get(i).size();
                for (int j = 0; j < len - 1; j++) {
                    list.add(fatherMap.get(i).get(j));
                    //System.out.print(fatherMap.get(i).get(j) + " ");
                }
                list.add(fatherMap.get(i).get(len-1));
                //System.out.print(fatherMap.get(i).get(len-1));
            }
            //System.out.print(":");
            if(childMap.containsKey(i)) {
                int len = childMap.get(i).size();
                for (int j = 0; j < len - 1; j++) {
                    list.add(childMap.get(i).get(j));
                    //System.out.print(childMap.get(i).get(j) + " ");
                }
                list.add(childMap.get(i).get(len-1));
                //System.out.print(childMap.get(i).get(len-1));
            }
            //System.out.println();
        }
        System.out.println(go(list));

    }
}
