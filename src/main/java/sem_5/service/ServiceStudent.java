package sem_5.service;


import sem_5.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ServiceStudent {

    public Student create(String name) {
        return new Student(name);
    }
}
