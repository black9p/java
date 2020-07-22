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


}
