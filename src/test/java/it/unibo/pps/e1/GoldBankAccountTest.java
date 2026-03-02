package it.unibo.pps.e1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GoldBankAccountTest extends CoreBankAccountTest {

    @BeforeEach
    void init(){
        this.account = new BankAccountFactory().createGoldBankAccount();
    }

    @Test
    void testCanWithdraw(){

    }

}
