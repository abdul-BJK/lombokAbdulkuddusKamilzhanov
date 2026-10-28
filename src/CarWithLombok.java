<<<<<<< HEAD
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
=======
package PACKAGE_NAME;

public class CarWithLombok {
}
>>>>>>> f2375325cd22e40068e7a1df177d4ced7589f2d7
