package dinners.thanksgiving.application.dto;

import dinners.thanksgiving.domain.DishType;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DishResponseDTO {
    private Long id;
    private String name;
    private DishType type;
    private String chefName;
    private String userName;

    public DishResponseDTO(Long id, String name, DishType type, String chefName, String userName) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.chefName = chefName;
        this.userName = userName;
    }
}
