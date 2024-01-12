package Unit1_fundamentals;

import java.util.Scanner;

public class IfEsleStatements {

    public static void main(String[] args)

    {
        Scanner scanner = new Scanner(System.in);

     if (10>5) {
//         if the condition is true the program will run the body, if it is false the program will ignore the body completely
         System.out.println("this is true");
     }

        System.out.println("Welcome to this super fast rollercoaster the highest coaster in the world!");
        System.out.print("please enter you height in centimeters to get started:");

        int height = scanner.nextInt();


        if(height < 140) {

            System.out.println("Sorry you are below the height requirement");
        }
        else if (height > 210) {
            System.out.println("sorry you are above the height requirement");
        }
        else {

            System.out.println("Get ready for a great ride, hope you enjoy it!");
        }






    }










}
