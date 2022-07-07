package peaksoft;

import java.util.List;
import java.util.Scanner;

public class FindClass implements FindAble {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void findMovieByName(List<Movie> movies) {
        System.out.println("Введите название фильма: ");
        String name = scanner.nextLine();
        for (Movie m : movies) {
            if (m.getName().equals(name)) {
                System.out.println("Фильм: " + m.getName());
                System.out.println("Год: " + m.getYear());
                System.out.println("Описание: " + m.getDescription());
                System.out.println("Директор: " + m.getDirector());
                System.out.println("=== Каст: " + m.getName() + " ===");
                for (Cast cast : m.getCast()) {
                    System.out.println("Актер: " + cast.getActor());
                    System.out.println("Роль: " + cast.getRole());
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }

    @Override
    public void findMovieByActor(List<Movie> movies) {
        System.out.println("Введите имя актера: ");
        String name = scanner.nextLine();
        for (Movie movie : movies) {
            for (Cast cast : movie.getCast()) {
                String[] fullName = cast.getActor().split(" ");
                if (cast.getActor().equals(name) || fullName[0].equals(name) || fullName[1].equals(name)) {
                    System.out.println("Фильм: " + movie.getName());
                    System.out.println("Год: " + movie.getYear());
                    System.out.println("Описание: " + movie.getDescription());
                    System.out.println("Директор: " + movie.getDirector());
                    System.out.println("=== Каст: " + movie.getName() + " ===");
                    System.out.println("Актер: " + cast.getActor());
                    System.out.println("Роль: " + cast.getActor());
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
            }
        }
    }

    @Override
    public void findMovieDirector(List<Movie> movies) {
        System.out.println("Введите имя директора: ");
        String name = scanner.nextLine();
        for (Movie movie : movies) {
            if (movie.getDirector().getName().equals(name) || movie.getDirector().getLastName().equals(name) ||
                    name.equals(movie.getDirector().getName() + " " + movie.getDirector().getLastName())) {
                System.out.println("Директор: " + movie.getDirector());
                System.out.println("Фильм: " + movie.getName());
                System.out.println("Год: " + movie.getYear());
                System.out.println("Описание: " + movie.getDescription());
                System.out.println("=== Каст: " + movie.getName() + " ===");
                for (Cast cast : movie.getCast()) {
                    System.out.println("Актер: " + cast.getActor());
                    System.out.println("Роль: " + cast.getRole());
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }

    @Override
    public void findMoviesByYear(List<Movie> movies) {
        System.out.println("Напишите год выпуска фильма: ");
        int year = scanner.nextInt();
        for (Movie movie : movies) {
            if (movie.getYear() == year) {
                System.out.println("Год: " + movie.getYear());
                System.out.println("Директор: " + movie.getDirector());
                System.out.println("Описание: " + movie.getDescription());
                System.out.println("Фильм: " + movie.getName());
                System.out.println("=== Каст: " + movie.getName() + " ===");
                for (Cast cast : movie.getCast()) {
                    System.out.println("Актер: " + cast.getActor());
                    System.out.println("Роль: " + cast.getRole());
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        System.out.println("Введите роль: ");
        String role = scanner.nextLine();
        for (Movie movie : movies) {
            for (Cast cast : movie.getCast()) {
                if (cast.getRole().equals(role)) {
                    System.out.println("=== Каст: " + movie.getName() + " ===");
                    System.out.println("Роль: " + cast.getActor());
                    System.out.println("Актер: " + cast.getActor());
                    System.out.println("Фильм: " + movie.getName());
                    System.out.println("Год: " + movie.getYear());
                    System.out.println("Описание: " + movie.getDescription());
                    System.out.println("Директор: " + movie.getDirector());
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                }
            }
        }
    }

}
