package springboot.juuhyunn.dish;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

/**
 *  주방장의 인스턴스를 생성자 주입(@RequiredArgsConstructor)으로 받는다. (연관관계)
 *  kitchen.getDishes()는 알바가 주방에 가서 요리를 가져오는 모습이다.
 *  요리가 완성되면 즉시 손님에게 전달한다....map()
 *  Reactive Consumer 는 다른 Reactive Service 를 호출하고 결과를 변환(transform)한다.
 *  서빙 직원의 역할은 웹 컨트롤러이다.
 * */
@RequiredArgsConstructor
public class PoliteServer {
    private final KitchenService kitchen;
    Flux<Dish> doingMyJob() {
        return this.kitchen.getDishes()
                .doOnNext(dish -> System.out.printf("\nThank you for %s!", dish))
                .doOnError(error -> System.out.printf("\nSo Sorry about [%s]", error.getMessage()))
                .doOnComplete(()-> System.out.println("\nThanks for all your hard work!")).map(Dish::deliver);
    }
}
