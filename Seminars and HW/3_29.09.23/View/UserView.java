package View;

import Data.Flow;
import Data.Student;
import Data.StudentGroup;
import Data.User;

import java.util.List;
import java.util.logging.Logger;

public class UserView {

    Logger logger = Logger.getLogger(UserView.class.getName());

    public void sendOnConsole(List<User> userList){
        for(User user: userList){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

    public void sendOnConsoleListStudent(List<Student> students){
        logger.info(students.toString());
    }

    public void sendOnConsoleFlow(Flow flow) {logger.info(flow.toString());}

    public void sendOnConsoleListFlow(List<Flow> flows) {logger.info(flows.toString());}
}
