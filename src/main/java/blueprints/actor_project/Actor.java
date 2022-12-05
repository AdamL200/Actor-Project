package blueprints.actor_project;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="actor")
public class Actor {
    @Id
    @Column(name="actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int actorid;

    @Column(name="first_name")
    String firstname;

    @Column(name="last_name")
    String lastname;

    @ManyToMany(mappedBy="actors")
    @JsonIgnore
    private List<Film> films;
    public int getActorid() {
        return actorid;
    }

    public void setActorid(int actorid) {
        this.actorid = actorid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Actor(){}
}
