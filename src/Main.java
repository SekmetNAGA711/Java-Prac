public class Main {


    //*Method 1//
    public static void main(String[] args) {
        System.out.println("Chocolate vegan cheese cake");

        // \n - newline
        // \t - tab
        // \b  - backspace
        // The client said "more vegan cake please", then smiled.
        System.out.println("The client sadig, 'more vegan cake please', then smiled");
        System.out.println("The client sadig, \"more vegan cake please\", then smiled");
        System.out.println("c:\\users\\bill");

        Vanilla();     //Telling the vanilla method when to run, 'transfer control' to Vanilla method, so it can run // method call//
        // can call this as many times, and placed on any line in main

    }

   //*Method 2//
    public static void vanilla() {
        System.out.println("berries");
        System.out.println("banana");
        System.out.println("avocado");//when the body of Vanilla method is reached, main gains control again,
        // and since Vanilla method in the main is the last the program ends

    }

    //few notes - println is a method in the system, it is set up like the main and vanilla methods I've created
    //          - Java is like a recipe, ingredients and the recipe(method(s))

public static void practice() {
        System.out.println("SHOPPING LIST");
        System.out.println("\t- Milk");
        System.out.println("\t\t> Semi-skimmed");
        System.out.println("\t\t> Medium");
        System.out.println("\t- Eggs");
        System.out.println("\t\t> Free-range");
        System.out.println("\t- Bread");

    }

}