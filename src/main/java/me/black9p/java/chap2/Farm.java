package me.black9p.java.chap2;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    /**
     * 1. 녹색 사과 필터링
     * @param inventory
     * @return
     */
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory) {
            if (FarmConstants.GREEN_COLOR.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * 2. 색을 파라미터화
     * @param inventory
     * @param color
     * @return
     */
    public static List<Apple> filterApplesByColor(List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory) {
            if (color.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * 가능한 모든 속성으로 필터링
     * @param inventory
     * @param color
     * @param weight
     * @param flag
     * @return
     */
    public static List<Apple> filterApples(List<Apple> inventory, String color, int weight, boolean flag) {
        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory) {
            // flag가 true일때 색으로 구분, flag가 false일때 무게로 구분..
            if (flag && apple.getColor().equals(color) || (!flag && apple.getWeight() > weight)) {
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * Predicate를 이용한 필터링
     * @param inventory
     * @param p
     * @return
     */
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    /**
     * 사과 외 다양한 물건에서 필터링이 작동하도록 리스트형식 추상화
     * @param list
     * @param p
     * @param <T>
     * @return
     */
    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for(T e: list) {
            if(p.test(e)) {
                result.add(e);
            }
        }
        return result;
    }
}
