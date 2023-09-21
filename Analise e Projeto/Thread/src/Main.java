public class Main {
    public static void main(String[] args) {
        Runnable r1 = new MinhaThread("1", 100, 300);
        Runnable r2 = new MinhaThread("2", 301, 500);
        Runnable r3 = new MinhaThread("3", 501, 700);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();

    }
}