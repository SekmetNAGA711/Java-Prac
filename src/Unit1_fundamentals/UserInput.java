package Unit1_fundamentals;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typedinput = scanner.next(); // next method (type something)

        System.out.println(typedinput);



        System.out.println("what is your name?");

        String myName = scanner.next();
        System.out.println(myName + " is a name nice");




        System.out.println("How old are you?");
         int myAge = scanner.nextInt();

        System.out.println(myAge + " is perfect");




    }




}
