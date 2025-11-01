package problem1;

import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        double totalPrice;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.next();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
//            totalPrice += (quantity * itemPrice);
            // *** create a new item and add it to the cart
            item = new Item(itemName, itemPrice, quantity);
            cart.add(item);
            // *** print the contents of the cart object using println
//            System.out.println(cart);
            totalPrice = 0;
            for (Item i : cart){
                System.out.println(i);
                totalPrice += (i.getPrice()* i.getQuantity());
            }
            System.out.println("Total price until now: " + totalPrice);



            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.next();
        }
        while (keepShopping.equals("y"));
    }
}
