/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kaylee Laughner
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a 1 if you are male or a 2 if you are female:");
        Scanner input = new Scanner(System.in);
        int sex = input.nextInt();

        System.out.println("How many ounces of alcohol did you have?");
        Scanner input2 = new Scanner(System.in);
        float oz = input2.nextFloat();

        System.out.println("What is your weight, in pounds?");
        Scanner input3 = new Scanner(System.in);
        int lb = input3.nextInt();

        System.out.println("How many hours has it been since your last drink?");
        Scanner input4 = new Scanner(System.in);
        int hours = input4.nextInt();

        double r = 0;

        if(sex==1){
            r = 0.73;
        }
        else if (sex==2){
            r = 0.66;
        }
        else{
            System.out.println("Please enter 1 or 2 to indicate your sex.");
        }
        double bac = (oz*(5.14/lb)*r) - (0.015*hours);
        System.out.println(bac);

        if(bac<0.08){
            System.out.println("It is legal for you to drive.");
        }
        else{
            System.out.println("It is not legal for you to drive.");
        }
    }
}
