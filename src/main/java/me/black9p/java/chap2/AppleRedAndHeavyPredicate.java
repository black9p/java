package me.black9p.java.chap2;

public class AppleRedAndHeavyPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return FarmConstants.RED_COLOR.equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
