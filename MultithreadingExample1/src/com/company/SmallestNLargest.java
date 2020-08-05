package com.company;

public class SmallestNLargest extends maxValue {
    int smallest = randomB[0];
    int largest = randomB[9];
    @Override
    public void run(){
        //Task 2: Find the smalles and largest value

        for (int j=0;j<=9;j++){
            if (randomB[j]<smallest) smallest = randomB[j];
            if (randomB[j]>largest) largest = randomB[j];




        }


    }

}

