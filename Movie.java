package java_module.collections.question.TreeSetAndComparatorExercise;

import java.math.BigDecimal;
import java.util.Objects;

public class Movie implements Comparable<Movie> {
    /*
        Do not modify the attributes, constructor, getters and toString() method

        Week4 Day2 21:00
     */
    private final String title;
    private final int year;
    private final BigDecimal rating;

    public Movie(String title, int year, BigDecimal rating) {
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public BigDecimal getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return year == movie.year && title.equals(movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year);
    }

    @Override
    public int compareTo(Movie o) {
        // TODO: implement this method
        // The natural ordering: title > year > rating
        int result = title.compareTo(o.getTitle());
        if (result != 0)
            return result;

        result = Integer.compare(year, o.year);
        if (result != 0)
            return result;

        return rating.compareTo(o.rating);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                '}';
    }
}
