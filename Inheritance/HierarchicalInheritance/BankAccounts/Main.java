package Inheritance.HierarchicalInheritance.BankAccounts;

public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA101", 5000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA101", 3000, 1000);
        FixedDepositAccount fda = new FixedDepositAccount("FD101", 10000, 12);

        sa.displayAccountType();
        ca.displayAccountType();
        fda.displayAccountType();
    }
}
