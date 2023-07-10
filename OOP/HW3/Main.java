package lesson1.OOP.HW3;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

//    Создать класс Контейнер - Container.
//        В контейнере могут быть ящики (класс Box).
//
//        У каждого ящика есть вес.
//        У каждого контейнера есть метод "получить вес" - это сумма всех весов ящиков, которые находятся в контейнере.
//
//        Класс Контейнер должен быть Comparable. Сравнивать он должен по весам контейнера (чем меньше вес, тем меньше контейнер).
//        Класс ContainerCountComparator - Comparator, который сравнивает контейнеры по количеству ящиков (чем меньше ящиков, тем меньше контейнер).
//        Класс контейнер должен быть Iterable - итерирование должно происходить по ящикам внутри контейнера.
//
//        Container c = new Container(...);
//// ...
//        for (Box box: c) {
//        box - это контейнер
//        }
public class Main {
    public static void main(String[] args) {
        Container container1 = new Container("Контейнер 1");
        container1.addBox(new Box(24));
        container1.addBox(new Box(11));
        container1.addBox(new Box(52));
        container1.addBox(new Box(37));
        container1.addBox(new Box(49));

        Container container2 = new Container("Контейнер 2");
        container2.addBox(new Box(22));
        container2.addBox(new Box(77));

        Container container3 = new Container("Контейнер 3");
        container3.addBox(new Box(64));
        container3.addBox(new Box(21));
        container3.addBox(new Box(46));

        List<Container> containers = new ArrayList<>();
        containers.add(container1);
        containers.add(container2);
        containers.add(container3);
        for (Container container: containers) {
            System.out.println(container);
        }
        System.out.println("Сравниваем контейнеры по количеству ящиков:");
        containers.sort(new ContainerCountComparator());
        for (Container container: containers) {
            System.out.println(container);
        }
        System.out.println("Сравниваем контейнеры по общему весу ):");
        Collections.sort(containers);
        for (Container container: containers) {
                System.out.println(container);
        }
    }
}



