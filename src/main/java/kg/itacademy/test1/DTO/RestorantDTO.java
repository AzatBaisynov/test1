package kg.itacademy.examspr2.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestorantDTO {
    private String name;
    private String address;
    private String bestDish;
    private String webSite;
}
