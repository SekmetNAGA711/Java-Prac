package Unit1_fundamentals;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args)
    {
        //the switch statement is useful for comparing one variable with a number of values

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch(num){
            case 1:
                System.out.println("you entered one");
                break;
            case 2:
                System.out.println("you entered two");
                break;
            case 3:
                System.out.println("you entered three");
            case 4:
                System.out.println("you entered four");
            default:
                System.out.println("invalid number");
                break; //break is not needed at the end of a default, but it is ok to put in it for consistancy.
        }

//        if(num == 1) {
//            System.out.println("You entered the number one");
//        }
//        else if(num ==2){
//            System.out.println("You entered the number 2");
//        }
//        else {
//            System.out.println("Invalid number");
//        }

    }




}
