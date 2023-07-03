package lesson1.OOP.HW1;



public class Cat extends Animals {
    public Cat(String aminalName, int animalAge, String animalColor) {
        super(aminalName, animalAge, animalColor);
    }

    public Cat(String aminalName, int animalAge) {
        super(aminalName, animalAge);
    }

    public Cat(String aminalName) {
        super(aminalName);
    }

    public Cat() {
    }

    @Override
    void voice() {
        System.out.println(getAminalName() + " мяучит");

    }

    @Override
    void walking() {
        System.out.println(getAminalName() + " гуляет");
    }

    @Override
    void aet(int amount) {
        System.out.println(new StringBuilder().append(getAminalName()).append(" кушает ").append(amount).append(" сосиску(и/сок)").toString());

    }

    @Override
    void sleep() {
        System.out.println(getAminalName() + " спит");
    }

    @Override
    void bite() {
        System.out.println(getAminalName() + " царапается");
    }
}

