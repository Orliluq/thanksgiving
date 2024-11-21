package dinners.thanksgiving.application;

import dinners.thanksgiving.domain.Dish;
import dinners.thanksgiving.domain.exception.DishNotFoundException;
import dinners.thanksgiving.infrastructure.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DishServiceImpl implements DishService {

    private final DishRepository dishRepository;

    @Autowired
    public DishServiceImpl(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    @Override
    public void addDish(Dish dish, String userName) {
        dish.setUserName(userName);
        dishRepository.save(dish);
    }

    @Override
    public List<Dish> getAllDishes() {
        return dishRepository.findAll();
    }

    @Override
    public void updateDish(Long id, Dish updatedDish) {
        Dish dish = dishRepository.findById(id)
                .orElseThrow(() -> new DishNotFoundException(id));
        dish.setName(updatedDish.getName());
        dish.setType(updatedDish.getType());
        dish.setChefName(updatedDish.getChefName());
        dish.setUserName(updatedDish.getUserName());
        dishRepository.save(dish);
    }

    @Override
    public void deleteDish(Long id) {
        Dish dish = dishRepository.findById(id)
                .orElseThrow(() -> new DishNotFoundException(id));
        dishRepository.delete(dish);
    }

    @Override
    public Optional<Dish> findDishByName(String name) {
        return dishRepository.findByName(name);
    }
}