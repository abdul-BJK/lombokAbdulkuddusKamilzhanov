import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CarWithLombok {

    private String model;

    @EqualsAndHashCode.Include
    private String brand;

    private int year;
    private int price;
    private String color;

    @ToString.Exclude
    private int quantity;
}