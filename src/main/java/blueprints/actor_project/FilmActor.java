/*package blueprints.actor_project;

import jakarta.persistence.*;

@Entity
@Table(name="Film_actor")
@IdClass(FilmAssociation.class)
public class FilmActor {
    @Id
    private long actorId;
    @Id
    private long filmId;
    //@Column(name="IS_PROJECT_LEAD")
    //private boolean isProjectLead;
    @ManyToOne
    @PrimaryKeyJoinColumn(name="actor_id", referencedColumnName="actor_id")
    private Actor actor;

    @ManyToOne
    @PrimaryKeyJoinColumn(name="film_id", referencedColumnName="film_id")
    private Film film;
}*/
