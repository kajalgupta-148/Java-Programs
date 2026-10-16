class RunnableDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable thread is running");
    }

    public static void main(String[] args) {
        RunnableDemo task=new RunnableDemo();
        Thread t1=new Thread(task);
        t1.start();
    }
}