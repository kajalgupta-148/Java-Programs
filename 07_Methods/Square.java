class Square {

    int findSquare(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Square obj = new Square();
        int result = obj.findSquare(6);
        System.out.println("Square = " + result);
    }
}