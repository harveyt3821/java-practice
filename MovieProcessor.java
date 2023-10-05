package java_module.collections.question.TreeSetAndComparatorExercise;

import java.util.*;

public class MovieProcessor {

    /*
        Create a comparator that sorts the elements in this order: title > year > rating
     */
    public static Set<Movie> sortByNaturalOrdering(Movie[] movies) {
        // TODO: implement this method
        return new TreeSet<>(Arrays.asList(movies));
    }

    /*
        Create a comparator that sorts the elements in this order: year > title > rating
     */
    public static Set<Movie> sortByYearAndTitleAndRating(Movie[] movies) {
        // TODO: implement this method
        Comparator<Movie> comparator = new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                int result = Integer.compare(o1.getYear(), o2.getYear());
                if (result != 0) return result;

                result = o1.getTitle().compareTo(o2.getTitle());
                if (result != 0) return result;

                return o1.getRating().compareTo(o2.getRating());
            }
        };

        Set<Movie> resultSet = new TreeSet<>(comparator);
        Collections.addAll(resultSet, movies);

        return resultSet;
    }

    /*
        Create a comparator that sorts the elements in this order: rating > title > year
     */
    public static Set<Movie> sortByRatingAndTitleAndYear(Movie[] movies) {
        // TODO: implement this method

        Comparator<Movie> sortByRatingThanTitleThanYear_Comparator =
                Comparator.comparing(Movie::getRating).
                        thenComparing(Movie::getTitle).
                        thenComparingInt(Movie::getYear);

//        Comparator<Movie> sortByRatingThanTitleThanYear_Comparator = new Comparator<Movie>() {
//            @Override
//            public int compare(Movie o1, Movie o2) {
//                int result = o1.getRating().compareTo(o2.getRating());
//                if (result != 0) return result;
//
//                result = o1.getTitle().compareTo(o2.getTitle());
//                if (result != 0) return result;
//
//                return Integer.compare(o1.getYear(), o2.getYear());
//            }
//        };

        Set<Movie> resultSet = new TreeSet<>(sortByRatingThanTitleThanYear_Comparator);
        Collections.addAll(resultSet, movies);

        return resultSet;
    }
}
