package lesson1.OOP.HW5.services;


import lesson1.OOP.HW5.models.Student;
import lesson1.OOP.HW5.models.User;

import java.util.List;

public interface UserService<T extends User>{
    void create(String fullName, Integer age, String phoneNumber, String groupTitle);
    List<T> getAll();
    List<T> getAllSortByFullName();
    List<T> getAllSortById();
    int remove(String fullName);

    List<T> getAllByTitile(String groupTitle);
    List<Student> studyGetName(String name);
}
