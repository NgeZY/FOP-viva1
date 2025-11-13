import java.util.Scanner;
import java.lang.Math;

public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int q, a, b, n;
        int result = 0;
        do{
            System.out.println("Enter your number queries: ");
            q = s.nextInt();
            if(q > 500){
                System.out.println("Your number queries cannot exceed 500, please enter another");
                System.out.println();
            }
        } while (q > 500);

        for(int i = 0; i < q; i++){
            System.out.println("Enter your initial value, multiplier seed and charm length");
            do{
                a = s.nextInt();
                if(a > 50 || a < 0){
                    System.out.println("Your initial value cannot be a negative number or larger than 50...");
                    System.out.println();
                }
            } while (a < 0 || a > 50);

            do{
                b = s.nextInt();
                if(b > 50 || b < 0){
                    System.out.println("Your multiplier seed cannot be a negative number or larger than 50...");
                    System.out.println();
                }
            } while (b < 0 || b > 50);

            do{
                n = s.nextInt();
                if(n < 1 || n > 15){
                    System.out.println("Your charm length need to be between 1 to 15...");
                    System.out.println();
                }
            } while (n < 1 || n > 15);

            for(int j = 0; j < n; j++){
                result = (int)(a + (b * Math.pow(2, j)));
                System.out.printf("%d ", result);
            }
            System.out.println();
        }
    }
}
