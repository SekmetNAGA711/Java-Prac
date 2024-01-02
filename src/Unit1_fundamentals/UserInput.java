package Unit1_fundamentals;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); //System.in - scan the keyboard/read from the system's input


        System.out.println("what is your name?");

        String myName = scanner.next(); // next method (type something)
        System.out.println(myName + " is a nice name");




        System.out.println("\nHow old are you?");
         int myAge = scanner.nextInt();

        System.out.println(myAge + " is a perfect age");
        System.out.println("Your name is " + myName + " and you are " + myAge + " years old.");


        System.out.println("\nHow tall are you in meters?");
        double myHeight = scanner.nextDouble();
        System.out.println("you are " + myHeight + " meters tall");



        double averageMaleHeight = myHeight -1.80;
        double averageFemaleHeight = myHeight - 1.73;

        System.out.println("\n The difference between you height and the average is: ");
        System.out.format("%.2fm if you are a male \n", averageMaleHeight);
        System.out.format("%.2fm if you are a female ", averageFemaleHeight);


        System.out.println("\nWant to know about me?");
        String info = scanner.next();
        System.out.format("I have %.2f cats, %d parrots, and 1 %s ", 9.9, 2, "panther");// format specifier 'd' is for integers, 's' for strings %.2 is round to 2 decimal place 'f' for decimal/float


    }


    public static void tokens ()
    {
        Scanner scanner = new Scanner(System.in);

        scanner.next();
        scanner.nextInt();
        scanner.nextDouble();
        boolean token = scanner.nextBoolean();

        System.out.println("What is your name");
        String userName = scanner.next();
        System.out.println(userName + " is your name");

    }




}
