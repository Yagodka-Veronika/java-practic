package lesson1.OOP.HW1;

public class Duck extends Animals {
    public Duck(String aminalName, int animalAge, String animalColor) {
        super(aminalName, animalAge, animalColor);
    }

    public Duck(String aminalName, int animalAge) {
        super(aminalName, animalAge);
    }

    public Duck(String aminalName) {
        super(aminalName);
    }

    public Duck() {
    }

    @Override
    void voice() {
        System.out.println(getAminalName() + " крякает");

    }

    @Override
    void walking() {
        System.out.println(getAminalName() + " гуляет");
    }

    @Override
    void aet(int amount) {
        System.out.println(new StringBuilder().append(getAminalName()).append(" клюет ").append(amount).append(" зернышко(а/шек)").toString());


    }

    @Override
    void sleep() {
        System.out.println(getAminalName() + " спит");
    }

    @Override
    void bite() {
        System.out.println(getAminalName() + " щипает");
    }
}