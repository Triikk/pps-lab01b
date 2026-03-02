package it.unibo.pps.e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SilverBankAccountTest extends CoreBankAccountTest {

    @BeforeEach
    void init(){
        this.account = new BankAccountFactory().createSilverBankAccount();
    }

    @Test
    public void testCanWithdraw() {
        this.account.deposit(1000);
        this.account.withdraw(200);
        assertEquals(799, this.account.getBalance());
    }

}
