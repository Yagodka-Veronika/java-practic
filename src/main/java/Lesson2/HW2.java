package Lesson2;



import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.*;
public class HW2 {
    public static int[] arr(int length, int min, int max){
        Random rand = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) array[i] = rand.nextInt((max - min) + 1) + min;
        return array;
    }
    public static int[] bobbleArr(int[]array) throws IOException {

        Logger logger = Logger.getLogger(HW2.class.getName());
        logger.setUseParentHandlers(false);

        FileHandler fh = new FileHandler("log.txt");
        SimpleFormatter form = new SimpleFormatter();
        fh.setFormatter(form);
        logger.addHandler(fh);

        // сортировка пузырьком
        int[] arr = array.clone();
        boolean sort = false;
        int buf;
        while(!sort) {
            sort = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    sort = false;
                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                    logger.info(arr[i] + "<=>" + arr[i+1] ); // Вывод в лог
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        int[] array1 = arr(10,1,100);
        int[] array2 = bobbleArr(array1);
        System.out.println("Исх. массив: " + Arrays.toString(array1));
        System.out.println("Рез. массив: " + Arrays.toString(array2));
    }
}
