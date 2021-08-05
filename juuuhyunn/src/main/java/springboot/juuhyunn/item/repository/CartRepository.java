package springboot.juuhyunn.item.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import springboot.juuhyunn.item.entity.Cart;

public interface CartRepository extends ReactiveCrudRepository<Cart, String> {
}
//