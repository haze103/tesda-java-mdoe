import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strInput, strReversed;
        boolean bolResult;
        
        System.out.print("Enter a word: ");
        strInput = sc.next();

        StringBuilder sbChecker = new StringBuilder(strInput);
        sbChecker = sbChecker.reverse();
        strReversed = sbChecker.toString();

        bolResult = strInput.equals(strReversed);

        if (bolResult)
            System.out.println("The input string is a palindrome.");
        else
            System.out.println("The input string is not a palindrome.");
    }
}
