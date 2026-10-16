class MultipleRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(
                Thread.currentThread().getName() + ": " + i
            );
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MultipleRunnable(), "Thread 1");
        Thread t2 = new Thread(new MultipleRunnable(), "Thread 2");
        Thread t3 = new Thread(new MultipleRunnable(), "Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}