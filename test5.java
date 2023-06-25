//package lesson1;
//
//public class test5 {
//    public static void main(String[] args) {
//        Cats cat1 = new Cats();
//        cat1.setName("Васька");
//        cat1.setColor("Рыжий");
//        cat1.setSpecies("Британец");
//        System.out.println(cat1.getName());
//        System.out.println(cat1.getColor());
//        System.out.println(cat1.getSpecies());
//        System.out.println(cat1);
//
//        Cats cat2 = new Cats();
//        cat2.setName("Васька");
//        cat2.setColor("Рыжий");
//        cat2.setSpecies("Британец");
//        System.out.println(cat2.getName());
//        System.out.println(cat2.getColor());
//        System.out.println(cat2.getSpecies());
//        System.out.println(cat2);
//
//        System.out.println(cat1.equals(cat2));
//    }
//}
//
//public class Cats {
//    private String Name;
//    private String Color;
//    private String Species;
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Cats cats = (Cats) o;
//        return Objects.equals(Name, cats.Name) && Objects.equals(Color, cats.Color) && Objects.equals(Species, cats.Species);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(Name, Color, Species);
//    }
//
//    @Override
//    public String toString() {
//        return "Cats{" +
//                "Name='" + Name + '\'' +
//                ", Color='" + Color + '\'' +
//                ", Species='" + Species + '\'' +
//                '}';
//    }
//
//    public String getName() {
//        return Name;
//    }
//
//    public void setName(String name) {
//        Name = name;
//    }
//
//    public String getColor() {
//        return Color;
//    }
//
//    public void setColor(String color) {
//        Color = color;
//    }
//
//    public String getSpecies() {
//        return Species;
//    }
//
//    public void setSpecies(String species) {
//        Species = species;
//    }
//}
