class ThreadPriorityDemo extends Thread {
    @Override
    public void run() {
        System.out.println(
            getName() + " Priority: " + getPriority()
        );
    }

    public static void main(String[] args) {
        ThreadPriorityDemo t1 = new ThreadPriorityDemo();
        ThreadPriorityDemo t2 = new ThreadPriorityDemo();

        t1.setName("Low Priority");
        t2.setName("High Priority");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}