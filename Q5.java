import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter number of words to be validated :");
        
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        int t = scanner.nextInt();
        scanner.nextLine(); 

        String[] words = new String[t]; 

        System.out.println("Please enter " + t + " words:");

        for (int i = 0; i < t; i++) {
            words[i] = scanner.nextLine().trim(); 
        }

        scanner.close(); 
        
        System.out.println("--- Output ---");

        for (int i = 0; i < t; i++) {
            String word = words[i];
            int n = word.length();
            
            boolean isChaos = false; 

            if (n > 0) { 
                char lastChar = word.charAt(n - 1);
                
                if (lastChar == 'a' || lastChar == 'e' || lastChar == 'i' || 
                    lastChar == 'o' || lastChar == 'u') {
                    
                    isChaos = true; 
                }
            }
            
            if (!isChaos) { 
                for (int j = 0; j < n - 1; j++) {
                    char current = word.charAt(j);
                    char next = word.charAt(j + 1);
                    
                    boolean currentIsVowel = (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u');
                    boolean nextIsVowel = (next == 'a' || next == 'e' || next == 'i' || next == 'o' || next == 'u');

                    if (currentIsVowel && nextIsVowel) {
                        isChaos = true; 
                        break; 
                    }
                }
            }
            
            if (isChaos) {
                System.out.println("Chaos");
            } else {
                System.out.println("Harmony");
            }
        } 
    }
}