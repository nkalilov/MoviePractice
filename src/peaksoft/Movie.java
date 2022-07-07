package peaksoft;

import java.util.List;

public class Movie {
    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> cast;

    public Movie(String name, int year, String description, Director director, List<Cast> cast) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.cast = cast;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }

    public String getDescription() {
        return this.description;
    }

    public Director getDirector() {
        return this.director;
    }

    public List<Cast> getCast() {
        return this.cast;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Movie)) return false;
        final Movie other = (Movie) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.getYear() != other.getYear()) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$director = this.getDirector();
        final Object other$director = other.getDirector();
        if (this$director == null ? other$director != null : !this$director.equals(other$director)) return false;
        final Object this$cast = this.getCast();
        final Object other$cast = other.getCast();
        if (this$cast == null ? other$cast != null : !this$cast.equals(other$cast)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Movie;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + this.getYear();
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $director = this.getDirector();
        result = result * PRIME + ($director == null ? 43 : $director.hashCode());
        final Object $cast = this.getCast();
        result = result * PRIME + ($cast == null ? 43 : $cast.hashCode());
        return result;
    }

    public String toString() {
        return "Movie(name=" + this.getName() + ", year=" + this.getYear() + ", description=" + this.getDescription() + ", director=" + this.getDirector() + ", cast=" + this.getCast() + ")";
    }
}
