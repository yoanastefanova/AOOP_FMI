package savings.com;

import java.util.Random;

public class SavingsAccount {
    private static double mAnnualInterestRate;
    private double mSavingsBalance;
    private int mNumber;


    public SavingsAccount() {
        Random rand = new Random();
        mNumber = rand.nextInt(10001);

        setmAnnualInterestRate(0.0);
        setmSavingsBalance(0.0);
    }

    public SavingsAccount(double mAnnualInterestRate, double mSavingsBalance) {
        Random rand = new Random();
        mNumber = rand.nextInt(10001);

        setmAnnualInterestRate(mAnnualInterestRate);
        setmSavingsBalance(mSavingsBalance);
    }

    public SavingsAccount(SavingsAccount other) {
        setmAnnualInterestRate(other.mAnnualInterestRate);
        setmSavingsBalance(other.mSavingsBalance);
    }


    public void setmAnnualInterestRate(double mAnnualInterestRate) {
        this.mAnnualInterestRate = mAnnualInterestRate;
    }

    public void setmSavingsBalance(double mSavingsBalance) {
        this.mSavingsBalance = mSavingsBalance;
    }

    public double getmAnnualInterestRate() {
        return mAnnualInterestRate;
    }

    public double getmSavingsBalance() {
        return mSavingsBalance;
    }

    public int getmNumber() {
        return mNumber;
    }


    public void calculateMonthlyInterest() {
        mSavingsBalance += (getmSavingsBalance() * getmAnnualInterestRate()) / 12;
    }

    public static void modifyInterestRate(double newmAnnualInterestRate) {
        mAnnualInterestRate = newmAnnualInterestRate;
    }

    boolean isGreater(SavingsAccount acc){
        return mSavingsBalance > acc.getmSavingsBalance() ? true : false;
    }

    @Override
    public String toString() {
        return String.format("Interest rate: %.2f, Savings balance: %.2f, Unique number: %d",
                mAnnualInterestRate, mSavingsBalance, mNumber);
    }


}
