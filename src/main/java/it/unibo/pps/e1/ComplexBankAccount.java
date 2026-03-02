package it.unibo.pps.e1;

public class ComplexBankAccount extends CoreBankAccount {

    private BankAccount bankAccount;
    private CalculateFeeStrategy feeStrategy;
    private WithdrawCheckStrategy withdrawCheckStrategy;

    public ComplexBankAccount(BankAccount bankAccount, CalculateFeeStrategy feeStrategy, WithdrawCheckStrategy withdrawCheckStrategy) {
        this.bankAccount = bankAccount;
        this.feeStrategy = feeStrategy;
        this.withdrawCheckStrategy = withdrawCheckStrategy;
    }

    public int getBalance() {
        return bankAccount.getBalance();
    }

    public void deposit(int amount) {
        bankAccount.deposit(amount);
    }

    public void withdraw(int amount) {
        if (!withdrawCheckStrategy.canWithdraw(this.getBalance(), amount)){
            throw new IllegalStateException();
        }
        bankAccount.withdraw(amount + feeStrategy.calculateFee(amount));
    }
}
