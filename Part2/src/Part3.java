import java.security.SecureRandom;
import java.util.Scanner;

public class Part3 {

    public static void main(String[] args) {
        int reset = 0;

        Scanner scan = new Scanner(System.in);
        SecureRandom sr = new SecureRandom();
        while (reset<1) {
            int points = 0;
            for (int i = 0; i < 10; i++) {
                points = points + grade(scan, sr);
            }

            System.out.println("Your score is: " + points * 10);
            if (points > 7) {
                System.out.println("Congratulations, you are ready to go to the next level!");
            } else {
                System.out.println("Please ask your teacher for extra help");
            }
            System.out.println("Would you like to start a new test? (enter 0 for yes, 1 for no)");
            reset = scan.nextInt();

        }
    }

    private static int grade(Scanner scan, SecureRandom sr) {
        int point=1;
        int firstNum = sr.nextInt(9) + 1;
        int secondNum = sr.nextInt(9) + 1;
        System.out.printf("What is %d times %d: ",firstNum,secondNum);
        int guess = scan.nextInt();

            if (guess == firstNum * secondNum) {
                System.out.println("Very good!");

            } else {
                System.out.println("No. Please try again.");
                point = 0;
            }
            return point;
    }

}