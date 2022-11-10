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
}
