package lesson1.OOP.HW1;


public class Dog extends Animals {

    public Dog(String aminalName, int animalAge, String animalColor) {
        super(aminalName, animalAge, animalColor);
    }

    public Dog(String aminalName, int animalAge) {
        super(aminalName, animalAge);
    }

    public Dog(String aminalName) {
        super(aminalName);
    }

    public Dog() {
    }

    @Override
    void voice() {
        System.out.println(getAminalName() + " лает");

    }

    @Override
    void walking() {
        System.out.println(getAminalName() + " гуляет");
    }

    @Override
    void aet(int amount) {
        System.out.println(new StringBuilder().append(getAminalName()).append(" грызет ").append(amount).append(" косточку(и/чек)").toString());

    }

    @Override
    void sleep() {
        System.out.println(getAminalName() + " спит");
    }

    @Override
    void bite() {
        System.out.println(getAminalName() + " кусается");
    }
}
