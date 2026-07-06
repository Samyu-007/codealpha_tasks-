import java.util.Scanner;

public class HotelReservation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] rooms = {"Standard","Deluxe","Suite"};
        boolean[] booked = {false,false,false};

        while(true)
        {
            System.out.println("\nHotel Reservation");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();

            if(ch==1)
            {
                for(int i=0;i<rooms.length;i++)
                {
                    if(booked[i])
                        System.out.println((i+1)+". "+rooms[i]+" - Booked");
                    else
                        System.out.println((i+1)+". "+rooms[i]+" - Available");
                }
            }

            else if(ch==2)
            {
                System.out.print("Enter Room Number: ");
                int room = sc.nextInt();

                if(!booked[room-1])
                {
                    booked[room-1]=true;
                    System.out.println("Booking Successful.");
                }
                else
                {
                    System.out.println("Room Already Booked.");
                }
            }

            else if(ch==3)
            {
                System.out.print("Enter Room Number: ");
                int room = sc.nextInt();

                if(booked[room-1])
                {
                    booked[room-1]=false;
                    System.out.println("Booking Cancelled.");
                }
                else
                {
                    System.out.println("Room is Not Booked.");
                }
            }

            else if(ch==4)
            {
                System.out.println("Thank You!");
                break;
            }

            else
            {
                System.out.println("Invalid Choice.");
            }
        }

        sc.close();
    }
}