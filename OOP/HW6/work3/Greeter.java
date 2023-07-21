package lesson1.OOP.HW6.work3;

public class Greeter {
    private Formality formality;

    public String greet(Formality formality) {
        return switch (formality) {
            case formal -> "Good evening, sir.";
            case casual -> "Sup bro?";
            case intimate -> "Hello Darling!";
        };
    }
    public String greet() {
        return "Hello.";
    }
    public void setFormality(Formality formality) {
        this.formality = formality;
    }
}

