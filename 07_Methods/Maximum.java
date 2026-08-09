class Maximum {

    int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Maximum obj = new Maximum();
        System.out.println("Maximum = " + obj.max(40, 25));
    }
}