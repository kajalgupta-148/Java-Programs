class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Current thread: " + t.getName());
        System.out.println("Thread ID: " + t.threadId());
        System.out.println("Thread priority: " + t.getPriority());
    }
}