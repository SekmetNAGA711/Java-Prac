package Unit1_fundamentals;

public class Variables {

//define the variable
// define then declare and then  initialize the variable( with a value)
// mathematical operators + - * /
// = <--this is the assignment operator ** assigns the value on the RIGHT to the variable on the LEFT, work out the values on right and then the assignment happens
// can use () brackets to affect the order of operations
// when declaring a variable we only need to define the variable once. For example int x = 15. x can have any value in it from here out but int does not need to be defined with it because it has been defined initially
        public static void main(String[] args) {

            int guitar = 20 / (4 - 2);

            System.out.println(guitar + 6);


            double x = 2.5;

            double y = guitar - x;

            System.out.println(y);


//variables can be changed and manipulated at any time
//if variables are not defined(int, double etc), they are treated as integers/truncation will happen
            int z = 2;
            int t = 3;
            z= (int) (z + y + x);

            System.out.println(z);




//there are 8 primitive types
// rules are applied to variable naming
// use camelcase for naming

            int age = 27;
            double statueHeight= 14.27;
            boolean isThatTrue = false;
            char userInput = 169; //this is the number for the copywrite symbol, char can be any number or character but only ONE character, numbers will be converted to any symbol or different letters from different languages

            System.out.println(userInput);

            understandStrings();



        }

    //** Strings are not a primitive type in java it is a reference type******
    public static void understandStrings () {
    String e = "England is snowy";
        System.out.println("Abso" + "lutely"); //String concatenation

        String name = "Jeff";

        System.out.println("My"+ " " + "name" + " " + "is" + " " + name);
        System.out.println("My " + "name " + "is " + name);

    // Typecasting
        double food = 2.95;
        int bar = (int) food;

        System.out.println(bar);

       int juice = 17;
       int cup = 4;

        System.out.println((double)juice / cup ); //order of operation will happen first, correct way
        System.out.println((double) (juice/ cup)); // order of operation will happen, this will be 4.0 instead of 4.25


    }



}
