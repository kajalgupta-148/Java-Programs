public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Java");

        System.out.println("String: " + sb);
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        sb.append(" Programming");

        System.out.println("After append: " + sb);
    }
} 