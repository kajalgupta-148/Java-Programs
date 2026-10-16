class ThreadClassDemo extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        ThreadClassDemo t1 = new ThreadClassDemo();
        t1.start();
    }
}