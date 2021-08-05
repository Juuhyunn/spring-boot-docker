package springboot.juuhyunn.item.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import springboot.juuhyunn.item.entity.Item;

public interface ItemRepository extends ReactiveCrudRepository<Item, String> {
}
//