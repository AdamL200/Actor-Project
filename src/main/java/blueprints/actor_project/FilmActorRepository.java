/*package blueprints.actor_project;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FilmActorRepository extends JpaRepository<FilmActor,Integer> {
    @Query(
            value = "SELECT * FROM city WHERE first_name LIKE 'J%'",
            nativeQuery = true)
    Iterable<FilmActor> findfilmactorsJ();
}*/