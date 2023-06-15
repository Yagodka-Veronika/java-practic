package lesson1;
import java.util.Arrays;
public class test4 {
    //Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
    private static void reverse() {
        String s = "Добро пожаловать на курс по Java";
        String[] s1 = s.split("\\s+");
        for (int i = 0; i < s1.length / 2; i++) {
            String tmp = s1[i];
            s1[i] = s1[s1.length - 1 - i];
            s1[s1.length - 1 - i] = tmp;
        }
        System.out.println(Arrays.toString(s1));
    }
}

