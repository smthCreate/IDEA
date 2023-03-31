package sem_1;

public class Product {
    protected String name;
    protected Double price;
    protected Double rating;

    public Product(String name,Double price, Double rating){
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Cannot change price");
        }
        if (rating > 0) {
            this.rating = rating;
        } else {
            System.out.println("Cannot change rating");
        }
        this.name=name;
    }
    public Product(){}

    @Override
    public String toString() {
        return "Product: " +
                "name = " + name +
                ", price = " + price +
                ", z = " + rating;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Double getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
