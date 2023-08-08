package lesson1.Exceptions.HW4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ServiceCreateHuman {
    public static void createHuman() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные через пробел согласно образцу:\n" +
                "\t\t\t\tФамилия Имя Отчество ДатаРождения НомерТелефона пол, например: \n" +
                "\t\t\t\tPetrov Vadim Petrovich 21.06.1991 +29-143-45-15 male");
        String useDataHuman = scanner.nextLine();
        String[] useDataCells = useDataHuman.trim().split("\\s+");
        if (DataFromUser.isValidUseData(useDataHuman)) {
            CreateHuman newHuman = new CreateHuman(useDataCells);
            String lastName = useDataCells[0];
            String pathFile = lastName + ".txt";
            scanner.close();
            System.out.printf("Creation newHuman:\n\t\t\t%s \nwas successful", newHuman);

            try (FileWriter writer = new FileWriter(pathFile, true);
                 BufferedWriter bufferWriter = new BufferedWriter(writer)) {
                bufferWriter.write(newHuman.toString() + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } else {
            createHuman();
        }
    }
}
