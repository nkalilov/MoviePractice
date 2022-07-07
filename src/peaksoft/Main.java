package peaksoft;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        FindAble findAble=new FindClass();
        SortAble sortAble=new SortClass();

        Director director=new Director("Крис"," Коламбус");
        List<Cast>cast=new ArrayList<>();
        cast.add(new Cast("Дэниел Рэдклифф","Гарри Поттер"));
        cast.add(new Cast("Эмма Уотсон","Гермиона Грейнджер"));

        Director director1=new Director("Эйрос"," Лин");
        List<Cast>cast1=new ArrayList<>();
        cast1.add(new Cast("Бенедикт Камбербэтч","Шерлок Холмс"));
        cast1.add(new Cast("Мартин Фримен","Джон Ватсон"));

        List<Movie>movies=new ArrayList<>();
        movies.add(new Movie("Гарри Поттер",2011,"фильм",director,cast));
        movies.add(new Movie("Шерлок Холмс",2010,"телесериал",director1,cast1));

        findAble.findMovieByName(movies);
        sortAble.sortByYear(movies);
    }
}
