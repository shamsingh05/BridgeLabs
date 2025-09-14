package Inheritance.HierarchicalInheritance.BankAccounts;
public class FixedDepositAccount extends BankAccount {
    int maturityPeriod;
    FixedDepositAccount(String accNo, double bal, int period) {
        super(accNo, bal);
        this.maturityPeriod = period;
    }
    void displayAccountType() {
        System.out.println("Fixed Deposit Account with maturity period: " + maturityPeriod + " months");
    }
}
