package lesson1.OOP.HW5.controllers;


import lesson1.OOP.HW5.models.User;

import java.util.List;

public interface UserController <T extends User> {
    void create(String fullName, Integer age, String phoneNumber, String groupTitle);
    List<T> getAll();
    int remove(String fullName);
    List<T> getAllSortByFullName();
    List<T> getAllSortById();
    List<T> getNameStudy(String name);

}