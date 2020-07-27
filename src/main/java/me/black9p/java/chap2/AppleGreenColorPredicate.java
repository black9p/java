package me.black9p.java.chap2;

public class AppleGreenColorPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return FarmConstants.GREEN_COLOR.equals(apple.getColor());
    }
}
