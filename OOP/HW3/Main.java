//package lesson1.OOP.HW3;
//
//public class Main {
//    public static void main(String[] args) {
//        Container<Integer> object = new Container<Integer>(289);
//
//        object.show();
//        Integer integer = object.getOb();
//        System.out.println("Значение: " + integer);
//
//        System.out.println("Значение др. типа..................");
//
//        Container<String> object2 = new Container<String>("Это строка......");
//
//        object2.show();
//        String string = object2.getOb();
//        System.out.println("Значение: " + string);
//
//    }
//}
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