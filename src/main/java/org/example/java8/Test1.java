package org.example.java8;

public class Test1 {
    public static void main(String[] args) {
        ITest iTest = new Test();
        String msg = iTest.m1();
        System.out.println("===>> " + msg);

        ITest iTest1 = () -> {
            return "Hello world";
        };
        String msg1 = iTest1.m1();
        System.out.println("===>> " + msg1);

        ITest iTest2 = () -> "Hello world";
        String msg2 = iTest2.m1();
        System.out.println("===>> " + msg2);
        System.out.println("===========================================================");

        IAddition iAddition = (int a,int b)-> {
            return a+b;
        };
        int x = iAddition.sum(2,4);
        System.out.println("===>> " + x);

        IAddition iAddition1 = (a,b)-> a+b;

        int y = iAddition1.sum(10,12);
        System.out.println("===>> " + y);
    }
}
