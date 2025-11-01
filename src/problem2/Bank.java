package problem2;

import java.util.ArrayList;

public class Bank {
    String name;
    ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public void addCustomer(Customer customer){
        if (customers.contains(customer))  {
            return;
        }
        customers.add(customer);
    }
    public void addTransaction(Customer c1, Customer c2, double amount){
        if (customers.contains(c2)){
            c2.addTransaction(amount);
            c1.retractTransaction(-amount);
            System.out.println("Added amount " + amount + " to customer " + c2.getName() + " : " + c2.getId());
        }
        else {
            System.out.println("customer of ID " + c2.getId() + " isn't our client");
        }
    }
    public void printCustomers(){
        for (Customer c : customers){
            System.out.println("Customer name: " + c.getName() + " ID: " + c.getId());
            System.out.print("Transactions: ");
            for(double d : c.getTransactions()){
                System.out.print(d + " ");
            }
            System.out.println();
        }
    }

    public void printCustomer(Customer c){
            System.out.println("Customer name: " + c.getName() + " ID: " + c.getId());
            System.out.print("Transactions: ");
            for(double d : c.getTransactions()){
                System.out.print(d + " ");

            System.out.println();
        }
    }



}
