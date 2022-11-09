import java.util.Scanner;

public class WhileLoop {
    Scanner scnr;
    int num;

    public WhileLoop() {
        scnr =new Scanner(System.in);

    }
    public void sumOfNaturalNumbers() {
        System.out.println("Enter a number : ");
        num = scnr.nextInt();
        int sum = 0;
        int i = 0;
        while (i <= num) {
            System.out.println(i);
            sum = sum + i;
            i = i + 1;
        }
        System.out.println("Sum of n Natural numbers is : " + sum);
    }

    public void reverseNumber() {
        System.out.println("Enter a number : ");
        num = scnr.nextInt();
        int temp = num;
        int rev = 0;
        int rem  = 0;
        while(num > 0) {
            rem = num % 10;
            rev = (rev *10) + rem;
            num = num / 10;
        }
        System.out.println("Reverse of " + temp + " is : " + rev);
    }
}
