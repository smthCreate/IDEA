package sem_6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String name;
    private int amount;
    private Double price;

    public void decreaseQuantity(int toDecrease){
        amount-= toDecrease;
        System.out.println("New amount is "+amount);
    }
    public void increaseQuantity(int toIncrease){
        amount+=toIncrease;
        System.out.println("New amount is "+amount);
    }
}
