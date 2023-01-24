import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        You have 20 Euro, on your credit card, and 12 Euro cash
        You will enter a pizza shop and the following menu is:
        "Pizza Capricciosa" is 6 Euro
        "Pizza Margueritta" is 4 Euro
        "A can of Cola" is 1 Euro
        "A bottle of water" is 1 Euro
         */
        // Case 1 - the menu will be printed and the user will be asked what exactly he/she wants to order
        // Case 2 - the user will be asked directly regarding what he/she wants to order
        // After the user enters the desired product he/she will be asked multiple times if he/she wants to order
        // something else and the products that were added to the console will also be added to the final bill


        // If the user says "no thank you" he/she will be asked if the final payment, will be paid with the credit card
        // or cash and he or she must enter the desired payment method

        // If for both of the cases if the user does not have enough money. The order will be cancelled

        // If the user has enough money, the final bill will be printed

        System.out.println("Hello, welcome to our restaurant!");
        System.out.println("Would you like a menu, or would you like to order");
        Scanner reader = new Scanner(System.in);

        int pizzaCapricciosa = 6;
        int pizzaMargueritta = 4;
        int cola = 1;
        int water = 1;
        int bill = 0;
        int cash = 12;
        int creditCard = 20;

        while (true) {
            String answer = reader.nextLine();
            if (answer.equalsIgnoreCase("I would like a menu")) {
                //* Caz 1 - the menu will be printed and the user will be asked what exactly he/she wants to order
                System.out.println("Here is the menu! \nPizza Capricciosa - 6 euro \nPizza Margherita - 4 euro \nCola - 1 euro \nApa - 1 euro");
                System.out.println("How can I serve you?");
            }

            //* Case 2 - the user will be asked directly regarding what he/she wants to order
            if (answer.equalsIgnoreCase("I would like to order")) {
                System.out.println("How can I serve you?");
            }
            // After the user enters the desired product he/she will be asked multiple times if he/she wants to order
            // something else and the products that were added to the console will also be added to the final bill

            while (true){
                String order = reader.nextLine();

                if (order.equalsIgnoreCase("pizzaCapricciosa")) {
                    bill += pizzaCapricciosa;
                    cash -= 6;
                    creditCard -= 6;
                    order += 6;
                    System.out.println("Would you like to order more?");
                }
                if (order.equalsIgnoreCase("pizzaMargueritta")) {
                    bill += pizzaMargueritta;
                    cash -= 4;
                    creditCard -= 4;
                    order += 4;
                    System.out.println("Would you like to order more?");
                }
                if (order.equalsIgnoreCase("cola")) {
                    bill += cola;
                    cash -= 1;
                    creditCard -= 1;
                    order += 1;
                    System.out.println("Would you like to order more?");
                }
                if (order.equalsIgnoreCase("water")) {
                    bill += water;
                    cash -= 1;
                    creditCard -= 1;
                    order += 1;
                    System.out.println("Would you like to order more?");
                }
                // If the user says "no thanks" he/she will be asked if the payment will be completed using cash or
                // credit card and the user must introduce to desired payment method
                // For both cases if the user does not have enough money, the order will be cancelled
                if (order.equalsIgnoreCase("No thanks")){
                    System.out.println("Would you like to pay using cash or the credit card?");
                }
                if (order.equalsIgnoreCase("Cash")){
                    if (cash <= 0){
                        System.out.println("You do not have enough money!");
                    }else {
                        System.out.println("You have to pay " + bill + " euros");
                    }

                }
                if (order.equalsIgnoreCase("Credit Card")) {
                    if (creditCard <= 0) {
                        System.out.println("You do not have enough money");
                    }else {
                        System.out.println("You have to pay " + bill + " euros");
                    }
                }
                // If the user has enough money, the final bill will be printed
            }
        }
    }
}
