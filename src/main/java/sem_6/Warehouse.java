package sem_6;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data

public class Warehouse {
    private List<Product> products;

    public Warehouse(List<Product> products) {
        this.products = products;
    }
    public Warehouse(){
        this.products = new ArrayList<>();
    }

    public void startWork(){
        Prompt prompt = new Prompt();
        System.out.println("For correct work we need at least 1 Product\nAdd him below");
        addingProd(prompt);

        while (true){
            checkUp(prompt);
            System.out.println("Menu:\n1. Add product\n" +
                    "2. Delete product\n" +
                    "3. Increase  amount\n" +
                    "4. Decrease  amount\n" +
                    "5. Show all products");
            String answer = (String) prompt.promptStr("Input a number from menu");
            if (answer.equals("1")) {
                addingProd(prompt);
            }
            if (answer.equals("2")){
                deletingProd(prompt);
            }
            if (answer.equals("3")){
                increasingProd(prompt);
            }
            if (answer.equals("4")){
                decreasingProd(prompt);
            }
            if (answer.equals("5")){
                outList(products);
            }
            String cmd = (String) prompt.promptStr("Do you want to continue?(Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }else break;
        }
    }

    private void checkUp(Prompt prompt) {
        if (products.size() != 0) {
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getAmount() <= 1) {
                    Order order = new Order();
                    int newAmount = prompt.promptI("We have low amount of " + products.get(i).getName()
                            + ". How much we can order, if its price to buy is " + products.get(i).getPrice() * 0.5);
                    products.set(i, order.order(products.get(i), newAmount));
                }
            }
        } else {
            System.out.println("For correct work we need at least 1 Product\nAdd him below ");
            addingProd(prompt);
        }
    }

    private void decreasingProd(Prompt prompt) {
        String name = (String) prompt.promptStr("Input name of product to increase ");
        int toDecrease = (int) prompt.promptI("Input how much");
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)){
                products.get(i).decreaseQuantity(toDecrease);
            } else System.out.println("No one");
        }
    }

    private void increasingProd(Prompt prompt) {
        String name = (String) prompt.promptStr("Input name of product to increase ");
        int toIncrease = (int) prompt.promptI("Input how much" );
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)){
                products.get(i).increaseQuantity(toIncrease);
            } else System.out.println("No one");
        }
    }

    private void deletingProd(Prompt prompt) {
        String name = (String) prompt.promptStr("Input name of product to delete ");
        if (products.size()>1){
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getName().equals(name)){
                    products.remove(i);
                    System.out.println("Product was deleted");
                } else System.out.println("No one");

            }
        } else {
            String answer = (String) prompt.promptStr("There is only 1 product in our warehouse" +
                            "\nIf you delete this one, our warehouse will be closen" +
                            "\nDo you want to add new one and delete this(Y/N)? ");
            if (answer.equals("Y")){
                addingProd(prompt);
                deletingProd(prompt);
            }
        }
    }

    private void addingProd(Prompt prompt) {
        System.out.println("Input parameters of new product ");
        String name = prompt.promptStr("Input name of new product ");
        int amount = prompt.promptI("Input amount of new product ");
        Double price = prompt.promptD("Input price of new product ");
        products.add(new Product(name,amount,price));
    }


    public void outList(List ls){
        for (int i = 0; i < ls.size(); i++) {
            System.out.println(ls.get(i));

        }
    }
}
