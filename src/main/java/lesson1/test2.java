package lesson1;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {

//   Дан массив nums = [3,2,2,3] и число val = 3.
//   Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//   Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.



        int[] nums = new int[] {1,2,3,4,3,4,3,5};

        int val = 3;
        int first = 0;
        int last = nums.length - 1;
        int temp = 0;


        while (first <= last) {
            if (nums[first] == val && nums[last] != val) {
                temp = nums[last];
                nums[last] = nums[first];
                nums[first] = temp;
                last--;
                first++;
            } else if (nums[first] != val) {
                first++;
            }
            else if (nums[first] == val && nums[last] == val) {
                last--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}




