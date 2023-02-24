import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;


public class Order{
   ArrayList list = new ArrayList();
   public boolean delivery;
   public boolean tip;


    public static boolean isDelivery() {
        return delivery;
    }

    public boolean setDelivery(boolean delivery)
    {
        return delivery;
    }

    public static boolean isTip()
    {
        return tip;

    }

    public boolean setTip(boolean tip)
    {
        return tip;
    }


    public void addItem(MenuItem item)
    {
        list.add(delivery);
        list.add(tip);

    }

    public String[] getItems()
    {
        list.add();

        return list;

    }


    public static double getCost() {

        return 0.0;

    }

    public static int getTime() {

        return 0;

    }

    public String toString()
    {
        return "n/a";
    }
}

//public class Order {
//    public static void main(String[] args) {
////        double menuItems []= new double[2];
////        boolean delivery = true;
////        boolean tip = true;
//
//
//
//
//    }
//
//    public boolean isDelivery()
//    {
//        return true;
//    }
//
//    public boolean setDelivery(boolean delivery)
//    {
//        return true;
//    }
//
//
//    public boolean isDeliveryTip()
//    {
//        return true;
//    }
//
//    public void addItem(MenuItem item)
//    {
//     //  method that takes a menuItem object and adds it to the item arraylist.
//
//
//    }
//    public static int [] getItems()
//    {
//        // method that returns the arrayList of MenuItem objects
//        return null;
//    }
//
//    public int getCost()
//    {
//
//        // method that sums up the base price of the items that have been ordered and then applies the rules of pricing that are described above.
//        // These are the same rules that were applied in the previous Menu project (i.e., base, tax, and tip).
//        // do somthing w thwe main menu thing
//
//        return 0;
//    }
//
//    public int getTime() {
//
//        // method that determines when the order will be ready.
//        // It does not take the sum of the items in the list.
//        // Instead, we can assume that the kitchen will make these items in parallel.
//        // Therefore, the time to prepare the entire order will be the max amount of time to prepare any of the items in the order.
//        // This method must also take into account delivery time, which defaults to 20 minutes.
//
//
//        return 0;
//    }
//
//    public String toString()
//    {
//        // method that returns a String.
//        // The method will have all the individual String objects for the MenuItem objects in the list, but will also contain the total cost and total time.
//        // You have some leeway to determine how best to format this String in order to make it readable.
//    return "n/a";
//
//    }
//
//    public void setDelivery(boolean b) {
//
//
//    }
//}
