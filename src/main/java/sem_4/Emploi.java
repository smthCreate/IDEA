package sem_4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emploi {
    private String fio;
    private Double salary;
    private String jobTitle;
}
