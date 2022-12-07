package blueprints.actor_project;

import jakarta.persistence.*;

@Entity
@Table(name="Film_actor")
@IdClass(FilmAssociation.class)
public class FilmActor {
    @Id
    @JoinColumn(name = "film_id", referencedColumnName = "film_id")
            @ManyToOne(fetch = FetchType.EAGER)
    Film filmID;
    @Id
    @JoinColumn(name = "actor_id", referencedColumnName = "actor_id")
    @ManyToOne(fetch = FetchType.EAGER)
    Actor actorID;

    public FilmActor(){}

    public Film getFilmID() {
        return filmID;
    }

    public Actor getActorID() {
        return actorID;
    }

    public void setActorID(Actor actorID) {
        this.actorID = actorID;
    }

    public void setFilmID(Film filmID) {
        this.filmID = filmID;
    }
}
