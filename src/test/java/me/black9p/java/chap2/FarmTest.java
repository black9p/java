package me.black9p.java.chap2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FarmTest {

    @Test
    public void test_filterGreenApples() {
        List<Apple> inventory = Arrays.asList(new Apple(FarmConstants.GREEN_COLOR), new Apple(FarmConstants.BLUE_COLOR));

        List<Apple> expected = Collections.singletonList(new Apple(FarmConstants.GREEN_COLOR));
        List<Apple> actual = Farm.filterGreenApples(inventory);

        assertEquals(expected.size(), actual.size());
    }
}