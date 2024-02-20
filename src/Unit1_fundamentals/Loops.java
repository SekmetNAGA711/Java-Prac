package Unit1_fundamentals;

public class Loops {

    public static void main(String[] args) {



        for (int i = 0; i < 10; i++) {//a for loop servers as a more compat version of a while loop, all in one loop. In a for loop the parentheses holds the variable,
            //the condition and the increment. It will check the condition, run the body and increment in that order same as the while loop only difference is that it is
            // written differently. The while loop holds only the condition in the parentheses
            System.out.println(i);
        }



        int i = 0;  //creating a variables ensures that the condition will be false at some point

        while(i < 10) {//The difference between a while loop and an if statement is that if a condition is met the body of program is executed and ends,
            // In the while statement when the end of the body is reached the program goes back up to the top and check the condition again, if it true it will
            //run the body again, it will keep repeating this until the condition is false, it will also skip the body of the while statement and move on.
            System.out.println("Test");
            i++; // same as i = i+1 or i =+ 1

        }







    }




}
