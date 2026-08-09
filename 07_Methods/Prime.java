class Prime {

    boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Prime obj = new Prime();

        if (obj.isPrime(17))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}