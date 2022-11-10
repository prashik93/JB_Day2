import java.util.Scanner;

public class ForLoop {
    Scanner scnr;
    int num;
    public ForLoop() {
        scnr = new Scanner(System.in);
    }

    public void sumOfNaturalNumbers() {
        System.out.println("Enter a number : ");
        num = scnr.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of Natural number " + num + " is " + sum);
    }
}
