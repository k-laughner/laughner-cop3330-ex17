/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kaylee Laughner
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    static Scanner console = new Scanner(System.in);
    static public char restart = 'n';

    public static void main(String[] args) {
      do {
        try{
          System.out.println("Enter a 1 if you are male or a 2 if you are female:");
          int sex = console.nextInt();

          System.out.println("How many ounces of alcohol did you have?");
          float oz = console.nextFloat();

          System.out.println("What is your weight, in pounds?");
          int lb = console.nextInt();

          System.out.println("How many hours has it been since your last drink?");
          int hours = console.nextInt();

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
          System.out.printf("Your BAC is %.5f.\n", bac);

          if(bac<0.08){
              System.out.println("It is legal for you to drive.");
          }
          else{
              System.out.println("It is not legal for you to drive.");
          }
          break;
        }
        catch (InputMismatchException fe){
          System.out.println("You entered the incorrect data type. Please try again.");
          restart='y';
          console.next();
        }
      }
      while (restart == 'y');
  }
}
