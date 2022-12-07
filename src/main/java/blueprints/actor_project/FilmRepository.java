package blueprints.actor_project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FilmRepository extends JpaRepository<Film,Integer> {
    @Query(value = "SELECT film.film_id, film.title, actor.actor_id, actor.first_name, actor.last_name from film INNER JOIN film_actor ON film.film_id = film_actor.film_id INNER JOIN actor ON film_actor.actor_id = actor.actor_id", nativeQuery = true)
    Iterable<Object> findFilmActors();

    @Query(value = "SELECT film.film_id, film.title, category.name from film INNER JOIN film_category ON film.film_id = film_category.film_id INNER JOIN category ON film_category.category_id = category.category_id ORDER BY film.film_id", nativeQuery = true)
    Iterable<Object> findFilmCategories();

    @Query(value = "SELECT film.film_id, film.title, film.description FROM film WHERE film.description LIKE %:term%",nativeQuery = true)
    Iterable<Film> findByDescription1(@Param("term") String term);
    @Query(value = "SELECT * FROM film WHERE film.description LIKE %:term%",nativeQuery = true)
    Iterable<Film> findByDescription(@Param("term") String term);
}
