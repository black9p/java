package me.black9p.java.chap2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FarmTest {

    @Test
    public void test_filterGreenApples() {
        List<Apple> inventory = Arrays.asList(new Apple(FarmConstants.GREEN_COLOR), new Apple(FarmConstants.BLUE_COLOR));

        int expected = 1;
        List<Apple> actual = Farm.filterGreenApples(inventory);

        assertEquals(expected, actual.size());
    }

    @Test
    public void test_filterApplesByColor() {
        List<Apple> inventory = Arrays.asList(new Apple(FarmConstants.BLUE_COLOR), new Apple(FarmConstants.BLUE_COLOR), new Apple(FarmConstants.RED_COLOR));

        int expected = 2;
        List<Apple> actual = Farm.filterApplesByColor(inventory, FarmConstants.BLUE_COLOR);

        assertEquals(expected, actual.size());
    }
}