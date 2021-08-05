package springboot.juuhyunn.item.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class CartItem {
    private Item item;
    private int quantity;
    private CartItem() {}

    CartItem(Item item) {
        this.item = item;
        this.quantity = 1;
    }
}
//