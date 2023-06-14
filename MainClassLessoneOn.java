package lesson1;

public class MainClassLessoneOn {
    public static void main(String[] args) {

        // Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

        int[] nums = new int[] {1,1,0,1,1,1,1,0,1};

        int count = 0;
        int max = 0;
        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            }
            else {
                temp = count;
                count = 0;
            }

        }
        if (temp > max){
            max = temp;

        }
        if (count > max) max = count;

        System.out.println(max);

    }
}
