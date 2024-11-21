package dinners.thanksgiving.application;

import dinners.thanksgiving.domain.Dish;
import java.util.List;
import java.util.Optional;

@SuppressWarnings("ALL")
public interface DishService {
    void addDish(Dish dish, String userName);
    List<Dish> getAllDishes();
    void updateDish(Long id, Dish updatedDish);
    void deleteDish(Long id);
    Optional<Dish> findDishByName(String name);
}