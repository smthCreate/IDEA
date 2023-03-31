package org.example;

public class Animal {
    protected String name;
    protected String color;
    protected Integer age;
    public void animalInfo(){
        System.out.println("Animal "+name);
    }

    public void voice(){
        System.out.println(" Sounds ");

    }

    public void jump(){
        System.out.println("Jumps ");
    }
}
