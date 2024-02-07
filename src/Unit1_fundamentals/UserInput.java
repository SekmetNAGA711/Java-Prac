package Unit1_fundamentals;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); //System.in - scan the keyboard/read from the system's input


        System.out.println("Please tell me what your name is?");

        String myName = scanner.next(); // next method (type something)
        System.out.println(myName + " is a nice name");




        System.out.println("\nHow old are you at this very moment?");
         int myAge = scanner.nextInt();

        System.out.println(myAge + " is a perfect age");
        System.out.println("Your name is " + myName + " and you are " + myAge + " years old.");


        System.out.println("\nHow tall are you in meters?");
        double myHeight = scanner.nextDouble();
        System.out.println("you are " + myHeight + " meters tall");



        double averageMaleHeight = myHeight -1.75;
        double averageFemaleHeight = myHeight - 1.62;

        System.out.println("\n The difference between you height and the average is: ");
        System.out.format("%.2fm if you are a male \n", averageMaleHeight);
        System.out.format("%.2fm if you are a female ", averageFemaleHeight);


        System.out.println("\nWant to know about me?");
        String info = scanner.next();
        System.out.format("I love the summer, I have %d brothers and ", 7);//when using format it uses a format specifier (%d) then put a comma after statement then the input of what you want, in this case 7
        System.out.format("I have %.2f cats, %d parrots, and 1 %s ", 9.9, 2, "panther");// format specifier 'd' is for integers, 's' for strings, %f by default rounds to 6 decimal places,  %.2 will round to 2 decimal - add 'f' for decimal/float


    }







}
