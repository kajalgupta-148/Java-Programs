class ThreadJoinDemo extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Child thread: " + i);
        }
    }

    public static void main(String[] args) {
        ThreadJoinDemo t1 = new ThreadJoinDemo();
        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

        System.out.println("Main thread continues");
    }
}