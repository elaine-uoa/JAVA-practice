public class CreditCard {
    private String customer;
    private String bank;
    private String account;
    private int limit; //credit limit in dollars
    protected double balance; //how much you owe

    public CreditCard(String customer, String bank, String account, int limit, double initialBalance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = initialBalance;
    }

    public CreditCard(String customer, String bank, String account, int limit) {
        this(customer, bank, account, limit, 0.0);
    }

    public String getCustomer() { return customer;}
    public String getBank() { return bank;}
    public String getAccount() { return account;}
    public int getLimit() {return limit;}
    public double getBalance() { return balance;}

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public boolean charge(double price) {
        if (price + balance > limit) {
            return false;
        }
        balance += price;
        return true;
    }

    public void makePayment(double amount) {
        if (amount <= 0) {
            return;
        }
        balance -= amount;
    }

    public static void printSumary(CreditCard card) {
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = " + card.balance);
        System.out.println("Limit = " + card.limit);
    }

}
