package lesson1.OOP.HW5.view;


import lesson1.OOP.HW5.controllers.GroupController;

public class GroupView {
    private final GroupController controller;

    public GroupView(GroupController controller) {
        this.controller = controller;
    }

    public void printAllFromGroup(String groupTitle) {
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("СТУДЕНТЫ И ПРЕПОДАВАТЕЛИ ГРУППЫ " + groupTitle);
        controller.getAllUsersFromGroup(groupTitle).forEach(System.out::println);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
    }
}
