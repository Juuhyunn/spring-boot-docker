package springboot.juuhyunn.item.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import springboot.juuhyunn.item.entity.Cart;
import springboot.juuhyunn.item.entity.CartItem;
import springboot.juuhyunn.item.entity.Item;
import springboot.juuhyunn.item.repository.CartRepository;
import springboot.juuhyunn.item.repository.ItemRepository;

@Service @RequiredArgsConstructor
public class CartService {
    private final ItemRepository itemRepository;
    private final CartRepository cartRepository;
    Mono<Cart> addToCart(String cartId, String id) {
        return this.cartRepository.findById(cartId).defaultIfEmpty(new Cart(cartId))
                .flatMap(cart -> cart.getCartItems().stream().filter(cartItem -> cartItem.getItem().getId().equals(id))
                .findAny().map(cartItem -> {
                    //cartItem.increment();
                    return Mono.just(cart);
                }).orElseGet((this.itemRepository.findById(id).map(CartItem::new).doOnNext(cartItem -> cart.getCartItems().add(cartItem))
                        .map(cartItem -> cart))).flatMap(this.cartRepository::save));
    }
}
