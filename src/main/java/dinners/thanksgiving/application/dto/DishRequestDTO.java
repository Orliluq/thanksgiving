package dinners.thanksgiving.application.dto;

import dinners.thanksgiving.domain.DishType;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DishRequestDTO {

    @NotBlank(message = "The name of the dish is mandatory")
    @Size(max = 100, message = "The dish name cannot exceed 100 characters")
    private String name;

    @NotNull(message = "The type of dish is mandatory")
    private DishType type;

    @NotBlank(message = "The chef's name is required")
    @Size(max = 50, message = "The chef's name cannot exceed 50 characters")
    private String chefName;
}
