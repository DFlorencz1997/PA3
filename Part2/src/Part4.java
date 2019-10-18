import java.security.SecureRandom;
import java.util.Scanner;

public class Part4 {

    public static void main(String[] args) {
        int reset = 0;
        Scanner scan = new Scanner(System.in);
        SecureRandom sr = new SecureRandom();
        while (reset<1) {
            int points = 0;
            System.out.println("Part 4:");
            System.out.println("Enter difficulty level (1 for Easy, 2 for Hard): ");
            int difficulty = scan.nextInt();


            for (int i = 0; i < 10; i++) {
                points = points + grade(scan, sr, difficulty);
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

    private static int grade(Scanner scan, SecureRandom sr,int diff) {
        int point=1;
        int firstNum=0;
        int secondNum=0;
        if(diff==1){
            firstNum = sr.nextInt(9) + 1;
            secondNum = sr.nextInt(9) + 1;
        }
        else if(diff == 2){
            firstNum = sr.nextInt(99) + 1;
            secondNum = sr.nextInt(99) + 1;
        }
        else{
            System.out.println("");
            grade(scan,sr,diff);
        }
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