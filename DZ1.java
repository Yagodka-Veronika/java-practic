package lesson1;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;
//Реализовать консольное приложение, которое:
//        1. Принимает от пользователя и “запоминает” строки.
//        2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        3. Если введено revert, удаляет предыдущую введенную строку из памяти.
//        4. Если введено exit, то программа завершается
//
//        > - ввод в консоль (stdin), < - вывод на консоль (stdout)
//        > java
//        > python
//        > c#
//        > print
//< [c#, python, java]
//        > revert
//        > print
//< [python, java]
//        > revert
//        > revert
//        > print
//< []
//        > revert -> throw new NoSuchElementException
public class DZ1 {
    public static void main(String[] args) {
            Deque<String> strings = new LinkedList<>();
//            List<String> strings = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            String str = "";

            while (!str.equals("exit")) {
                System.out.print("Введите строку: ");
                str = scanner.nextLine();

                if (str.equals("print")) {
                    System.out.println(strings);
                } else if (str.equals("revert")) {
                    if (!strings.isEmpty()) {
                        strings.removeFirst();
                    } else {
                        System.out.println("revert -> throw new NoSuchElementException");
                    }
                } else {
                    strings.addFirst(str);
                }
            }
        }
    }











//        Scanner scanner = new Scanner(System.in);
//        List<String> list = new ArrayList<>();
//
//        while (true) {
//            String input = scanner.nextLine();
//
//            if (input.equals("exit")) {
//                break;
//            } else if (input.equals("print")) {
//                for (int i = list.size() - 1; i >= 0; i--) {
//                    System.out.print(list.get(i) + " ");
//                }
//                System.out.println();
//            } else if (input.equals("revert")) {
//                if (list.isEmpty()) {
//                    System.out.println("List is empty");
//                } else {
//                    list.remove(list.size() - 1);
//                }
//            } else {
//                list.add(input);
//            }
//        }
//    }
//}




