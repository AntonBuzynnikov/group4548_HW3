package org.example;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        Container c1 = new Container();
        Container c2 = new Container();
        Container c3 = new Container();
        List<Container> cList = new ArrayList<>();
        cList.add(c1);
        cList.add(c2);
        cList.add(c3);
        for (int i = 0; i < 5; i++) {
            c1.addBox(new Box(r.nextInt(1,20)));
            if(i == 1) continue;
            c2.addBox(new Box(r.nextInt(1,20)));
            if(i == 3) continue;
            c3.addBox(new Box(r.nextInt(1,20)));
        }
        System.out.println("======Comparable======");
        Collections.sort(cList);
        System.out.println(cList);
        System.out.println("======EndComparable======");
        System.out.println();
        System.out.println("======Iterable======");
        System.out.println("c1");
        for (Box box:c1) {
            System.out.println(box);
        }
        System.out.println();
        System.out.println("c2");
        for (Box box:c2) {
            System.out.println(box);
        }
        System.out.println();
        System.out.println("c3");
        for (Box box:c3) {
            System.out.println(box);
        }
        System.out.println("======EndIterable======");
        System.out.println();
        System.out.println("======Comparator======");
        Collections.sort(cList, new ContainerCountComparator() {
            @Override
            public int compare(Container o1, Container o2) {
                if(o1.getSizeBoxList()>o2.getSizeBoxList())
                    return 1;
                else if (o1.getSizeBoxList()<o2.getSizeBoxList()) {
                    return -1;
                }
                else
                    return 0;
            }
        });
        System.out.println(cList);
        System.out.println("======EndComparator======");



    }


}