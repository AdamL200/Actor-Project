package blueprints.actor_project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CityRepository extends JpaRepository<City,Integer> {
    @Query(
            value = "SELECT * FROM city WHERE first_name LIKE 'J%'",
            nativeQuery = true)
    Iterable<City> findCitiesJ();
}

