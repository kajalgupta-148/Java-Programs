class MultipleThreads extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(
                Thread.currentThread().getName() + ": " + i
            );
        }
    }

    public static void main(String[] args) {
           MultipleThreads t1 = new MultipleThreads();
        MultipleThreads t2 = new MultipleThreads();
        MultipleThreads t3 = new MultipleThreads();

        t1.start();
        t2.start();
        t3.start();
    }
}