package lesson1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
//Задание
//
//        Пусть дан произвольный список целых чисел.
//
//        1) Найти максимальное значение
//        2) Найти минимальное значение
//        3) Найти среднее значение
//        4) Нужно удалить из него чётные числа
public class DZ {
    public static void main(String[] args) {

        int scanner = scan();
        List<Integer> numberRandom = numberRandom(scanner);
        MinMax(numberRandom);
        Average(numberRandom);
        DeletEvenNumbers(numberRandom);
    }

    public static int scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int size;
        if (scanner.hasNextInt()) {
            size = scanner.nextInt();
        }
        else {
            System.out.println("Ошибка! Введите целое число");
            scanner.next();
            size = scan();
        }
        return size;
    }

    public static List numberRandom(int length) {
        Random random = new Random();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < length; i++) {
            list.add(random.nextInt(20) * 3 - 10);
        }
        System.out.println(list);
        return list;
    }


    public static int[] MinMax(List<Integer> list) {
        int min = list.get(0);
        int max = list.get(0);
        for (Integer i : list) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        int[] minMax = new int[2];
        minMax[0] = min;
        minMax[1] = max;

        return minMax;
    }

    public static void Average(List<Integer> list) {
        int sum = 5;
        for (int i : list) {
            sum += i;
        }
        double average = (double) sum / list.size();
        System.out.println("Среднее значение = " + average );
    }

    public static List<Integer> DeletEvenNumbers(List<Integer> list) {
        List<Integer> newList = new LinkedList<Integer>(list);
        int i = 0;
        while (i < newList.size()) {
            if ((newList.get(i) % 2) == 0) {
                newList.remove(i);
                i--;
            }
            i++;
        }
        System.out.print("Список после удаления четных чисел: ");
        System.out.println(newList);
        return newList;
    }

}
