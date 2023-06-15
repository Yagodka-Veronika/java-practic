package lesson1;

public class test3 {
//    public static void main(String[] args) {

    // Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
// Если общего префикса нет, вернуть пустую строку "".
    private static int two(String[] arr) {
        if (arr.length == 0) {
            return 0;

        }
        else if (arr.length == 1) {
            return arr.length;
        }
        else {
            String rez = arr[0];
            for (int i = 1; i < arr.length; i++) {
                String cur = arr[i];
                int reader = 0;
                int lastCommon = 0;
                while (reader < rez.length() && reader < cur.length()) {
                    if (rez.charAt(reader) == cur.charAt(reader)) {
                        lastCommon++;
                    }
                    else {
                        break;
                    }
                    reader++;
                }
                rez = rez.substring(0, lastCommon);
            }
            return rez.length();
        }
    }
}

