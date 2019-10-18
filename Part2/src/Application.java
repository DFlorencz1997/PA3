import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class Application {
    @Test
    public void test() throws Exception{
        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);
        SavingsAccount.modifyInterestRate(.04);
        assertEquals(2006.67, saver1.calculateMonthlyInterest(),0.1);
        assertEquals(2013.36, saver1.calculateMonthlyInterest(),0.1);
        assertEquals(2020.07, saver1.calculateMonthlyInterest(),0.1);
        assertEquals(2026.80, saver1.calculateMonthlyInterest(),0.1);
        assertEquals(2033.56, saver1.calculateMonthlyInterest(),0.1);
        assertEquals(2040.33, saver1.calculateMonthlyInterest(),0.1);
        assertEquals(2047.14, saver1.calculateMonthlyInterest(),0.1);
        assertEquals(2053.96, saver1.calculateMonthlyInterest(),0.1);
        assertEquals(2060.81, saver1.calculateMonthlyInterest(),0.1);
        assertEquals(2067.68, saver1.calculateMonthlyInterest(),0.1);
        assertEquals(2074.57, saver1.calculateMonthlyInterest(),0.1);
        assertEquals(2081.48, saver1.calculateMonthlyInterest(),0.1);


        assertEquals(3010.00, saver2.calculateMonthlyInterest(),0.1);
        assertEquals(3020.03, saver2.calculateMonthlyInterest(),0.1);
        assertEquals(3030.10, saver2.calculateMonthlyInterest(),0.1);
        assertEquals(3040.20, saver2.calculateMonthlyInterest(),0.1);
        assertEquals(3050.33, saver2.calculateMonthlyInterest(),0.1);
        assertEquals(3060.50, saver2.calculateMonthlyInterest(),0.1);
        assertEquals(3070.70, saver2.calculateMonthlyInterest(),0.1);
        assertEquals(3080.94, saver2.calculateMonthlyInterest(),0.1);
        assertEquals(3091.21, saver2.calculateMonthlyInterest(),0.1);
        assertEquals(3101.51, saver2.calculateMonthlyInterest(),0.1);
        assertEquals(3111.85, saver2.calculateMonthlyInterest(),0.1);
        assertEquals(3122.22, saver2.calculateMonthlyInterest(),0.1);

        SavingsAccount.modifyInterestRate(.05);
        assertEquals(2090.16, saver1.calculateMonthlyInterest(),0.1);
        assertEquals(3135.23, saver2.calculateMonthlyInterest(),0.1);
    }
}