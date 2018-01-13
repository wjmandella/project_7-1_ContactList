import java.util.Scanner;

public class ContactListApp {

	public static void main(String[] args) {
		
		 Console.printToConsole("Welcome to the Contact List application\n");
         
	        Scanner sc = new Scanner(System.in);
	        String choice = "y";

	        while (choice.equalsIgnoreCase("y")) {
	        	
	            // get the input from the user
	            String firstName = Console.getString("Enter first name: ");
	            String lastName = Console.getString( "Enter last name:  ");	
	            String email = Console.getString("Enter email:      ");
	            String phone = Console.getString("Enter phone:      ");	
	                      
	            Contact contactInfo = new Contact(firstName, lastName, email, phone);
	            
	            Console.printToConsole(contactInfo.displayContact());
	            
	            System.out.println();
	            
	            choice = Console.askToContinue(sc);
	        }
	        sc.close();
	        System.out.println("Bye!");
	}
}


