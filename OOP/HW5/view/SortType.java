package lesson1.OOP.HW5.view;

public enum SortType {
    NONE("Сортировка по умолчанию"),
    NAME("Сортировка по имени"),
    ID("Сортировка по айди");

    private final String sortName;

    @Override
    public String toString() {
        return sortName;
    }

    SortType(String sortName) {
        this.sortName = sortName;
    }
}