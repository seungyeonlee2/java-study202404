package day12.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static day12.lambda.Color.*;
import static day12.lambda.FilterApple.filter;
import static day12.lambda.FilterApple.filterApples;

public class Main {

    //내부클래스 생성
    private static class AppleColorPredicate implements ApplePredicate {

        @Override
        public boolean test(Apple apple) {
            return apple.getColor() == RED || apple.getColor() == GREEN;
        }
    }
    public static void main(String[] args) {

        // 사과 바구니 생성
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN)
                , new Apple(155, GREEN)
                , new Apple(120, RED)
                , new Apple(97, RED)
                , new Apple(200, GREEN)
                , new Apple(50, RED)
                , new Apple(85, YELLOW)
                , new Apple(75, YELLOW)
        );

//        List<Apple> greenApples = FilterApple.filterGreenApples(appleBasket);
//        System.out.println("greenApples = " + greenApples);

        System.out.println("===== 빨강 사과 필터링=====");
        List<Apple> filteredApples1 = FilterApple.filterApplesByColor(appleBasket, RED);
        System.out.println(filteredApples1);

        System.out.println("========== 무거운 사과 (100그램 이상) 필터링 ===========");
        List<Apple> apples1 = filterApples(appleBasket, new AppleWeightPredicate());
        System.out.println(apples1);

        System.out.println("=======빨강 또는 녹색 사과 필터링");
        List<Apple> apples2
                = filterApples(appleBasket, new AppleColorPredicate());
        System.out.println(apples2);

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
        System.out.println("========짝수만 필터링========");

        List<Integer> filter = filter(numbers, n -> n % 2 == 0);
        System.out.println(filter);

        System.out.println("=====사과의 색상만 추출======");
        ArrayList<Object> colors = MappingApple.mappingApplesByColor(appleBasket);
        System.out.println(colors);

        List<Integer> pows = MappingApple.map(numbers, n -> n * n);
        System.out.println(pows);
    }
}
