package org.example;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat();
////        cat.name = "Барсик";
////        cat.color = "red";
////        cat.age = 9;
        Cat cat2 = new Cat("cat","black",12);
////        cat2.setAge(8);
//        System.out.printf("%s, %s, %d",cat2.getName(),cat2.getColor(),cat2.getAge());
//        Cat cat3 = new Cat("cat","black",-12);
//        System.out.printf("%s, %s, %d",cat3.getName(),cat3.getColor(),cat3.getAge());

//        Vector vector = new Vector(1.0,2.0,3.0);
//        System.out.println(vector);
//        System.out.println(vector.vecLength());
//        Vector vector2 = new Vector(1.0,2.0,56.0);
//        System.out.println(vector.scalar(vector2));
//
//        System.out.println(vector.vectComp(vector2));
//
//        System.out.println(vector.cosinVec(vector2));
//
//        System.out.println(vector.summa(vector2));
//
//        System.out.println(vector.differ(vector2));

        cat2.animalInfo();
        cat2.voice();
    }
}