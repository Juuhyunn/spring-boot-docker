//package springboot.juuhyunn.dish_trash;
//
//import lombok.RequiredArgsConstructor;
//import reactor.core.publisher.Flux;
//import springboot.juuhyunn.dish.Dish;
//import springboot.juuhyunn.dish.KitchenService;
//
//@RequiredArgsConstructor
//public class SimpleServer {
//    private final KitchenService kitchen;
//    Flux<Dish> doingMyJob() {
//        return this.kitchen.getDishes().map(dish -> Dish.deliver(dish));
//    }
//}
