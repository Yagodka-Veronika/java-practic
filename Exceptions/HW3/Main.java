package lesson1.Exceptions.HW3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные через пробел согласно образцу:\n" +
                "Фамилия Имя Отчество датарождения номертелефона пол, например: \n" +
                "Petrov Aleksey Ivanovich 21.06.1987 291434515 m");
        String input = scanner.nextLine();

        String[] data = input.split(" ");
        if (data.length != 6) {
            System.out.println("Неверное количество данных!");
            return;
        }

        String surname = data[0];
        String name = data[1];
        String patronymic = data[2];
        String birthDate = data[3];
        String phone = data[4];
        String gender = data[5];

        try {
            validateData(surname, name, patronymic, birthDate, phone, gender);
            saveToFile(surname, name, patronymic, birthDate, phone, gender);
            System.out.println("Данные успешно сохранены в файл " + surname + ".txt");
        } catch (InvalidDataException e) {
            System.out.println("Ошибка ввода данных: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка записи файла: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void validateData(String surname, String name, String patronymic, String birthDate, String phone, String gender) throws InvalidDataException {
        if (!surname.matches("[a-zA-Zа-яА-Я]+")) {
            throw new InvalidDataException("Фамилия должна состоять только из букв");
        }
        if (!name.matches("[a-zA-Zа-яА-Я]+")) {
            throw new InvalidDataException("Имя должно состоять только из букв");
        }
        if (!patronymic.matches("[a-zA-Zа-яА-Я]+")) {
            throw new InvalidDataException("Отчество должно состоять только из букв");
        }
        if (!birthDate.matches("\\d{2}.\\d{2}.\\d{4}")) {
            throw new InvalidDataException("Дата рождения должна быть в формате dd.mm.yyyy");
        }
        if (!phone.matches("\\d+")) {
            throw new InvalidDataException("Номер телефона должен состоять только из цифр");
        }
        if (!gender.equals("f") && !gender.equals("m")) {
            throw new InvalidDataException("Пол должен быть 'f' или 'm'");
        }
    }

    private static void saveToFile(String surname, String name, String patronymic, String birthDate, String phone, String gender) throws IOException {
        FileWriter writer = new FileWriter(surname + ".txt", true);
        writer.write(surname + name + patronymic + birthDate + " " + phone + gender + "\n");
        writer.close();
    }
}

