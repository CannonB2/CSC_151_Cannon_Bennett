import org.junit.jupiter.api.Test;

import com.labs.BankAccount;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    
    @Test 
    void testDepositPositiveAmount() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        assertEquals(100, account.getBalance());
    }

    @Test 
    void testDepositZeroAmount() {
        BankAccount account = new BankAccount();
        account.deposit(0);
        assertEquals(0, account.getBalance());
    }

    @Test 
    void testWithdrawValidAmount() {
        BankAccount account = new BankAccount();
        account.deposit(200);
        account.withdraw(150);
        assertEquals(50, account.getBalance());
    }

    @Test 
    void testWithdrawOverdraft() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        account.withdraw(150);
        assertEquals(100, account.getBalance());
    }

    @Test 
    void testWithdrawNegativeAmount() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        account.withdraw(-50);
        assertEquals(100, account.getBalance());
    }

    @Test
    void testDepositMultiple() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        account.deposit(100);
        assertEquals(200, account.getBalance());
    }

    @Test 
    void testWithdrawMultiple() {
        BankAccount account = new BankAccount();
        account.deposit(200);
        account.withdraw(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance());
    }

    @Test 
    void testDepositLargeAmount() {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        assertEquals(10000, account.getBalance());
    }

    @Test
    void testWithdrawExactAmount() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        account.withdraw(100);
        assertEquals(0, account.getBalance());
    }
}
