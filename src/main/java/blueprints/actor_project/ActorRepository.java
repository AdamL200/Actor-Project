package blueprints.actor_project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ActorRepository extends JpaRepository<Actor,Integer> {
    @Query(
            value = "SELECT * FROM actor WHERE first_name LIKE 'J%'",
            nativeQuery = true)
    Iterable<Actor> findActorsJ();
}
