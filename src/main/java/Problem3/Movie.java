package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    public Movie(String rating, String title) {
        this.id = UUID.randomUUID();
        // homework
        this.rating = rating;
        this.title = title;
    }

    public Movie(Movie anotherMovie) {
        // homework
        rating = anotherMovie.rating;
        title = anotherMovie.title;
        id = anotherMovie.id;
    }

    @Override
    public boolean equals(Object obj) {
        // homework
        Movie otherMovie = (Movie) obj;
        return id.equals(otherMovie.id);
    }
}
