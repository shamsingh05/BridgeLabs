public class SavingsAccount extends Account {
    public SavingsAccount(String accNo, double bal) {
        super(accNo, bal);
    }

    @Override
    public void withdraw(double amount) {
        if(amount > 0 && getBalance() - amount >= 500) {
            deposit(-amount);
        } else {
            System.out.println("Withdrawal denied: maintain minimum balance of 500.");
        }
    }
}
