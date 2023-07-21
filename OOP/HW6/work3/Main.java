package lesson1.OOP.HW6.work3;

public class Main {
    public static void main(String[] args) {
        System.out.println("WORK 1:");
        System.out.println("interface Figure:\n" +
                "class Rectangle implements Figure:\n" +
                "int height;\n" + "int width;\n" +
                "class Square implements Figure:\n" + "int sideSquere;");
        System.out.println("WORK 2:");
        System.out.println("interface AccountReportGenerator extends ReportGenerator: String generateFormat()\n" +
                "class AccountReportGeneratorHML implements AccountReportGenerator:  @Override String generateFormat()\n" +
                "class AccountReportGeneratorJSON implements AccountReportGenerator: @Override String generateFormat()\n" +
                "class DocumentReportGeneratorHML implements DocumentReportGenerator: @Override String generateFormat()\n" +
                "class DocumentReportGeneratorJSON implements DocumentReportGenerator: @Override String generateFormat()\n"
        );
        System.out.println("WORK 3:");
        System.out.println("Вызов метода greet без аргументов:");
        System.out.println(new Greeter().greet());
        System.out.println("Вызов метода greet с аргументом Formality.formal:");
        System.out.println(new Greeter().greet(Formality.formal));
    }
}