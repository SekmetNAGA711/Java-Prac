package Unit1_fundamentals;

import java.util.Scanner;

public class Tokens {


    public static void main(String[] args)

    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your full name please?");
        String userFirstName = scanner.next(); // next() method only scans 1 token
        String userLastName = scanner.next(); // next() method only scans 1 token
        System.out.println("Your name is " + userFirstName + " " + userLastName);

        System.out.println("\nwhat is your mothers full name?");
        scanner.next(); // this is needed so the program does not think it has collected everything and ends
        String motherName = scanner.nextLine(); // nextline() method scans the entire line
        System.out.println("Your Mother's name is " + motherName);



    }







}
