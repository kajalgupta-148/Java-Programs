class ThreadNameDemo extends Thread {
    @Override
    public void run() {
        System.out.println("Thread name: " + getName());
    }

    public static void main(String[] args) {
        ThreadNameDemo t1 = new ThreadNameDemo();

        t1.setName("Java Thread");
        t1.start();
    }
}