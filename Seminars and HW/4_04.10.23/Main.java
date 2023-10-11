import contoller.TeacherController;
import service.TeacherService;
import view.TeacherView;

public class Main {
    public static void main(String[] args) {
        TeacherController tController = new TeacherController();
        tController.create("Anna","Faning","Petrovna","10.10.1989");
        tController.create("Elsa","Stown","Yurevna","01.01.1987");
        tController.editTeacher();
        tController.showAll();

    }
}