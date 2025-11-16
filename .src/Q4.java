import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        char minChar = 'z' + 1;
        char maxChar = 'a' - 1;
        int min = 0;
        int max = 0;
        int value = 0;
        String firstWhisper = "";
        String lastEcho = "";
        String coreValue = "";
        int gemLength;

        do {
            System.out.println("Enter a word: ");
            word = sc.nextLine().toLowerCase();

            if(word.isEmpty() || word.length() > 50){
                System.out.println("Your word must be between 1 and 50 characters.");
                System.out.println();
            }
        } while (word.isEmpty() || word.length() > 50);

        do {
            System.out.println("Enter the gem length: ");
            gemLength = sc.nextInt();
            if (gemLength < 1 || gemLength > word.length()) {
                System.out.println("Gem length must be between 1 and " + word.length());
            } else {
                break;
            }
        } while (true);


        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) < minChar){
                minChar = word.charAt(i);
                min = i;
            }

            if (word.charAt(i) >= maxChar) {
                maxChar = word.charAt(i);
                max = i;
            }
        }

        for(int i = 0; i <= word.length() - gemLength; i++){
            int tempValue = 0;
            String tempCoreValue = "";

            for(int j = 0; j < gemLength; j++){
                tempValue += word.charAt(i + j);
                tempCoreValue += word.charAt(i + j);
            }
            if(tempValue > value){
                value = tempValue;
                coreValue = tempCoreValue;
            }
        }

        for (int i = 0; i < gemLength && min + i < word.length(); i++)
            firstWhisper += word.charAt(min + i);

        for (int i = 0; i < gemLength && max + i < word.length(); i++)
            lastEcho += word.charAt(max + i);


        System.out.println(firstWhisper);
        System.out.println(lastEcho);
        System.out.println(coreValue);

    }
}
