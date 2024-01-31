package Unit1_fundamentals;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args)
    {
        //the switch statement is useful for comparing one variable with a number of values

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if(num == 1) {
            System.out.println("You entered the number one");
        }
        else if(num ==2){
            System.out.println("You entered the number 2");
        }

    }




}
