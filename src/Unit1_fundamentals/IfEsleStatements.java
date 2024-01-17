package Unit1_fundamentals;

import java.util.Scanner;

public class IfEsleStatements {

    public static void main(String[] args)

    {
        Scanner scanner = new Scanner(System.in);

     if (10>5) {
//       if the condition is true the program will run the body, if it is false the program will ignore the body completely
         System.out.println("this is true");
     }

        System.out.println("Welcome to this super fast rollercoaster the highest coaster in the world!");
        System.out.print("please enter you height in centimeters to get started:");

        int height = scanner.nextInt();


        if(height <= 140) {

            System.out.println("Get ready for a great ride, hope you enjoy it!");
        }
        else if (height < 210 || height == 210) {
            System.out.println("sorry you are above the height requirement");
        }

        else {

            System.out.println("Sorry, you are no can do");
        }

        compareStrings ();


    }

    public static void compareStrings () {

        System.out.println("pasta".equals("pasta")); //comparing strings

        Scanner scanner = new Scanner(System.in);

        System.out.println("Age: ");

        int age = scanner.nextInt();

        System.out.println("Do you have a VIP Pass? yes/no: ");

        String vipPassReply = scanner.next();

        if (age >= 18) {//nested if statement
            if (vipPassReply.equals("yes") && age >= 70) {
                System.out.println("Thanks, go on in.");
            } else {
                System.out.println("Sorry, you must have a VIP Pass.");
            }
        }
        else {
                System.out.println("Sorry, you must be over 18.");
            }


        }


//        if((age >= 18 && vipPassReply.equals("yes")) || age >= 70) { // can put brackets around age to make it easier to read
//            System.out.println("thanks, go on in");
//        }
//        else{
//            System.out.println("sorry, you can not pass.");
//        }

    }






}
