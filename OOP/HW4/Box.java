package lesson1.OOP.HW4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box <T extends Fruit> implements Iterable <T> {
    private List<T> fruits;
    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public int getWeight(){
        int Sum = 0;
        for (T fruit: fruits) {
            Sum += fruit.getWeight();
        }
        return Sum;
    }

    public void moveTo (Box<? super T> fruits){
        for (T fruit: this.fruits) {
            fruits.add(fruit);
        }
        this.fruits.clear();
    }
    @Override
    public Iterator<T> iterator() {
        Iterator<T> iter = new Iterator<T>() {
            int index;
            @Override
            public boolean hasNext() {
                return index < fruits.size();
            }

            @Override
            public T next() {
                return fruits.get(index++);
            }
        };
        return iter;
    }

}
