package thread;

public class Counter {
    private int count = 0;

    public void inc() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        synchronized (this) {
            return count;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread[] threads = new Thread[1000];
        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        counter.inc();
                    }
                }
            });
            threads[i].start();
        }

        for (int i = 0; i < 1000; i++) {
            threads[i].join();
        }
        System.out.println(counter.getCount());
    }
}
