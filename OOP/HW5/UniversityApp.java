package lesson1.OOP.HW5;


import lesson1.OOP.HW5.controllers.GroupController;
import lesson1.OOP.HW5.controllers.StudentController;
import lesson1.OOP.HW5.controllers.TeacherController;
import lesson1.OOP.HW5.repositories.StudentRepository;
import lesson1.OOP.HW5.repositories.TeacherRepository;
import lesson1.OOP.HW5.services.GroupService;
import lesson1.OOP.HW5.services.StudentService;
import lesson1.OOP.HW5.services.TeacherService;
import lesson1.OOP.HW5.view.GroupView;
import lesson1.OOP.HW5.view.SortType;
import lesson1.OOP.HW5.view.StudentView;
import lesson1.OOP.HW5.view.TeacherView;

import java.util.Scanner;



public class UniversityApp {

    private static StudentRepository studentRepository;
    private static StudentService studentService;
    private static StudentController studentController;

    private static TeacherRepository teacherRepository = new TeacherRepository();
    private static TeacherService teacherService = new TeacherService(teacherRepository);
    private static TeacherController teacherController = new TeacherController(teacherService);


//    public static void main(String[] args) {
//
//        //чтобы пользователь получал по api какие-то данные:
//        StudentView studentView = getStudentView(); // Создаем studentView (приложение) через присвоение
//        // методу getStudentController() (Alt + Enter - create metod),
//        // который реализован ниже (ч-з цепочку присвовений от репы до вложения контроллера в new StudentView)
//        TeacherView teacherView = getTeacherView();
//        GroupView groupView = getGroupView();
//    public static void main(String[] args) {
    public void run(){

        StudentView view = getStudentController();
        GroupView groupView = getGroupView();
        TeacherView viewTeach = new TeacherView(teacherController);

        view.create("Ivan Morozov", 18, "02", "11Б");
        view.create("Ivan Morozov", 18, "02", "11Б");
        view.create("Petr Vorobev", 19, "03", "10А");
        view.create("Sidor Sidorov", 20, "112", "10А");
        view.create("Elena Ivanova", 19, "911", "10А");
        view.create("Anna Morozova", 17, "01", "11А");

        viewTeach.create("Maria Pavlova", 32, "454", "11А");
        viewTeach.create("Galina Sergeevna", 35, "345", "10А");
        viewTeach.create("Sergey Petrovich",44, "98", "11Б");


        while  (true) {
            System.out.println("Введите, get-student, если хотите увидеть всех студентов. "+
                    "Введите get-teacher, если хотите отобразить весь список преподавателей. \n" +
                    "Введите get-student-name, если хотите найти конкретных студентов. " +
                    "Введите get-group, если хотите найти студентов по группам. \n" +
                    "Введите  create-student и следуйте инструкциям, чтобы создать нового ученика. \n"+
                    "Введите delete-student, чтобы удалить студента из списков. " +
                    "Введите create-teacher и следуйте инструкциям, чтобы создать нового преподавателя. \n" +
                    "Введите delete-teacher, чтобы удалить преподавателя. Введите exit, чтобы выйти из программмы.");
            switch (Scan()) {
                case "get-student":
                    view.sendOnConsole(SortType.ID);
                    break;
                case "get-teacher":
                    viewTeach.sendOnConsole(SortType.ID);
                case "get-student-name":
                    System.out.println("Введите полное имя студента");
                    System.out.println(view.studyGetName(Scan()));
                    break;
                case "get-group":
                    System.out.println("Введите группу, которую нужно вывести на экран");
                    groupView.printAllFromGroup(Scan());
                    break;
                case "create-student":
                    System.out.println("Введите полное имя студента: ");
                    String nameStudy = Scan();
                    System.out.println("Введите возраст студента: ");
                    int ageStudy = Integer.parseInt(Scan());
                    System.out.println("Введите номер телефона студента");
                    String phoneNumbStudy = Scan();
                    System.out.println("Введите группу студента");
                    String groupNumStudy = Scan();
                    view.create(nameStudy, ageStudy, phoneNumbStudy, groupNumStudy);
                    break;
                case "delete-student":
                    System.out.println("Введите полное имя студента, которого надо удалить из списка");
                    String fullNameStudy = Scan();
                    view.removeUser(fullNameStudy);
                    break;
                case "create-teacher":
                    System.out.println("Введите полное имя преподавателя: ");
                    String nameTeach = Scan();
                    System.out.println("Введите возраст преподавателя: ");
                    int ageTeach = Integer.parseInt(Scan());
                    System.out.println("Введите номер телефона преподавателя");
                    String phoneNumbTeach = Scan();
                    System.out.println("Введите группу преподавателя");
                    String groupNumTeach = Scan();
                    viewTeach.create(nameTeach, ageTeach, phoneNumbTeach, groupNumTeach);
                    break;
                case "delete-teacher":
                    System.out.println("Введите полное имя студента, которого надо удалить из списка");
                    String fullNameTeach = Scan();
                    view.removeUser(fullNameTeach);
                    break;
                case "exit":
                    System.exit(0);
            }
        }
    }

    private static StudentView getStudentController() {
        studentRepository = new StudentRepository();
        studentService = new StudentService(studentRepository);
        studentController = new StudentController(studentService);
        return new StudentView(studentController);
    }

    private static GroupView getGroupView() {
        GroupService groupService = new GroupService(studentService, teacherService);
        GroupController groupController = new GroupController(groupService);
        return new GroupView(groupController);
    }
    private static String Scan(){
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine().replace("_", " ");
        return command;
    }
}