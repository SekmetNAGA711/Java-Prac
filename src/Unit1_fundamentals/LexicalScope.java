package Unit1_fundamentals;

import java.util.Scanner;

public class LexicalScope {



    public static void main(String[] args) {

//        int x = 10; //x can be accessed anywhere, it can be used in the if statement but not outside main method
//        if(true) {
//            x = 20;
//            int y = 10;// Y is declared in the if statement and can only be used inside the if statement
//        }



        int numberOfPets; //numberOfPets would need to be declared outside the if statement

        if(true) {// Note: if this is false the code within the brackets will not run; which will result in numberOfPets in
            // System.out.println("you have " + numberOfPets) to give an error, because no int variable was initialized


            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of pets you own: ");
            numberOfPets = scanner.nextInt();
//           ****** int numberOfPets = scanner.nextInt(); // numberOfPets can only be used inside the if statement giving an error when we
//           to use it anywhere else*******
        }
           System.out.println("you have " + numberOfPets);// this would be an error if the numberOfPets is declared inside
//          the if statement;***********



    }










}
