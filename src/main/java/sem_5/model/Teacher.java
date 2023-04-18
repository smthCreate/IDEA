package sem_5.model;

public class Teacher extends APeople {
    private String name;
    public Teacher(String name) {
        super();
        this.name=name;
    }

    @Override
    public String toString() {
        return "Teacher "+ super.toString()+" "+name;
    }
}
