package lesson1.Exceptions.HW2;
//Реализуйте метод, который запрашивает у пользователя
// ввод дробного числа (типа float),
//и возвращает введенное значение. Ввод текста вместо числа не должно приводить
// к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.InputMismatchException;

import java.util.Scanner;
class Task1 {
    public static void main(String[] args) {

        System.out.println(enterFloat());
    }

    private static float enterFloat() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите дробное число: ");
            float num = scanner.nextFloat();
            return num;
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число");
//            System.out.println("Введите еще раз: ");
            return enterFloat();
        }

    }
}
