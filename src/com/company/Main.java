package com.company;

import java.util.Scanner;

public class Main {

    public static void checkStick(int stickA, int stickB, int stickC){
        if (stickA <= 0 || stickB <= 0 || stickC <= 0||stickA >= stickB + stickC || stickB >= stickB + stickC || stickC >= stickA + stickB){
            System.out.println("Can't make a triangle! :(");
        }else{
            System.out.println("Can make a triangle! :)");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter Stick A: ");
            int stickA = in.nextInt();
            System.out.println("Enter Stick B: ");
            int stickB = in.nextInt();
            System.out.println("Enter stick C: ");
            int stickC = in.nextInt();
            checkStick(stickA, stickB, stickC);
        }
        catch (Exception e){
            System.err.println("Invalid. try with a number");
            return;
        }
    }
}
