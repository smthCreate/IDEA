package sem_4;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoxWithNumber<T extends Number> {
    private T[] numbers;
    public double average(){
        double av = 0;
        for (int i = 0; i < this.numbers.length; i++) {
            av+=(Double)this.numbers[i];
        }
        return av/this.numbers.length;
    }


    public boolean compare(BoxWithNumber<?> bwn1) {
        return Math.abs(this.average())==Math.abs(bwn1.average());
    }
}
