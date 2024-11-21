package dinners.thanksgiving.infrastructure;

import dinners.thanksgiving.domain.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

@SuppressWarnings("ALL")
public interface DishRepository extends JpaRepository<Dish, Long> {

    @Override
    Optional<Dish> findById(Long id);

    Optional<Dish> findByName(String name);
}
