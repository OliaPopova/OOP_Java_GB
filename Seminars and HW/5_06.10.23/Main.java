import controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Olga","Popova","31.05.2001");
        controller.createStudent("01","02","03");
        controller.createTeacher("Elsa","Swon","06.10.2001");

        controller.createStudentGroup();
        controller.printStudentGroup();
    }
}