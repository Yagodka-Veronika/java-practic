package lesson1;



//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
public class HW1 {
    public static void main(String[] args) {

        int[] arr = {22, 14, 9, 45, 3, 99};
        int min = arr[0];
        int max = arr[0];


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }

        }

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}
