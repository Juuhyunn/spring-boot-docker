package springboot.juuhyunn.dish;
import lombok.Data;

@Data
public class Dish {
    private String description;
    private boolean delivered = false;

    public static Dish deliver(Dish dish) {
        Dish deliveredDish = new Dish(dish.description);
        deliveredDish.delivered = true;
        return deliveredDish;
    }
    Dish(String description) {
        this.description = description;
    }

    public boolean isDelivered() {
        return delivered;
    }
    @Override
    public String toString() {
        return String.format("Dish { description = %s, delivered = %s}", description, delivered);
    }
}
