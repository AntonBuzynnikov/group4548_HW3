package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Box{
    private int weight;

    public Box(int weight){
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Box{" +
                "Вес=" + weight +
                '}';
    }
}
