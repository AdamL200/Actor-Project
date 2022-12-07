package blueprints.actor_project;

import jakarta.persistence.*;

import java.io.Serializable;


public class FilmAssociation implements Serializable {

    Film filmID;

    Actor actorID;

    public FilmAssociation(){}

}