package lab.viva1;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of words to test: ");
        int T = sc.nextInt();


        for (int i = 0; i < T; i++) {

            System.out.print("\nEnter word " + (i + 1) + ": ");
            String word = sc.next().toLowerCase();


            boolean isHarmony = true;


            char lastLetter = word.charAt(word.length() - 1);
            if (isVowel(lastLetter)) {
                isHarmony = false; //
            }


            for (int j = 0; j < word.length() - 1; j++) {
                char current = word.charAt(j);
                char next = word.charAt(j + 1);

                if (isVowel(current) && isVowel(next)) {
                    isHarmony = false;
                    break;
                }
            }


            if (isHarmony) {
                System.out.println(word + " has: Harmony");
            } else {
                System.out.println(word + " has: Chaos");
            }
        }
    }


    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';

    }
}
