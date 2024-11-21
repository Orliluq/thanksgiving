package dinners.thanksgiving.domain.exception;

public class DishNotFoundException extends RuntimeException {

    public DishNotFoundException(Long dishId) {
        super("The dish with ID " + dishId + " was not found.");
    }
}