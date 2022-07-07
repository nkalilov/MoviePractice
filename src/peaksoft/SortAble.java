package peaksoft;

import java.util.List;

public interface SortAble {

    void sortByYear(List<Movie> movies);

    void sortByName(List<Movie> movies);

    void sortByDirector(List<Movie> movies);
}
