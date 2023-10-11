package contoller;

import data.Teacher;
import service.TeacherService;
import view.TeacherView;

public class TeacherController implements UserController<Teacher> {
    TeacherService teacherService = new TeacherService();
    TeacherView teacherView = new TeacherView();
    @Override
    public void create(String firstName, String secondName, String patronymic, String dateOfBirth) {
        teacherService.create(firstName,secondName,patronymic,dateOfBirth);

    }
    public Teacher select(Long teacherId){
        return teacherService.select(teacherId);
    }


    public void editTeacher(){
        teacherService.editTeacher();
    }

    public void showAll(){
        teacherView.sendOnConsole(teacherService.getAll());
    }
}
