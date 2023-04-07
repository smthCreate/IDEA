package sem_3.Game_cows;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answer {
//    private Integer numAttempts;
    private String userInput;
    private Integer cow;
    private Integer bull;
}
