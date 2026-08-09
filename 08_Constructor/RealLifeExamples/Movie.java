class Movie {

    String movieName;
    double rating;

    Movie(String m, double r) {
        movieName = m;
        rating = r;
    }

    void display() {
        System.out.println("Movie : " + movieName);
        System.out.println("Rating : " + rating);
    }

    public static void main(String[] args) {
        Movie m1 = new Movie("3 Idiots", 9.2);
        m1.display();
    }
}