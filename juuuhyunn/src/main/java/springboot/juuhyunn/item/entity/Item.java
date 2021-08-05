package springboot.juuhyunn.item.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
public class Item {
    private @Id String id;
    private String name;
    private double price;

    private Item() {}
    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
//