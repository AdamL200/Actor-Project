package blueprints.actor_project;

import jakarta.persistence.*;

@Entity
@Table(name="film")
public class Film {
    @Id
    @Column(name="film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int filmid;

    @Column(name="title")
    String title;
    @Column(name="description")
    String desc;
    @Column(name="language_id")
    int lang_id;

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
