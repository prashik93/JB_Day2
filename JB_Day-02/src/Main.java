public class Main {
    public static void main(String[] args) {
        WhileLoop whileObj = new WhileLoop();
        whileObj.sumOfNaturalNumbers();
        whileObj.reverseNumber();

        singleDigit(args);
        displayUnit(args);

    }
    public static void displayUnit(String[] args) {
        if (args[0].equals("1")) {
            System.out.println("Unit");
        } else if (args[0].equals("10")) {
            System.out.println("Ten");
        } else if (args[0].equals("100")) {
            System.out.println("Hundred");
        } else if (args[0].equals("1000")) {
            System.out.println("Thousand");
        } else {
            System.out.println("Please enter number between 1, 10 , 100, 1000 only");
        }
    }

    public static void singleDigit(String[] args) {
        if (args[0].equals("0")) {
            System.out.println("Zero");
        } else if (args[0].equals("1")) {
            System.out.println("One");
        } else if (args[0].equals("2")) {
            System.out.println("Two");
        } else if (args[0].equals("3")) {
            System.out.println("Three");
        } else if (args[0].equals("4")) {
            System.out.println("Four");
        } else if (args[0].equals("5")) {
            System.out.println("Five");
        } else if (args[0].equals("6")) {
            System.out.println("Six");
        } else if (args[0].equals("7")) {
            System.out.println("Seven");
        } else if (args[0].equals("8")) {
            System.out.println("Eight");
        } else if (args[0].equals("9")) {
            System.out.println("Nine");
        } else {
            System.out.println("Number is not a single digit number");
        }
    }
}