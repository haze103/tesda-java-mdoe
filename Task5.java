import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intInput = new int[3];
        int intLargestNum = 0;

        System.out.print("Enter three (3) numbers: ");
        for (int i = 0; i < 3; i++) {
            intInput[i] = sc.nextInt();

            if (i == 0)
                intLargestNum = intInput[i];
            else 
                if (intLargestNum < intInput[i])
                    intLargestNum = intInput[i];
        }

        if (intInput[0] == intInput[1] && intInput[1] == intInput[2])
            System.out.println("All numbers are equal.");
        else 
            System.out.println("Largest Number = " + intLargestNum + ".");
    }
}
