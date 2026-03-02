package it.unibo.pps.e1;

public class BankAccountFactory {

    public BankAccount createBronzeBankAccount(){
        return new BronzeBankAccount(new CoreBankAccount(), (amount) -> amount < 100 ? 0 : 1);
    }

    public BankAccount createSilverBankAccount(){
        return new SilverBankAccount(new CoreBankAccount(), (amount) -> 1);
    }

    public BankAccount createGoldBankAccount(){
        return new GoldBankAccount(new CoreBankAccount(), (amount) -> 0);
    }
}
