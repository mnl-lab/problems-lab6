package problem2;
import java.util.ArrayList;

public class Customer {
    private String name;
    private String id;
    private ArrayList<Double> transactions = new ArrayList<>();


    public Customer(String name, String id) {
        this.id = id;
        this.name = name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void addTransaction(double pos){
        if (pos > 0){
            transactions.add(pos);
        }
        else{
            System.out.println("invalid amount to add");
        }
    }
    public void retractTransaction(double neg){
        if (neg < 0){
            transactions.add(neg);
        }
        else{
            System.out.println("invalid amount to retract");
        }
    }

}
