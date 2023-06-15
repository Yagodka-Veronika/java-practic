package Lesson2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import java.lang.Math;
public class sem4 {
//    4. *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
//
//            Вариант 1 (простой)
        public static void main(String[] args) {
            // Читаем выражение из файла input.txt
            String inputString = getDataFromFile("D:\\программирование\\мама\\java_projects\\input.txt");
            System.out.println("Given the equation: " + inputString);
            // Вывод результата
            System.out.println(getSolution(inputString));
        }


        public static String getSolution(String str) {
            // Формируем список. Разделитель - пробел, "+" и "=" исключаем
            ArrayList<String> list = new ArrayList<>(List.of(str.split(" ")));
            list.remove("+");
            list.remove("=");


            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    // Заменяем "?" в цикле от 0 до 9, сравниваем с результатом выражения
                    int x = Integer.parseInt(list.get(0).replace("?", String.valueOf(i)));
                    int y = Integer.parseInt(list.get(1).replace("?", String.valueOf(j)));
                    if (x + y == Integer.parseInt(list.get(2))) {
                        // Решение найдено, формируем строку ответа
                        return String.format("Result: %d + %d = %d", x, y, Integer.parseInt(list.get(2)));
                    }
                }
            }
            // Иначе решения нет
            return "No solution";
        }


        public static String getDataFromFile(String path) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                return br.readLine();
            }
            catch (Exception exception) {
                System.out.println(exception.getMessage());
                return "";
            }
        }
    }



//    Вариант 2 (универсальный)

//        public static void main(String[] args) {
//            // Читаем выражение из файла input.txt
//            String inputString = getDataFromFile("C:\\Users\\ovash\\Downloads\\JAVA\\Seminar1\\input.txt");
//            System.out.println("Выражение: " + inputString);
//            // Вывод результата
//            getSolution(inputString);
//        }
//
//
//        public static void getSolution(String str) {
//            // Подсчитываем количество знаков ?
//            int countSep = countChars(str, '?');
//            System.out.println("Неизвестных: " + String.valueOf(countSep));
//            // Вариантов подстановок цифр будет 10 в степени количества неизвестных
//            for (int i = 0; i < Math.pow(10, countSep); i++){
//                // Пробежимся в цикле по всем возможным вариантам
//                // Сформируем строку подстановки, которую будем использовать для подстановки цифр
//                // Дополним строку нулями
//                // Например, если неизвестных 5: 00000, 00001, 00005
//                String replacementString = String.format("%0"+String.valueOf(countSep) +"d", i);
//                // Скопируем строку выражения
//                String newstr = str;
//                // Подставим на места знаков ? соответсвующую цифру из строки подстановки
//                for (int j = 0; j < countSep; j++){
//                    // Первый ? заменяется на первую цифру из строки подстановки, второй на вторую и т.д.
//                    newstr = newstr.replaceFirst(String.valueOf("\\?"), String.valueOf(replacementString.charAt(j)));
//                }
//                check(newstr);
//            }
//
//        }
//
//        // Проверка
//        public static void check(String str) {
//            // Формируем список. Разделитель - пробел, "+" и "=" исключаем
//            ArrayList<String> list = new ArrayList<>(List.of(str.split(" ")));
//            list.remove("+");
//            list.remove("=");
//            // Присвоим переменным
//            int x = Integer.parseInt(list.get(0));
//            int y = Integer.parseInt(list.get(1));
//            int z = Integer.parseInt(list.get(2));
//            // Проверим, получилось ли верное равенство
//            if (x + y == z ){
//                System.out.println(str);
//            }
//        }
//
//        // Вспомогательная функция для подсчета количества ? в строке
//        public static int countChars(String Input, char SomeChar ) {
//            int count = 0;
//            for (int i = 0; i < Input.length(); i++) {
//                if (Input.charAt(i) == SomeChar) {
//                    count++;
//                }
//            }
//            return count;
//        }
//        // Чтение из файла
//        public static String getDataFromFile(String path) {
//            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//                return br.readLine();
//            }
//            catch (Exception exception) {
//                System.out.println(exception.getMessage());
//                return "";
//            }
//        }
//    }
//



