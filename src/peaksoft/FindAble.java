package peaksoft;

import java.util.List;

public interface FindAble {

    void findMovieByName(List<Movie> movies);

    void findMovieByActor(List<Movie>movies);

    void findMovieDirector(List<Movie>movies);

    void findMoviesByYear(List<Movie> movies);

    void findMovieByRole(List<Movie> movies);


}
