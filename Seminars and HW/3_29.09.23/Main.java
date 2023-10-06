
import Contoller.UserController;
import Data.Flow;
import Data.Student;
import Data.StudentGroup;
import Data.Teacher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();

        Student student1 = new Student("Popova", "Olga", "Ivanovna", "31.05.2001", 17L);
        Student student2 = new Student("Petrov", "Alex", "Borisovich", "15.09.2002", 18L);
        Student student3 = new Student("Starostin", "Maxim", "Petrovich", "10.12.2001", 19L);
        Student student4 = new Student("Aleshin", "Anton", "Alexeevich", "08.08.2002", 20L);
        StudentGroup group1 = new StudentGroup(new Teacher("1", "2", "3", "4", 1234L), List.of((new Student("5", "6", "7", "8", 5678L)), student2, student3));

        StudentGroup group2 = new StudentGroup(new Teacher("12", "35", "667", "123123", 9191L), List.of(student3, student4));

        List<StudentGroup> studentGroups = new ArrayList<>();
        studentGroups.add(group1);
        studentGroups.add(group1);
        studentGroups.add(group1);

        List<StudentGroup> studentGroups1 = new ArrayList<>();
        studentGroups1.add(group2);
        studentGroups1.add(group1);
        Flow flow = new Flow(studentGroups);
        Flow flow1 = new Flow(studentGroups1);

        List<Flow> flows = List.of(flow,flow1);
        flows = userController.getSortedFlowsByGroupCount(flows);
        for (Flow groups : flows) {
            System.out.println(groups);
        }
    }
}
