package BankApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void deposit() {
        Account account = new Account("ayo", "2233",4122);
        account.deposit(5000);
        assertEquals(5000,account.getBalance());
    }

    @Test
    void getBalance() {
    }

    @Test
    void withdraw() {
    }

    @Test
    void checkBalance() {
        Account account = new Account("ayo", "2233",4122);

    }
}