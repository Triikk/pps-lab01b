package it.unibo.pps.e1;

public interface WithdrawCheckStrategy {

    public boolean canWithdraw(int balance, int amount);
}
