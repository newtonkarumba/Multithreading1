package com.company;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        maxValue a = new maxValue();
        SmallestNLargest snl = new SmallestNLargest();
        Priting p = new Priting();

    Thread thread1 = new Thread( a);
    Thread thread2 = new Thread( snl);
    Thread thread3 = new Thread( p);

    a.start();
    a.join();
    snl.start();
    snl.join();
    p.start();
    p.join();


    }
}
