package lesson1.Exceptions.HW4;

public class Main {
    public static void main(String[] args) {
        try {
            ServiceCreateHuman.createHuman();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}