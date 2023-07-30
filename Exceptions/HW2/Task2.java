package lesson1.Exceptions.HW2;

//Задание 2 Если необходимо, исправьте данный код
//        try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//        }

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        Test2(array);
    }

    private static void Test2(int[] intArray){
        try {
            int d = 0;
            double catchedRes1 = (double) intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }

}