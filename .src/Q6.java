import java.util.Scanner;

public class Q6 {
    public static final int logLength = 50;
    public static final int resultLength = 200;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String log;
        int times;
        do{
            System.out.println("Enter the number of logs: ");
            times = sc.nextInt();
            if(times < 1 || times > 100){
                System.out.println("Your number of logs must be between 1 and 100");
                System.out.println();
            }
        } while (times < 1 || times > 100);

        for(int i = 0; i < times; i++){
            boolean upperCase;
            do {
                upperCase = false;
                System.out.println("Enter your log: ");
                log = sc.next();
                for(int l = 0; l < log.length(); l++){
                    if(Character.isUpperCase(log.charAt(l))){
                        upperCase = true;
                        break;
                    }
                }

                if(log.length() > logLength)
                    System.out.println("Your log must be between 1 and 50 characters");

                if(upperCase)
                    System.out.println("Your log cannot contains uppercase characters");

            } while (log.length() > logLength || upperCase);

            if(Character.isDigit(log.charAt(0))){
                System.out.println("Invalid Log");
                continue;
            }

            String result = "";
            boolean invalid = false;
            for(int j = 0; j < log.length(); j++){
                if(Character.isLetter(log.charAt(j)))
                    result += log.charAt(j);
                else if(Character.isDigit(log.charAt(j))){
                    if (log.charAt(j) == '1' || log.charAt(j) == '0') {
                        invalid = true;
                    } else {
                        if(j == 0 || Character.isDigit(log.charAt(j-1))){
                            invalid = true;
                            break;
                        } else {
                            int count = log.charAt(j) - '0';
                            for(int k = 1; k < count; k++)
                                result += log.charAt(j-1);
                        }
                    }
                }
            }

            if(invalid)
                System.out.println("Invalid Log");
            else if(result.length() > resultLength)
                System.out.println("Your decompressed log has exceed 200 characters");
            else
                System.out.println(result.length());
        }
    }
}
