package sem_1;

public class Category {
    protected String name;
    protected Product[] products;
    public Category(String name,Product[] products){
        this.products=products;
        this.name=name;
    }
    public Category(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    @Override
    public String toString() {
        System.out.println("Category: " +
                "name = " + name);
        for (int i = 0; i < products.length; i++) {
            String[] prod = new String[3];
            prod[0]=products[i].name;
            prod[1]=products[i].price.toString();
            prod[2]=products[i].rating.toString();
            System.out.printf("name = %s, price = %s, rating = %s",prod[0],prod[1],prod[2]);
            System.out.println();
        }

        return null;
    }
}
