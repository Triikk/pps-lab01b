package it.unibo.pps.e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GoldBankAccountTest extends CoreBankAccountTest {

    @BeforeEach
    void init(){
        this.account = new BankAccountFactory().createGoldBankAccount();
    }

    @Test
    void testCanWithdraw(){

    }

    @Test
    public void testCannotWithdrawMoreThanAvailable(){
        this.account.deposit(1000);
        assertThrows(IllegalStateException.class, () -> this.account.withdraw(1501));
    }

    @Test
    public void testCan(){
        this.account.deposit(1000);
        this.account.withdraw(1200);
        assertEquals(-200, this.account.getBalance());
    }

}
