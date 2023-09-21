public class Main {
    public static void main(String[] args) {
        Runnable run1 = new MinhaThread("1", 100, 300);
        Runnable run2 = new MinhaThread("2", 301, 500);
        Runnable run3 = new MinhaThread("3", 501, 700);

        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);
        Thread t3 = new Thread(run3);

        t1.start();
        t2.start();
        t3.start();

    }
}