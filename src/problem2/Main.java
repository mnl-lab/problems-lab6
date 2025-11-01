package problem2;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alice", "C001");
        Customer c2 = new Customer("Bob", "C002");
        Bank bank = new Bank("MyBank");
        bank.addCustomer(c1);
        c1.addTransaction(120.0);
        c1.addTransaction(-30.0);
        c1.addTransaction(150.0);
        c1.retractTransaction(-120.0);
        bank.addTransaction(c1, c2, 100.0); // Should print that customer isn't our client
        bank.addCustomer(c2);
        bank.addTransaction(c1, c2, 150.0); // Should add transaction
        bank.printCustomers();
    }

}
