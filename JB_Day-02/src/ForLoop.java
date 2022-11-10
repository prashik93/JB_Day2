import java.util.Scanner;

public class ForLoop {
    Scanner scnr;
    int num;
    public ForLoop() {
        scnr = new Scanner(System.in);
    }

    public void palindrome() {
        System.out.println("Enter a number : ");
        num = scnr.nextInt();
        int rem = 0;
        int rev = 0;
        for (int i = num; i > 0; i = i / 10) {
            rem = i % 10;
            rev = (rev * 10) + rem;
        }
        if(num == rev) {
            System.out.println("Entered number : " + num + " is = " + rev + " i.e a palindrome number");
        } else {
            System.out.println("Entered number : " + num + " is not = " + rev + " i.e not a palindrome number");
        }
    }

    public void reverseNumber() {
        System.out.println("Enter a number : ");
        num = scnr.nextInt();
        int temp = num;
        int rem = 0;
        int rev = 0;
        for (int i = num; i > 0; i = i /10) {
            rem = i % 10;
            rev = (rev * 10) + rem;
        }
        System.out.println("Reverse of a number " + temp + " is " + rev);
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
