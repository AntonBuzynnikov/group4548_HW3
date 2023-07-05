package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
@Setter
public class Container implements Comparable<Container>, Iterable<Box> {

    private int weight;
    private List<Box> boxList;

    public Container(){
        boxList = new ArrayList<>();
    }

    @Override
    public int compareTo(Container o) {
        if (this.getWeight() > o.getWeight())
            return 1;
        else if (this.getWeight() < o.getWeight())
            return -1;
        else
            return 0;
    }

    public int getWeight() {
        this.weight = 0;
        for (Box box:boxList) {
            this.weight += box.getWeight();
        }
        return this.weight;
    }

    @Override
    public String toString() {
        return String.format("Контэйнер с весом: %d",this.weight);
    }
    public void addBox(Box box){
        boxList.add(box);
    }


    @Override
    public Iterator<Box> iterator() {
        Iterator<Box> it = new Iterator<Box>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < boxList.size();
            }

            @Override
            public Box next() {
                return boxList.get(index++);
            }

        };
        return it;
    }
    public int getSizeBoxList(){
        return this.boxList.size();
    }
}
