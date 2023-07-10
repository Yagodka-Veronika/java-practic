package lesson1.OOP.HW3;

import java.util.Iterator;
public class Box implements Iterator {
    private static Integer id;
    static {
        id = 0;
    }
    private final Integer idBox;
    private final Integer weight;
    private int count;

    public Box(Integer weight) {
        this.idBox = ++id;
        this.weight = weight;
    }

    @Override
    public boolean hasNext() {

        return count++ < 2;
    }

    @Override
    public Object next() {
        switch (count) {
            case 1:
                return String.format("ID ящика: %s ", id);
            default:
                return String.format("Вес ящика: %s ", weight);
        }
    }
    @Override
    public String toString() {
        return "Ящик (" + "id=" + idBox + ", вес=" + weight + ')';
    }

    public Integer getWeight() {
        return weight;
    }

}