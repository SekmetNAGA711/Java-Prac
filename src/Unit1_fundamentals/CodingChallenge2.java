package Unit1_fundamentals;

import java.util.Scanner;

public class CodingChallenge2 {


    public static void main(String[] args)

    {
      Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you");
        int age = scanner.nextInt();

        System.out.println("You have lived " + age + " years, In another " + age + " years you will be " + age * 2 + " years old\n");


       exercise2();


    }

    public static void exercise2 (){

        Scanner scanner = new Scanner(System.in);

        System.out.println("What will you have for dinner ?");
        String dinner = scanner.nextLine();

        System.out.println("how much does the dinner cost?");
        double costForDinner = scanner.nextDouble();

        System.out.println("How many people will be eating with you?");
        int groupNumber = scanner.nextInt();

//        System.out.println("If the bill is split among " + groupNumber + " people, each person will pay $" + (costForDinner / groupNumber));
        System.out.format("If the bill is split among " + groupNumber + " people, each person will pay $ %.2f",  costForDinner / groupNumber);


    }




}
