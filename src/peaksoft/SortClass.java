package peaksoft;

import java.util.List;


public class SortClass implements SortAble {

    @Override
    public void sortByYear(List<Movie> movies) {
        MovieYearComparator yearComparator = new MovieYearComparator();
        movies.sort(yearComparator);
        for (Movie movie : movies) {
            System.out.println("Год: " + movie.getYear());
            System.out.println("Фильм: " + movie.getName());
            System.out.println("Описание: " + movie.getDescription());
            System.out.println("Директор: " + movie.getDirector().getName() + " " + movie.getDirector().getLastName());
            System.out.println("=== Каст: " + movie.getName() + " ===");
            for (Cast c : movie.getCast()) {
                System.out.println("Актер: " + c.getActor());
                System.out.println("Роль: " + c.getRole());
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }

    }

    @Override
    public void sortByName(List<Movie> movies) {
        MovieNameComparator nameComparator = new MovieNameComparator();
        movies.sort(nameComparator);
        for (Movie movie : movies) {
            System.out.println("Фильм: " + movie.getName());
            System.out.println("Год: " + movie.getYear());
            System.out.println("Описание: " + movie.getDescription());
            System.out.println("Директор: " + movie.getDirector().getName() + " " + movie.getDirector().getLastName());
            System.out.println("=== Каст: " + movie.getName() + " ===");
            for (Cast c : movie.getCast()) {
                System.out.println("Актер: " + c.getActor());
                System.out.println("Роль: " + c.getRole());
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }

    @Override
    public void sortByDirector(List<Movie> movies) {
        MovieDirectorComparator movieDirectorComparator = new MovieDirectorComparator();
        movies.sort(movieDirectorComparator);
        for (Movie movie : movies) {
            System.out.println("Директор: " + movie.getDirector().getName() + " " + movie.getDirector().getLastName());
            System.out.println("Фильм: " + movie.getName());
            System.out.println("Год: " + movie.getYear());
            System.out.println("Описание: " + movie.getDescription());
            System.out.println("=== Каст: " + movie.getName() + " ===");
            for (Cast c : movie.getCast()) {
                System.out.println("Актер: " + c.getActor());
                System.out.println("Роль: " + c.getRole());
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}