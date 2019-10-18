import java.security.SecureRandom;
import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Part 1:");
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

        while (j < 1) {
            if (guess == firstNum * secondNum) {
                System.out.println("Very good!");
                j = 1;
            } else {
                System.out.println("No. Please try again.");
                guess = scan.nextInt();
            }
        }

    }

}