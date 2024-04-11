package Unit1_fundamentals;

import java.util.concurrent.ThreadLocalRandom;

public class Loops {

    public static void main(String[] args) {



        for (int i = 0; i < 27; i++) {//a for loop servers as a more compat version of a while loop, all in one loop. In a for loop the parentheses holds the variable,
            //the condition and the increment. It will check the condition, run the body and increment in that order same as the while loop only difference is that it is
            // written differently. The while loop holds only the condition in the parentheses
            System.out.println(i);
        }


        System.out.println();


        for(int i = 588; i >= 288; i--) {

            System.out.println(i);
        }


        System.out.println();


        int i = 0;  //creating a variables ensures that the condition will be false at some point

        while(i < 18) {//The difference btw a while loop and an if statement is that if a condition is met the body of program is executed and ends,
            // In the while statement when the end of the body is reached the program goes back up to the top and check the condition again, if it true it will
            //run the body again, it will keep repeating this until the condition is false, it will also skip the body of the while statement and move on.
            System.out.println(i);
            i++; // same as i = i+1 or i =+ 1

        }

        System.out.println();

        breakAndContinue();

        System.out.println();

        doWhileLoop();


    }

    public static void breakAndContinue() {

           for(int i = 1; i<=5; i++) {
             if(i==7) {
                 break;
             }
               System.out.println(i);

           }

        System.out.println();

        for(int i = 1; i<=6; i++) {
            if(i==4) {
                continue;
            }
            System.out.println(i);

        }



    }


    public static void doWhileLoop() {// The do-While loop is similiar to the while loop except the condition is checked last
//        int i = 0;
//
//       do {
//           i++;
//       } while (i < 6);


        ThreadLocalRandom.current().nextInt(1, 7); // This method is used to generate random numbers, like throwing dice giving range from 1 to 6, the first number is inclusive while the second number is exclusive




    }


}
