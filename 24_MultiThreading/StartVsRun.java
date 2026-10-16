class StartVsRun extends Thread {
    @Override
    public void run() {
        System.out.println(
            "Executing in: " + Thread.currentThread().getName()
        );
    }

    public static void main(String[] args) {
        StartVsRun t1 = new StartVsRun();

        t1.run();
        t1.start();
    }
}