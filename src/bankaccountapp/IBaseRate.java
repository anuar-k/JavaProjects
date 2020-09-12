package bankaccountapp;

public interface IBaseRate {
    // Write a method that returns the bas rate
    default double getBaseRate() {
        return 2.5;
    }
}