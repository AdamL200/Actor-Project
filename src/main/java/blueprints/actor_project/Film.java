package blueprints.actor_project;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="film")
public class Film {
    @Id
    @Column(name="film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int filmid;

    @ManyToMany
    @JoinTable(
            name="film_actor",
            joinColumns=@JoinColumn(name="film_id", referencedColumnName="film_id"),
            inverseJoinColumns=@JoinColumn(name="actor_id", referencedColumnName="actor_id"))
    private List<Actor> actors;
    @Column(name="title")
    String title;
    @Column(name="description")
    String desc;
    @Column(name="language_id")
    int lang_id;

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @Column(name="release_year")
    int year;

    @Column(name="length")
    int film_len;

    @Column(name="rental_rate")
    double rate;

    @Column(name="rating")
    String rating;

    public int getFilmid() {
        return filmid;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getLang_id() {
        return lang_id;
    }

    public void setLang_id(int lang_id) {
        this.lang_id = lang_id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return film_len;
    }

    public void setLength(int length) {
        this.film_len = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFilmid(int filmid) {
        this.filmid = filmid;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getDesc() {
        return desc;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }


    public Film(){}
}
