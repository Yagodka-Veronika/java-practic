package lesson1.Exceptions.HW2;

import java.util.Scanner;

//Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение,
// что пустые строки вводить нельзя.
public class Task4 {
    public static void main(String[] args) {
        System.out.println( enterStr());

    }

    private static String enterStr() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите cроку: ");
            String str = scanner.nextLine();
            if (str.isEmpty()) {
                throw new RuntimeException("Пустую строку вводить нельзя....");
            }
            return str;
        }
        catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Введите строку еще раз : ");
            return enterStr();

        }

    }

}