package MovieDB;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

@Entity
public class Movie implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue
    private long id;

    private String title;
    private String releaseDate;
    private String description;
    private int duration; //in seconds
    private int rentSDPrice;
    private int buySDPrice;
    private int rentHDPrice;
    private int buyHDPrice;
    @ElementCollection
    private ArrayList<String> genres;
    @OneToMany(orphanRemoval = true, cascade = CascadeType.PERSIST)
    private ArrayList<Director> directors;
    @OneToMany(orphanRemoval = true, cascade = CascadeType.PERSIST)
    private ArrayList<Character> characters;

    public Movie(){
    }

    public Movie(String title, String releaseDate, String description, int duration,
                 int rentSDPrice, int buySDPrice, int rentHDPrice, int buyHDPrice,
                 ArrayList<String> genres, ArrayList<Director> directors, ArrayList<Character> characters) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.description = description;
        this.duration = duration;
        this.rentSDPrice = rentSDPrice;
        this.buySDPrice = buySDPrice;
        this.rentHDPrice = rentHDPrice;
        this.buyHDPrice = buyHDPrice;
        this.genres = genres;
        this.directors = directors;
        this.characters = characters;
    }

    public Movie(String title, String releaseDate, String description, int duration,
                 int rentSDPrice, int buySDPrice, int rentHDPrice, int buyHDPrice) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.description = description;
        this.duration = duration;
        this.rentSDPrice = rentSDPrice;
        this.buySDPrice = buySDPrice;
        this.rentHDPrice = rentHDPrice;
        this.buyHDPrice = buyHDPrice;
        this.genres = new ArrayList<>();
        this.directors = new ArrayList<>();
        this.characters = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }

    public int getRentSDPrice() {
        return rentSDPrice;
    }

    public int getBuySDPrice() {
        return buySDPrice;
    }

    public int getRentHDPrice() {
        return rentHDPrice;
    }

    public int getBuyHDPrice() {
        return buyHDPrice;
    }

    public ArrayList<String> getGenres() {
        return genres;
    }

    public ArrayList<Director> getDirectors() {
        return directors;
    }

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void addGenre(String genre){
        genres.add(genre);
    }

    public void addDirector(Director director){
        directors.add(director);
    }

    public void addCharacter(Character character){
        characters.add(character);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id == movie.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", rentSDPrice=" + rentSDPrice +
                ", buySDPrice=" + buySDPrice +
                ", rentHDPrice=" + rentHDPrice +
                ", buyHDPrice=" + buyHDPrice +
                ", genres=" + genres +
                ", directors=" + directors +
                ", characters=" + characters +
                '}';
    }
}