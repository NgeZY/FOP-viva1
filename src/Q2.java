import java.util.Scanner;
import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int luckyDigit, queries;
        String num, result;
        int luckyCount = 0;
        int zeroCount = 0;
        int evenCount = 0;
        int oddCount = 0;
        long number;

        do {
            System.out.println("Enter your number of queries: ");
            queries = sc.nextInt();
            if(queries < 1 || queries > 200){
                System.out.println("Please enter a number between 1 and 200");
                System.out.println();
            }
        } while (queries < 1 || queries > 200);

        for(int i = 0; i < queries; i++) {
            do {
                System.out.println("Enter your number and lucky number: ");
                num = sc.next();
                luckyDigit = sc.nextInt();
                number = Long.parseLong(num);
                if (number < 0 || number > 2000000000) {
                    System.out.println("Your number must be between 0 and 2,000,000,000");
                    System.out.println();
                }
                if (luckyDigit < 0 || luckyDigit > 9) {
                    System.out.println("Your lucky number must be between 0 and 9");
                    System.out.println();
                }
            } while ((luckyDigit < 0 || luckyDigit > 9) || (number < 0 || number > 2000000000));

            for (int j = 0; j < num.length(); j++) {
                int digit = num.charAt(j) - '0';
                if (digit == luckyDigit)
                    luckyCount++;
                else if (digit == 0)
                    zeroCount++;
                else if (digit % 2 == 0)
                    evenCount++;
                else if (digit % 2 == 1)
                    oddCount++;
            }

            if (luckyCount > zeroCount && luckyCount > evenCount && luckyCount > oddCount)
                result = "LUCKY";
            else if (evenCount > zeroCount && evenCount > oddCount)
                result = "BALANCED";
            else if (oddCount > zeroCount && oddCount > evenCount)
                result = "ENERGETIC";
            else
                result = "NEUTRAL";

            System.out.println(result);
        }
    }
}
