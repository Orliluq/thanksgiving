package dinners.thanksgiving.api;

import dinners.thanksgiving.application.DishService;
import dinners.thanksgiving.domain.Dish;
import dinners.thanksgiving.application.dto.DishRequestDTO;
import dinners.thanksgiving.application.dto.DishResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/dishes")
public class DishController {

    private final DishService dishService;

    @Autowired
    public DishController(DishService dishService) {
        this.dishService = dishService;
    }

    @PostMapping
    public ResponseEntity<DishResponseDTO> addDish(@Valid @RequestBody DishRequestDTO dishRequestDTO, @RequestParam String userName) {
        Dish newDish = new Dish(dishRequestDTO.getName(), dishRequestDTO.getType(), dishRequestDTO.getChefName(), userName);
        dishService.addDish(newDish, userName);
        DishResponseDTO response = new DishResponseDTO(newDish.getId(), newDish.getName(), newDish.getType(), newDish.getChefName(), newDish.getUserName());
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public List<Dish> getAllDishes() {
        return dishService.getAllDishes();
    }

    @PutMapping("/{id}")
    public ResponseEntity<DishResponseDTO> updateDish(@PathVariable Long id, @Valid @RequestBody DishRequestDTO dishRequestDTO, @RequestParam String userName) {
        Dish updatedDish = new Dish(dishRequestDTO.getName(), dishRequestDTO.getType(), dishRequestDTO.getChefName(), userName);
        dishService.updateDish(id, updatedDish);
        DishResponseDTO response = new DishResponseDTO(id, updatedDish.getName(), updatedDish.getType(), updatedDish.getChefName(), updatedDish.getUserName());
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDish(@PathVariable Long id) {
        dishService.deleteDish(id);
        return ResponseEntity.noContent().build();
    }
}