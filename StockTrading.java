import java.util.Scanner;

public class StockTrading {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] stocks = {"TCS", "Infosys", "Reliance"};
        int[] price = {3500, 1500, 2500};

        int balance = 10000;

        System.out.println("Available Stocks");

        for(int i=0;i<stocks.length;i++)
        {
            System.out.println((i+1)+". "+stocks[i]+" - Rs."+price[i]);
        }

        System.out.println("\nYour Balance: Rs."+balance);

        System.out.print("Choose Stock (1-3): ");
        int choice = sc.nextInt();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        int total = price[choice-1] * qty;

        if(total <= balance)
        {
            balance -= total;
            System.out.println("Stock Purchased Successfully!");
            System.out.println("Purchased: "+stocks[choice-1]);
            System.out.println("Total Cost: Rs."+total);
            System.out.println("Remaining Balance: Rs."+balance);
        }
        else
        {
            System.out.println("Insufficient Balance!");
        }

        sc.close();
    }
}