package dinners.thanksgiving.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("ALL")
@Getter
@Setter
@Entity
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "The name of the dish is mandatory")
    @Size(max = 100, message = "The dish name cannot exceed 100 characters")
    private String name;

    @NotNull(message = "The type of dish is mandatory")
    @Enumerated(EnumType.STRING)
    private DishType type;

    @NotBlank(message = "The chef's name is required")
    @Size(max = 50, message = "The chef's name cannot exceed 50 characters")
    private String chefName;

    @NotBlank(message = "Username is required")
    @Size(max = 50, message = "Username cannot exceed 50 characters")
    private String userName;

    // Constructor vacío (para JPA)
    public Dish() {}

    public Dish(String name, DishType type, String chefName, String userName) {
        this.name = name;
        this.type = type;
        this.chefName = chefName;
        this.userName = userName;
    }
}
