package it.unibo.pps.e1;

public class SilverFee implements CalculateFeeStrategy{
    @Override
    public int calculateFee(int amount) {
        return 1;
    }
}
