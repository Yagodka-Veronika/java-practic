package lesson1.OOP.HW5;

//1. Добавить преподавателей. Сделать TeacherView и доделать GroupService
//        2*. Реализовать UniversityApp, в котором будет поддерживаться while(true) {...} взаимотношение со всеми вью с вводом команд в реальном режиме.
//        Возможный набор команд:
//        /get-student
//        /get-student name
//        /get-student id
//        /get-group 11А
//        /create-student Ivan_Morozov 18 11A
//        /delete-teacher Maria_Pavlova
//        /set-group-student-by-id 5 11Б
//


public class Main {
    public static void main(String[] args) {

        UniversityApp  universityApp = new UniversityApp();
        universityApp.run();
    }
}
