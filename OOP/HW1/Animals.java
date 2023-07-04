package lesson1.OOP.HW1;


import java.util.Objects;

abstract class Animals {

    private String aminalName;
    private int animalAge;
    private String animalColor;

    public Animals(String aminalName, int animalAge, String animalColor) {
        this.aminalName = aminalName;
        this.animalAge = animalAge;
        this.animalColor = animalColor;
    }
    

    public Animals(String aminalName, int animalAge) {
        this(aminalName, animalAge, "Black");
//        this.aminalName = aminalName;
//        this.animalAge = animalAge;
//        this.animalColor = "Black";
    }
    public Animals(String aminalName) {
        this(aminalName, -1, "White");
//        this.aminalName = aminalName;
//        this.animalAge = -1;
//        this.animalColor = "White";
    }
    public Animals() {
        this("NoName", -1, "Black&White");
//        this.aminalName = "NoName";
//        this.animalAge = -1;
//        this.animalColor = "Black&White";
    }

    public void setAminalName(String aminalName) {
        this.aminalName = aminalName;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }

    public String getAminalName() {
        return aminalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public String getAnimalColor() {
        return animalColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return animalAge == animals.animalAge && Objects.equals(aminalName, animals.aminalName) && Objects.equals(animalColor, animals.animalColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aminalName, animalAge, animalColor);
    }

    abstract void voice ();
    abstract void walking ();
    abstract void aet(int amount);
    abstract void sleep();
    abstract void bite();

}