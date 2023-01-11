import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Train train = new Train();

        System.out.println("********************************************************\n");
        System.out.println("Welcome to the Transportation Ticket Reservation System!\n");
        System.out.println("********************************************************\n");
        System.out.println("Reservations can be made for Bus, Train, or Plane.\n");
        System.out.println("What type of reservation would you like to make or check?");
        System.out.print("Enter 1 for Bus, 2 for Train, or 3 for Plane:  ");
        int choice = input.nextInt();
        if(choice == 1){
            //Bus bus = new Bus();
        }
        else if (choice == 2){
            //Train.menu(train);
        }
        else if(choice == 3){
            //Plane plane = new Planes();
        }

    }
}