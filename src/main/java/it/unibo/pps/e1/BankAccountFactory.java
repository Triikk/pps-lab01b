package it.unibo.pps.e1;

public class BankAccountFactory {

    public BankAccount createBronzeBankAccount(){
        return new ComplexBankAccount(new CoreBankAccount(), (amount) -> amount < 100 ? 0 : 1, (balance, amount) -> balance >= amount);
    }

    public BankAccount createSilverBankAccount(){
        return new ComplexBankAccount(new CoreBankAccount(), (amount) -> 1, (balance, amount) -> balance >= amount);
    }

    public BankAccount createGoldBankAccount(){
        return new ComplexBankAccount(new CoreBankAccount(), (amount) -> 0,  (balance, amount) -> balance - amount >= -500);
    }
}
