package lesson1;

//    public class Printer {
//        public static void main(String[] args) {
//            Answer ans = new Answer();
//            try {
//                ans.arrayOutOfBoundsException();
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Выход за пределы массива");
//            }
//
//            try {
//                ans.divisionByZero();
//            } catch (ArithmeticException e) {
//                System.out.println("Деление на ноль");
//            }
//
//            try {
//                ans.numberFormatException();
//            } catch (NumberFormatException e) {
//                System.out.println("Ошибка преобразования строки в число");
//            }
//        }
//    }
////}
//
//
// class Answer {
//     public static void arrayOutOfBoundsException() {
//        int[] arr = new int[5];
//        System.out.println(arr[10]); // выход за пределы массива
//    }
//
//    public static void divisionByZero() {
//        int a = 5;
//        int b = 0;
//        System.out.println(a / b); // деление на ноль
//    }
//
//    public static void numberFormatException() {
//        String str = "abc";
//        int num = Integer.parseInt(str); // ошибка преобразования строки в число
//    }
//}
//import java.util.Arrays;
//public class Printer{
//    public static void main(String[] args) {
//        int[] a = {};
//        int[] b = {};
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            a = new int[]{4, 5, 6};
//            b = new int[]{1, 2, 3};
//        }
//        else{
//            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
//            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
//        }
//
//        Answer ans = new Answer();
//        String itresume_res = Arrays.toString(ans.subArrays(a, b));
//        System.out.println(itresume_res);
//    }
//
//    class Answer {
//        public int[] subArrays(int[] a, int[] b){
//            // Введите свое решение ниже
//            if (a.length != b.length) {
//            return new int[]{0}; // вернуть нулевой массив длины 1
//           }
//           int[] c = new int[a.length];
//           for (int i = 0; i < a.length; i++) {
//              c[i] = a[i] - b[i]; // заполнить массив разностями элементов
//           }
//            return c;
//          }
//    }
//}
//import java.util.Arrays;
//public class Printer{
//    public static void main(String[] args) {
//        int[] a = {};
//        int[] b = {};
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            a = new int[]{12, 8, 16};
//            b = new int[]{4, 2, 4};
//        }
//        else{
//            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
//            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
//        }
//
//        Answer ans = new Answer();
//        String itresume_res = Arrays.toString(ans.divArrays(a, b));
//        System.out.println(itresume_res);
//    }
//
//
//    class Answer {
//        public int[] divArrays(int[] a, int[] b){
//            // Введите свое решение ниже
//            if (a.length != b.length) {
//             return new int[]{0}; // вернуть нулевой массив длины 1
//            }
//            int[] c = new int[a.length];
//            for (int i = 0; i < a.length; i++) {
//                if (b[i] == 0) {
//                  throw new RuntimeException("Деление на ноль!"); // выбросить исключение при делении на ноль
//                }
//               c[i] = a[i] / b[i]; // заполнить массив частными элементов
//                }
//                 return c;
//
//        }
//    }
//}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Printer {
    private static final String FILENAME = "students.txt";

    public static void main(String[] args) {
        Map<String, Integer> students = readStudentsFromFile();
        replaceQuestionMarks(students);
        writeStudentsToFile(students);
    }

    private static Map<String, Integer> readStudentsFromFile() {
        Map<String, Integer> students = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=");
                if (parts.length != 2) {
                    throw new IllegalArgumentException("Invalid input format");
                }
                String name = parts[0];
                String value = parts[1];
                if (value.equals("?")) {
                    students.put(name, null);
                } else {
                    try {
                        int number = Integer.parseInt(value);
                        students.put(name, number);
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException("Invalid input format", e);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    private static void replaceQuestionMarks(Map<String, Integer> students) {
        for (String name : students.keySet()) {
            Integer value = students.get(name);
            if (value == null) {
                int count = 0;
                for (Integer number : students.values()) {
                    if (number != null) {
                        count += number;
                    }
                }
                int average = count / students.size();
                students.put(name, average);
            }
        }
    }

    private static void writeStudentsToFile(Map<String, Integer> students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            for (String name : students.keySet()) {
                Integer value = students.get(name);
                if (value == null) {
                    writer.write(name + "=?\n");
                } else {
                    writer.write(name + "=" + value + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
