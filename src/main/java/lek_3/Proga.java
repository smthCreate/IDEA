package lek_3;

import java.util.Iterator;
import java.util.Objects;

public class Proga {
    public static void main(String[] args) {
//        Foo foo1 = new Foo() {
//            @Override
//            public void m1() {
//                System.out.println("m1");
//            }
//
//            @Override
//            public void m2() {
//                System.out.println("m2");
//            }
//        };
//        foo1.m1();
//        Foo foo2 = new Foo() {
//            @Override
//            public void m1() {
//                System.out.println("..m1");
//            }
//
//            @Override
//            public void m2() {
//                System.out.println("..m2");
//            }
//        };
//        foo2.m2();


        Worker worker = new Worker("Anton","Bulgakov",24,75);
        Iterator<String> components = worker;
        while (components.hasNext()){
            System.out.println(worker.next());
        }


    }
}
