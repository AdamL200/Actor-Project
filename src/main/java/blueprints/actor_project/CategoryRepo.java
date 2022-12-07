package blueprints.actor_project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CategoryRepo extends JpaRepository<Category,Integer> {
    @Query(value = "SELECT * FROM film INNER JOIN category WHERE category.name = :category",nativeQuery = true)
    Iterable<Object> findAllFromCategory(@Param("category") String category);
}
