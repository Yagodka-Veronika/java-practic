package lesson1.OOP.HW1;
//Нужно создать несколько классов животных:
//        1. Пес (Собака)
//        2. Кот (Кошка)
//        3. ... придумать еще парочку
//
//        Каждое животное имеет: (поля)
//        1. Имя (кличка)
//        2. Возраст
//        3. ... придумать еще какие-то параметры
//
//        Каждое животное может: (методы)
//        1. Подавать голос
//        2. Питаться (съедает какое-то количество еды, переданное в метод)
//        3. Двигаться
//        4. ... все, что сумеете придумать
//
//        Нужно выделить базовый тип с общими атрибутами, инкапсулировать то, что является внутренним, внурь класса.
//        Создать массив с животными и в цикле заставить их поесть (какое-то количество еды) и заставить подать голос.


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
        public static void main(String[] args) {
            Animals dog = new Dog("Рокки",4,"brown");
            Animals cat = new Cat("Мура",5,"red");
            Animals horse = new Horse("Ангел",3,"white");
            Animals duck = new Duck("Понка",1,"brown");


            List<Animals> animals =  new ArrayList<Animals>();
            Collections.addAll(animals,dog,cat,horse,duck);


            for (Animals animal:animals) {
                animal.voice();
                try {
                    Thread.sleep(1000);
                    if(animal.equals(dog))animal.aet(2);
                    else if (animal.equals(cat))animal.aet(5);
                    else if (animal.equals(horse))animal.aet(3);
                    else animal.aet(20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                animal.walking();


            }
        }
}

