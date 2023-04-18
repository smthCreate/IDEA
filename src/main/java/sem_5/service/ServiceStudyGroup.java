package sem_5.service;



import sem_5.model.Student;
import sem_5.model.StudyGroup;
import sem_5.model.Teacher;

import java.util.List;

public class ServiceStudyGroup {
    public StudyGroup create(Teacher teacher, List<Student> studentList) {
        return new StudyGroup(teacher, studentList);
    }
}
