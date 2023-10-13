package controller;

import java.util.List;

import model.Student;
import model.Type;
import service.DataService;
import service.StudentGroupService;
import view.StudentGroupView;
import view.StudentView;

public class Controller {
    DataService dataService = new DataService();
    StudentView studentView = new StudentView();
    StudentGroupView studentGroupView = new StudentGroupView();
    StudentGroupService studentGroupService = new StudentGroupService();

    public void createStudent(String firstName, String secondName, String dateOfBirth){
        dataService.create(firstName,secondName,dateOfBirth,Type.STUDENT);
    }
    public void createTeacher(String firstName, String secondName, String dateOfBirth){
        dataService.create(firstName,secondName,dateOfBirth,Type.TEACHER);
    }
    public void getAllStudents(){
        List<Student> students = dataService.getAllStudent();
        for (Student s: students){
            studentView.printOnConsole(s);
        }
    }

    public void printStudentGroup(){
        studentGroupView.printStudentGroup(studentGroupService.getStudentGroup());
    }
    public void createStudentGroup(){
        studentGroupService.createStudentGroup(dataService.getTeacher(),dataService.getAllStudent());
    }
//    часть дз, которая отличается на сайте и на семинаре
//    public List<Integer> getStudentsIdListInStudentsGroup(){
//        return studentGroupService.getStudentIdInStudentsGroup();
//    }
//
//    public int getTeacherIdInStudentsGroup(){
//        return studentGroupService.getTeacherIdInStudentsGroup();
//    }
}