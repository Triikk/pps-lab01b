package it.unibo.pps.e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BronzeBankAccountTest extends CoreBankAccountTest {

    @BeforeEach
    void init(){
        this.account = new BankAccountFactory().createBronzeBankAccount();
    }

    @Test
    public void testCanWithdrawWithFee(){
        this.account.deposit(1000);
        this.account.withdraw(200);
        assertEquals(799, this.account.getBalance());
    }

    @Test
    public void testCanWithdrawWithoutFee(){
        this.account.deposit(1000);
        this.account.withdraw(99);
        assertEquals(901, this.account.getBalance());
    }


}
