package lesson1.OOP.HW5;


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

//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Iterator;
//import java.util.function.Consumer;

//public class Main {
//    public static void main(String[] args) {
//
//        Container group = new Container();
//        group.addBox(new Box(4L, "Ivan Morozov"));
//        group.addBox(new Box(6L, "Petr Vorobev"));
//        group.addBox(new Box(2L, "Sidor        Sidorov"));
//        group.addBox(new Box(1L, "Elena Ivanova"));
//        group.addBox(new Box(8L, "Anna Morozova"));
//
//        var boxes = group.getBoxes();
//
////        boxes.sort(new ContainerCountComparator());
////        boxes.sort(Comparator.reverseOrder());
//        boxes.sort((o1, o2) -> {
//            String familyName1 = o1.getName().split("\\s+")[1];
//            String familyName2 = o2.getName().split("\\s+")[1];
//
//            return familyName1.compareTo(familyName2);
//        });
//        System.out.println(boxes);
//
//
//
///*        for (Box box : group) {
//            System.out.println(box);
//        }*/
//
///*        Iterator<Box> iterator = group.iterator();
//        while (iterator.hasNext()) {
//            Box box = iterator.next();
//            System.out.printf("%s\t%s%n", box.getId(), box.getName());
//            if (box.getName().equals("Petr Vorobev")) {
//                iterator.remove();
//            }
//        }*/
//
//        group.forEach(box -> System.out.printf("%s\t%s%n", box.getId(), box.getName()));
//
//
//        String groupInfo = String.valueOf(group);
//    }
//}



