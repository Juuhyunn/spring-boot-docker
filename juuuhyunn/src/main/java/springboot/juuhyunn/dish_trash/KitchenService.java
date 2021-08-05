//package springboot.juuhyunn.dish_trash;
//
//import reactor.core.publisher.Flux;
///**
// * Future의 리턴 타입은 scalar 이다.
// * Flux의 리턴 타입은 vector이다.
// * just()를 통해 비동기적으로 제공한다.(만들자 마자 제공)
// * **/
//public class KitchenService {
//    Flux<Dish> getDishes(){
//        return Flux.just(new Dish("Sesame chicken"), new Dish("Lo mein noodles, plain"), new Dish("Sweet & sour Beef"));
//    }
//}
//