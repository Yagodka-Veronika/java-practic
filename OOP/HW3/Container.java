package lesson1.OOP.HW3;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class Container implements  Comparable<Container>,Iterable<Box>{
     private final List<Box> container;
     private int index;
     private final String nameContainer;
     public Container(String nameContainer) {
      container = new ArrayList<Box>();
      index = 0;
      this.nameContainer = nameContainer;
     }
     public void addBox(Box box){
     container.add(box);
     }

     @Override
     public Iterator<Box> iterator() {
      Iterator<Box> iterator = new Iterator<Box>() {
       private int indexIterator = 0;
     @Override
     public boolean hasNext() {
      return indexIterator < container.size();
     }
     @Override
     public Box next() {
      return container.get(indexIterator++);
     }
   };
   return iterator;

 }

     @Override
     public int compareTo(Container o) {
      return Integer.compare(this.getWeight(),o.getWeight());
     }
     @Override
     public String toString() {
      for (Box item : container) {
       System.out.println(item);
      }
      return String.format("%s: яшиков %d, общий вес %d\n", this.getNameContainer(),
          this.getIdBox(), this.getWeight());
     }
     public Integer getWeight(){
      int Sum = 0;
      for (Box box: container) {
       Sum += box.getWeight();
      }
      return Sum;
     }
     public Integer getIdBox() {
      return container.size();
     }
     public String getNameContainer() {
      return nameContainer;
     }
}



