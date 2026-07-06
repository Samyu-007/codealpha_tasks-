import java.util.Scanner;

public class AIChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String message;

        System.out.println("AI ChatBot");
        System.out.println("Type 'exit' to stop.");

        while(true)
        {
            System.out.print("\nYou: ");
            message = sc.nextLine().toLowerCase();

            if(message.equals("hello"))
                System.out.println("Bot: Hello! Welcome.");

            else if(message.equals("how are you"))
                System.out.println("Bot: I am Fine.");

            else if(message.equals("what is java"))
                System.out.println("Bot: Java is an Object-Oriented Programming Language.");

            else if(message.equals("bye"))
                System.out.println("Bot: Goodbye!");

            else if(message.equals("exit"))
                break;

            else
                System.out.println("Bot: Sorry! I don't understand.");
        }

        sc.close();
    }
}