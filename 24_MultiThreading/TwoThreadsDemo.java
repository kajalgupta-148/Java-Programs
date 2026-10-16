class TwoThreadsDemo extends Thread {
    private String taskName;

    TwoThreadsDemo(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(taskName + ": " + i);
        }
    }

    public static void main(String[] args) {
        TwoThreadsDemo t1 = new TwoThreadsDemo("Task A");
        TwoThreadsDemo t2 = new TwoThreadsDemo("Task B");

        t1.start();
        t2.start();
    }
}