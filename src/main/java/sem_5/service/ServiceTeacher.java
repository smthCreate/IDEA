package sem_5.service;


import sem_5.model.Teacher;

public class ServiceTeacher {

    public Teacher create(String name) {
        return new Teacher(name);
    }
}
