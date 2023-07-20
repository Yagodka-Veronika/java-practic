package lesson1.OOP.HW5.services;

import lesson1.OOP.HW5.models.User;
import lesson1.OOP.HW5.models.Student;
import lesson1.OOP.HW5.repositories.UserRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentService implements UserService<Student> {

    private final UserRepository<Student> userRepository;

    public StudentService(UserRepository<Student> userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber, String groupTitle) {

        userRepository.create(new Student(fullName, age, phoneNumber, groupTitle));
    }

    @Override
    public List<Student> getAll() {
        var students = userRepository.getAll();
        Collections.sort(students);
        return students;
    }

    public List<Student> getAllSortByFullName() {
        var students = userRepository.getAll();

        students.sort(Comparator.comparing(User::getFullName));

        return students;
    }

    public List<Student> getAllSortById() {
        var students = userRepository.getAll();
        students.sort(Comparator.comparing(User::getId));
        return students;
    }



    @Override
    public int remove(String fullName) {
        return userRepository.remove(fullName);
    }

    @Override
    public List<Student> getAllByTitile(String groupTitle) {
        return userRepository.getAllByGroupTitle(groupTitle);
    }

    public List<Student> studyGetName(String name){
        return userRepository.getNameStudy(name);
    }
}