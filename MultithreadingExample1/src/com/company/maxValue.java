package com.company;

public class maxValue extends Thread {

 public    int[] A = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

 public    int[] randomB = new int[10];
    @Override
    public void run() {
        //Task 1

        for (int i = 0; i < randomB.length; i++) {
            randomB[i] = ((int) (Math.random() * 10));
            System.out.print(randomB[i]);
        }

    }
}




