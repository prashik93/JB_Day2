import java.util.Scanner;

public class SwitchStatements {
    Scanner scnr;
    char chr;
    public SwitchStatements() {
        scnr = new Scanner(System.in);
    }

    public void vowelOrConsonant() {
        System.out.println("Enter a Character : ");
        chr = scnr.next().charAt(0);
        chr = Character.toLowerCase(chr);
        String isVowel;
        switch (chr) {
            case 'a':
                isVowel = "true";
                break;
            case 'e':
                isVowel = "true";
                break;
            case 'i':
                isVowel = "true";
                break;
            case 'o':
                isVowel = "true";
                break;
            case 'u':
                isVowel = "true";
                break;
            default :
                isVowel = "false";
                break;
        }
        if(isVowel.equals("true")) {
            System.out.println("It is an Vowel");
        } else {
            System.out.println("It is an Consonant");
        }
    }
    
    public void monthName() {
        System.out.println("Enter a number : ");
        int num = scnr.nextInt();
        String month = "";
        switch (num) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                System.out.println("Please enter the number between 1 to 12");
        }
    System.out.println(month);    
    }
}
