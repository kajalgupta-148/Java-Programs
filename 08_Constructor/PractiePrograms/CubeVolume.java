class CubeVolume {

    int side;

    CubeVolume(int s) {
        side = s;
    }

    void calculateVolume() {
        int volume = side * side * side;
        System.out.println("Volume of Cube = " + volume);
    }

    public static void main(String[] args) {

        CubeVolume c1 = new CubeVolume(5);
        c1.calculateVolume();
    }
}