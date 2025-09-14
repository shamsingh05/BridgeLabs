package Inheritance.HierarchicalInheritance.BankAccounts;
public class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(String accNo, double bal, double rate) {
        super(accNo, bal);
        this.interestRate = rate;
    }
    void displayAccountType() {
        System.out.println("Savings Account with interest rate: " + interestRate + "%");
    }
}
