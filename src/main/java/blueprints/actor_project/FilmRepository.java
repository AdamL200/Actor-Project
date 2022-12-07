package blueprints.actor_project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FilmRepository extends JpaRepository<Film,Integer> {
    @Query(value = "SELECT film.film_id, film.title, actor.actor_id, actor.first_name, actor.last_name from film INNER JOIN film_actor ON film.film_id = film_actor.film_id INNER JOIN actor ON film_actor.actor_id = actor.actor_id", nativeQuery = true)
    Iterable<Object> findFilmActors();
}
