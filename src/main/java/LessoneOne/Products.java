package LessoneOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString()

public abstract class Products {
    protected Long id;
    protected String name;
    protected double cost;

}
