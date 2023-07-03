package lesson1.OOP.HW1;


public class Horse extends Animals {


    public Horse(String aminalName, int animalAge, String animalColor) {
        super(aminalName, animalAge, animalColor);
    }

    public Horse(String aminalName, int animalAge) {
        super(aminalName, animalAge);
    }

    public Horse(String aminalName) {
        super(aminalName);
    }

    public Horse() {
    }

    @Override
    void voice() {
        System.out.println( getAminalName() + " говорит ИГО-ГО..");

    }

    @Override
    void walking() {
        System.out.println(getAminalName() + " гуляет");
    }

    @Override
    void aet(int amount) {
        System.out.println(new StringBuilder().append(getAminalName()).append(" кушает ").append(amount).append(" сено/а").toString());

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
