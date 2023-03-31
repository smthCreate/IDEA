package sem_1;

public class Basket {
    protected Product[] bought_products;

    public Basket(Product[] bought_products) {
        this.bought_products = bought_products;
    }

    public Product[] getBought_products() {
        return bought_products;
    }

    public void setBought_products(Product[] bought_products) {
        this.bought_products = bought_products;
    }

    @Override
    public String toString() {
        String[] names = new String[bought_products.length];
        for (int i = 0; i < bought_products.length; i++) {
            names[i] = bought_products[i].name;
        }
        return String.join(",",names);
    }
}
