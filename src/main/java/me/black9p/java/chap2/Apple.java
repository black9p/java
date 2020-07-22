package me.black9p.java.chap2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Apple {
    private String color;
    private int weight;

    public Apple(String color) {
        this.color = color;
    }
}
