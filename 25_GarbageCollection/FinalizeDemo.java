class MyObject {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
    }
}

public class FinalizeDemo {
    public static void main(String[] args)
            throws InterruptedException {

        MyObject obj = new MyObject();

        obj = null;

        System.gc();

        Thread.sleep(1000);

        System.out.println("Main method completed");
    }
}