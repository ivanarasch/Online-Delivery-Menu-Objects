import java.io.InputStream;
import java.util.Scanner;

public class Delivery {

    public static void main(String[] args) {
        placeOrder(System.in);
    }

    public static Order placeOrder(InputStream in) {
        Scanner keyboard = new Scanner(in);
        Order order = new Order();
        System.out.println("Welcome to Chick-fil-A! \nCheck out our Menu!!!!");
        System.out.println("1. Fries $1.99, 2. Chicken Nuggets 8 pieces $2.99, 3. Chicken Nuggets 12 pieces  $3.99, 4. Chicken Burger $4.99  ");
        // make a while loop
        boolean cond = true;


        while (cond)
            System.out.println("Please type the number next to the order you want,\n or a negative number if you would like to stop ordering");
            String item_answer = keyboard.nextLine();
            if (item_answer.startsWith("-"))
        {
            System.out.println("Your order is done!");
        }
            else
        {
                new MenuItem(item_answer);
        }

            System.out.println("Delivery costs $5.99. Do you want us to deliver your order?\n" +
                    "It will also take us an addtional 20 minutes to have your order ready\n"+
                "Please type y for yes and n for no." );
            Scanner second_keyboard = new Scanner(System.in);
            String delivery_answer = second_keyboard.nextLine();
        if (delivery_answer.equals("n"))
        {
            System.out.println("Do you want to add tip?");
            Scanner third_keyboard = new Scanner(System.in);
            String tip_answer = third_keyboard.nextLine();
            if (tip_answer.equals("n"))
            {
                double cost = Order.getCost();
                double time;
                time = Order.getTime();
            }
            else if (tip_answer.equals ("y"))
            {
                double cost = Order.getCost();
                double time = Order.getTime();
                boolean tip = Order.isTip();
            }
        else if (delivery_answer.equals("y"))
            {
                System.out.println("Do you want to add tip?");
                Scanner fourth_keyboard = new Scanner(System.in);
                String tip_answer_two = fourth_keyboard.nextLine();
            if (tip_answer_two.equals("n"))
            {
                double cost = Order.getCost();
                double time = Order.getTime();
                boolean delivery = Order.isDelivery();
            }
            else if (tip_answer_two("y"))
            {
                double cost = Order.getCost();
                double time = Order.getTime();
                boolean delivery = Order.isDelivery();
                boolean tip = Order.isTip();

            }



            }

        }




    }

    private static boolean tip_answer_two(String y) {
    }

}
