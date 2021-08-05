//package springboot.juuhyunn.dish_trash;
//
//
//import springboot.juuhyunn.dish_trash.KitchenService;
//import springboot.juuhyunn.dish_trash.PoliteServer;
//
///**
// * 구독(subscription)을 하기 전에는 어떤 연산도 일어나지 않는다.
// * */
//
//public class PoliteRestaurant {
//    public static void main(String... args) {
//        PoliteServer server = new PoliteServer(new KitchenService());
//        server.doingMyJob().subscribe(dish -> System.out.printf("\n%s 먹어랑", dish), throwable -> System.err.println(throwable));
//    }
//}
//