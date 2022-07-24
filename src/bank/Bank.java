package bank;

public class Bank {
    private int numberOfCustomers;

    public Bank(String bankName) {

    }

    public void register(String CustomerName, String pin) {
        numberOfCustomers++;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }
}
