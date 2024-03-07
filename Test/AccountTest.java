import BankApp.Account;
import BankApp.InsufficientFundException;
import BankApp.InvalidAmountException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import BankApp.InvalidPinException;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AccountTest {
    private Account myAccount;

    @BeforeEach
    public void setUp(){
        myAccount=new Account("ayo","1323",419);
    }

    @Test
    void testThatBalanceIsZero(){
        assertEquals(0,myAccount.getBalance());
    }


    @Test
    void deposit2k_balanceIs2k() {
        assertEquals(0, myAccount.getBalance());
        myAccount.deposit(2000);
        assertEquals(2000, myAccount.getBalance());
    }

    @Test
    void testThatOneCanDepositTwice(){
        assertEquals(0,myAccount.getBalance());
        myAccount.deposit(3000);
        assertEquals(3000,myAccount.getBalance());
        myAccount.deposit(4000);
        assertEquals(7000,myAccount.getBalance());
    }
    @Test
    void testToWithdrawFromBalance(){
        myAccount.getNumber(678);
        myAccount.deposit(3000);
        myAccount.withdraw(1000, "1323");
        assertEquals(2000,myAccount.getBalance());
    }
    @Test
    void testToWithdrawTwice(){
        myAccount.deposit(5000);
        myAccount.withdraw(3000,"1323");
        myAccount.withdraw(1000, "1323");
        assertEquals(1000,myAccount.getBalance());
    }
    @Test
    void testToCheckBalanceWithCorrectPin(){
        myAccount.getNumber(419);
        myAccount.deposit(6000);
        myAccount.deposit(7000);
        myAccount.deposit(2000);
        myAccount.checkBalance(15000,"1323");
        assertEquals(15000,myAccount.getBalance());
    }
    @Test
    void testToAddNegativeAmount(){
        assertThrows(InvalidAmountException.class,()->myAccount.deposit(-1000));
    }
    @Test
    void testToDeposit5k_withdraw10k(){
        assertEquals(0,myAccount.getBalance());
        myAccount.deposit(5000);
        assertThrows(InsufficientFundException.class,()-> myAccount.withdraw(10000,"1323"));
    }
    @Test
    void deposit5k_withdraw2k_withIncorrectPin_ThrowInvalidPinException(){
        assertEquals(0,myAccount.getBalance());
        myAccount.deposit(5000);
        assertThrows(InvalidPinException.class,()->myAccount.validateWithdraw(2000,"1324"));
    }
}
