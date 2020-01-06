package container;

import java.util.ArrayList;

class Apple {
    private static long counter;
    private final long id = counter++;
    public long id() { return id; }
}

class Orange { }

public class ApplesAndOrangesWithoutGenerics {
   //@SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList<>();
        apples.add(new Orange());
        for(int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        apples.add(new Orange());
        System.out.println("total objects:" + apples.size());
        for (Object apple : apples) {
            if (apple instanceof Apple) {
                long id = ((Apple) apple).id();
                System.out.println(id);
            } else
                System.out.println("this is an orange");

        }
    }
}
