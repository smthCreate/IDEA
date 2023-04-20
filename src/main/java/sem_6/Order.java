package sem_6;

public class Order {
    public Product order(Product product, int amount){
        int oldAmount = product.getAmount();
        product.setAmount(oldAmount+amount);
        return product;
    }
}
