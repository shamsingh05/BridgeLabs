package Inheritance.HierarchicalInheritance.BankAccounts;
public class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    CheckingAccount(String accNo, double bal, double limit) {
        super(accNo, bal);
        this.withdrawalLimit = limit;
    }
    void displayAccountType() {
        System.out.println("Checking Account with withdrawal limit: " + withdrawalLimit);
    }
}
