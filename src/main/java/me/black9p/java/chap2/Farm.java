package me.black9p.java.chap2;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory) {
            if (FarmConstants.GREEN_COLOR.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }
}
