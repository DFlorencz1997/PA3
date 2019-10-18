public class SavingsAccount {
    public static double annualInterestRate = 0;

    private double savingsBalance;

    public SavingsAccount(double amount){
        this.savingsBalance = amount;
    }

    public void calculateMonthlyInterest(){
        double interest;
        interest = (this.savingsBalance * annualInterestRate)/12;
        this.savingsBalance += interest;
    }

    public void showBalance(){
        System.out.printf("$%.2f  ", this.savingsBalance);
    }

    public static void modifyInterestRate(double rate){
        annualInterestRate = rate;
    }

    public static void main(String[] args){
        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);
        SavingsAccount.modifyInterestRate(.04);
        System.out.println("Start amnt: $2000.00  $3000.00");
        for(int i=1; i<13; i++){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.print("Month " + i + ": ");
            saver1.showBalance();
            saver2.showBalance();
            System.out.println();
        }
        System.out.println();

        System.out.println("Changing annual interest rate to 5.0%");
        System.out.println();
        SavingsAccount.modifyInterestRate(.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.print("Month 13: ");
        saver1.showBalance();
        System.out.print("  ");
        saver2.showBalance();
        System.out.println();
    }
}

