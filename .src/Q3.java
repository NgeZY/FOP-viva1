package lab.viva1;
import java.util.Scanner;


public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int T;
        do {
            System.out.print("Enter number of queries (1-50): ");
            T = sc.nextInt();


            if (T < 1 || T > 50) {
                System.out.println("Invalid input. T must be between 1 and 50.");
            }
        } while (T < 1 || T > 50); 


        for (int i = 0; i < T; i++) {

            System.out.println("\n--- Query " + (i + 1) + " ---");


            int H;
            do {
                System.out.print("Enter Height (H) (1-9): ");
                H = sc.nextInt();


                if (H < 1 || H > 9) {
                    System.out.println("Invalid input. H must be between 1 and 9.");
                }
            } while (H < 1 || H > 9);


            char S;


            do {
                System.out.print("Enter Style (A or P): ");
                S = sc.next().charAt(0);


                S = Character.toUpperCase(S);


                if (S != 'A' && S != 'P') {
                    System.out.println("Invalid style. Please re-enter.");
                }

            } while (S != 'A' && S != 'P');



            if (S == 'A') {
                for (int row = 1; row <= H; row++) {
                    for (int j = 1; j <= row; j++) {
                        System.out.print(row);
                    }
                    System.out.println();
                }

            } else if (S == 'P') {
                for (int row = 1; row <= H; row++) {
                    for (int s = 1; s <= H - row; s++) {
                        System.out.print(" ");
                    }
                    for (int asc = 1; asc <= row; asc++) {
                        System.out.print(asc);
                    }
                    for (int desc = row - 1; desc >= 1; desc--) {
                        System.out.print(desc);
                    }
                    System.out.println();
                }
            }
        }
    }
}
