package sem_1;

public class Main {
    public static void main(String[] args) {
//        Product prod = new Product("pizza",120.99,7.9);
        Product birne = new Product("birne",12.0,10.0);
        Product apfel = new Product("apfel",4.0,4.0);
        Product gurke = new Product("gurke",8.0,10.0);
        Product tomate = new Product("tomate",6.0,10.0);
        Product brod = new Product("brod",12.0,10.0);
        Product brotchen = new Product("brotchen",12.0,10.0);

//        String[] obst_massive = new String[]{"birne","apfel"};
//        String[] gemuse_massive = new String[]{"gurke","tomate"};
//        String[] brod_massive = new String[]{"brod","brotchen"};
        Category obst = new Category("Obst",new Product[]{birne,apfel});
        Category gemuse = new Category("Gemuse",new Product[]{gurke,tomate});
        Category brods = new Category("Brod",new Product[]{brod,brotchen});

//        String[] list_Ivan = new String[]{"brod","apfel"};
        User Ivan = new User("Ivan","asjnekrf",new Basket(new Product[]{brod,apfel}));
//        String[] list_Anna = new String[]{"gurke","brotchen"};
        User Anna = new User("Anna","ksfbvkjbn",new Basket(new Product[]{gurke,tomate}));
//        String[] list_Petr= new String[]{"birne","tomate"};
        User Petr = new User("Petr","sjdnbcw",new Basket(new Product[]{birne,tomate}));

        
        System.out.println(obst);
    }
}
