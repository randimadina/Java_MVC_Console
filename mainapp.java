//  Author  :   Randima Dinalankara
//  Date    :   18/12/2024
//  File    :   Class file that holds the main function
import java.util.Scanner;
import java.sql.Connection;;

public class mainapp{
    public static void main(String[] argc){
        CustomerController ctrlCustomerObj = new CustomerController();
        RoomController ctrlRoomObj = new RoomController();

        /**
         * Database connection
         */
        Connection dbConn = DBConnection.GetDBConnection();
        /**
         * Scanner object to collect user input
         */
        Scanner scnObj = new Scanner(System.in);

        /**
         * Variable to store user input
         */
        int userInput = 1;

        while(userInput>0){
            DisplayMainMenu();
            try{
                userInput = Integer.parseInt(scnObj.nextLine());
            } catch(NumberFormatException ex){
                ex.printStackTrace();
            }
            
            switch(userInput){
                case 1: {ctrlCustomerObj.DisplayCustomerDetails();  break;}
                case 2: {ctrlRoomObj.DisplayRoomDetails();  break;}
                case 3: {ctrlRoomObj.DisplayRoomList();break;}
                case 0: break;
                default: {System.out.println("Error: user has entered an unrecognizable option.");  break;}
            }
            
        }
        System.out.println("Bye");

    }

    public static void DisplayMainMenu(){
        System.out.println("\nMain Menu");
        System.out.println("---------");
        System.out.println("1. Customers");
        System.out.println("2. Rooms");
        System.out.println("3. Room List");
        System.out.println("0. Exit");
        System.out.print("Enter your option: ");
    }
}