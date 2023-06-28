package lesson1.HW6;


import java.util.ArrayList;
import java.util.Scanner;
//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//  Создать множество ноутбуков (ArrayList).
//  Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//  Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
//  Выводить только те ноутбуки, что соответствуют условию

public class Main {
    public static void main(String[] args) {
        int quantyNoteBooks = 10;
        ArrayList <NoteBooks> NoteBooks = new ArrayList<>();
        ArrayList <NoteBooks> filtrNoteBooks = new ArrayList<>();

        for (int i = 0; i < quantyNoteBooks; i++) {
            NoteBooks.add( i, new NoteBooks() );
        }

        for (int i = 0; i < NoteBooks.size(); i++) {
            System.out.println(NoteBooks.get(i));
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите параметр для фильтрации: ");
        String filtr = scanner.nextLine();
        for (NoteBooks NoteBook : NoteBooks) {
            if (NoteBook.toString().contains(filtr)) {
                System.out.println(NoteBook);
            }
        }
    }
}

