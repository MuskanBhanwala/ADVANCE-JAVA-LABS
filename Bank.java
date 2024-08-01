package TEST;

public class Bank {
    // instance variable to store the account balance of type double
    private double amount;

    // parameterized constructor to initialize the account balance with 10000
    public Bank() {
        this.amount = 10000.0;
    }

    // method to withdraw money from the account
    public void withdraw(double withdrawalAmount) {
        // check if the withdrawal amount is less than or equal to the available balance
        String message = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance";
        System.out.println(message);

        // update the balance if the withdrawal is successful
        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
        }
    }

    // method to deposit money into the account
    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit successful");
    }

    // method to display the current balance
    public void displayBalance() {
        System.out.println("Current balance: " + amount);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        // withdrawing 3000
        bank.withdraw(2000.0);

        // depositing 5000
        bank.deposit(6000.0);

        // displaying the final balance in the end
        bank.displayBalance();
    }
}