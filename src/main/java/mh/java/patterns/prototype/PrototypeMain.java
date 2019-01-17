package mh.java.patterns.prototype;

public class PrototypeMain {

    public static void main(String[] args) {
        Registry reg = new Registry();

        Movie movie = (Movie) reg.createItem("Movie");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getURL());

        Movie anotherMovie = (Movie) reg.createItem("Movie");
        movie.setTitle("Gang of God");

        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getURL());

    }
}
