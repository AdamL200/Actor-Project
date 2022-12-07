package blueprints.actor_project;

import jakarta.persistence.*;

@Entity
@Table(name="film_category")
@IdClass(FilmCategoryID.class)
public class FilmCategory {
    @Id
    @JoinColumn(name = "film_id", referencedColumnName = "film_id")
    @ManyToOne(fetch = FetchType.EAGER)
    Film filmID;
    @Id
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    @ManyToOne(fetch = FetchType.EAGER)
    Category catID;

    public FilmCategory(){}

    public Film getFilmID() {
        return filmID;
    }

    public Category getCatID() {
        return catID;
    }

    public void setCatID(Category catID) {
        this.catID = catID;
    }

    public void setFilmID(Film filmID) {
        this.filmID = filmID;
    }
}
