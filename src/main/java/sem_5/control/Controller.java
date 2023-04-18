package sem_5.control;



import sem_5.View;
import sem_5.model.Student;
import sem_5.model.StudyGroup;
import sem_5.model.Teacher;
import sem_5.service.ServiceStudent;
import sem_5.service.ServiceStudyGroup;
import sem_5.service.ServiceTeacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Controller {
    public Controller() {
        String[] names = new String[]{"Emma","Kate","John","Michkal","Dima"};
        Random random = new Random();

        ServiceTeacher serviceTeacher = new ServiceTeacher();
        List<Teacher> teacherList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            teacherList.add(serviceTeacher.create(names[random.nextInt(names.length)]));
        }

        ServiceStudent serviceStudent = new ServiceStudent();
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            studentList.add(serviceStudent.create(names[random.nextInt(names.length)]));
        }

        ServiceStudyGroup serviceStudyGroup = new ServiceStudyGroup();
        List<StudyGroup> studyGroupList = new ArrayList<>();
        studyGroupList.add(serviceStudyGroup.create(teacherList.get(0), studentList));

        View view = new View();
        while (true){
            String answer = view.run();
            if (answer.equals("1")) {
                view.outList(teacherList);
            }
            if (answer.equals("2")){
                view.outList(studentList);
                }
            if (answer.equals("3")){
                String new_name_student = view.prompt("Input new name!");
                studentList.add(serviceStudent.create(new_name_student));
                System.out.println("New Student is created!");
                }
            if (answer.equals("4")){
                String new_name_teacher = view.prompt("Input new name!");
                teacherList.add(serviceTeacher.create(new_name_teacher));
                System.out.println("New Student is created!");
                }
            String cmd = view.prompt("Do you want to continue?(Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }else break;
        }

    }

}

