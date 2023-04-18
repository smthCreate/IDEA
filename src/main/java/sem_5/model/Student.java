package sem_5.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Student extends APeople {
    private String name;
    public Student(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student "+ super.toString()+" "+name;
    }
}
