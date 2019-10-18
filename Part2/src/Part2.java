import java.security.SecureRandom;
import java.util.Scanner;

public class Part2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Part 2:");
        SecureRandom sr = new SecureRandom();
        System.out.print("Number of questions: ");
        int numQuestions = scan.nextInt();

        for (int i = 0; i < numQuestions; i++) {
            grade(scan, sr);
        }
    }

    private static void grade(Scanner scan, SecureRandom sr) {
        int firstNum = sr.nextInt(9) + 1;
        int secondNum = sr.nextInt(9) + 1;
        System.out.printf("What is %d times %d: ",firstNum,secondNum);
        int guess = scan.nextInt();
        int j = 0;
        int responseNum;

        while (j < 1) {

            responseNum = sr.nextInt(4);

            if (guess == firstNum * secondNum) {
                switch(responseNum){
                    case 0:
                        System.out.println("Very good!");
                        break;
                    case 1:
                        System.out.println("Excellent!");
                        break;
                    case 2:
                        System.out.println("Nice Work!");
                        break;
                    case 3:
                        System.out.println("Keep up the good work!");
                        break;
                    default:
                        System.out.print("Error line 45");
                        break;
                }

                j = 1;
            } else {
                switch(responseNum){
                    case 0:
                        System.out.println("No. Please try again.");
                        break;
                    case 1:
                        System.out.println("Wrong. Try once more.");
                        break;
                    case 2:
                        System.out.println("Don’t give up!");
                        break;
                    case 3:
                        System.out.println("No. Keep trying.");
                        break;
                    default:
                        System.out.print("Error line 65");
                        break;

                }
                guess = scan.nextInt();

            }
        }

    }

}