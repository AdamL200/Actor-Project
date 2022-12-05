/*package blueprints.actor_project;

import jakarta.persistence.*;

import java.io.Serializable;


public class FilmAssociation implements Serializable {

    private long actorId;

    private long filmId;

    public int hashCode() {
        return (int)(actorId + filmId);
    }

    public boolean equals(Object object) {
        if (object instanceof FilmAssociation) {
            FilmAssociation otherId = (FilmAssociation) object;
            return (otherId.actorId == this.actorId) && (otherId.filmId == this.filmId);
        }
        return false;
    }

}*/