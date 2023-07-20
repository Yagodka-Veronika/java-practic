package lesson1.OOP.HW5.repositories;


import lesson1.OOP.HW5.models.User;

import java.util.List;

public interface UserRepository <T extends User> {
    void create(T user);

    List<T> getAll();

    int remove(String fullName);

    List<T> getAllByGroupTitle(String groupTitle);

    List<T> getNameStudy(String name);
}
