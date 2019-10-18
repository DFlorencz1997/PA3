import java.security.SecureRandom;
import java.util.Scanner;

public class Part5 {

    public static void main(String[] args) {
        int reset = 0;
        Scanner scan = new Scanner(System.in);
        SecureRandom sr = new SecureRandom();
        while (reset<1) {
            int points = 0;
            System.out.println("Part 5:");
            System.out.println("Enter difficulty level (1 for Easy, 2 for Hard): ");
            int difficulty = scan.nextInt();
            System.out.println("Enter operation to practice (1 for Addition, 2 for Subtraction, 3 for Multiplication, and 4 for division): ");
            int op = scan.nextInt();
            if(op == 4){
                System.out.println("Round division to nearest integer");
            }

            for (int i = 0; i < 10; i++) {
                points = points + grade(scan, sr, difficulty,op);
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

    private static int grade(Scanner scan, SecureRandom sr,int diff,int op) {
        int point=1;
        double firstNum=0;
        double secondNum=0;
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
            grade(scan,sr,diff,op);
        }
        switch(op){
            case 1:
                System.out.printf("What is %.2f plus %.2f: ",firstNum,secondNum);
                break;
            case 2:
                System.out.printf("What is %.2f minus %.2f: ",firstNum,secondNum);
                break;
            case 3:
                System.out.printf("What is %.2f times %.2f: ",firstNum,secondNum);
                break;
            case 4:
                System.out.printf("What is %.2f divided by %.2f: ",firstNum,secondNum);
                break;
        }

        double guess = scan.nextDouble();

        if (guess == firstNum + secondNum && op==1) {
            System.out.println("Very good!");
        }
        else if(guess == firstNum - secondNum && op==2){
            System.out.println("Very good!");
        }
        else if(guess == firstNum * secondNum && op==3){
            System.out.println("Very good!");
        }
        else if(guess == (java.lang.Math.round(firstNum/secondNum))&& op==4){
            System.out.println("Very good!");
        }
        else {
            System.out.println("No. Please try again.");
            point = 0;
        }
        return point;
    }

}