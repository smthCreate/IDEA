package org.example;

public class Cat extends Animal{
//    private String name;
//    private String color;
//    private Integer age;

    public Cat(String name,String color, Integer age){
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Cannot change age");
        }
//        this.age=age;
        this.color=color;
        this.name=name;
    }
    public Cat(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Cannot change age");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void voice() {
        System.out.println("mau");
    }
}
