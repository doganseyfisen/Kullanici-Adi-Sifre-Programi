import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		String userName, password, newPass;
		int select;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Your Username: ");
		userName = input.nextLine();
		
		System.out.print("Enter Your Password: ");
		password = input.nextLine();
		
			if(userName.equals("RickSanchez") && password.equals("Morty14")) {
			System.out.println("Signed In...");
			}
			else if(!userName.equals("RickSanchez")) { 
			System.out.println("Your Username Is Not Correct.");
			}
			else if(!password.equals("Morty14")) {
			System.out.println("Your Password Is Not Correct.");
			}
		
				System.out.println("Do You Want to Create New Password?:\n1-Yes\n2-No");
				System.out.print("Your Choice: ");
				select = input.nextInt();
				input.nextLine();
					switch(select) {
					case 1:
						System.out.print("Create New Password: ");
						newPass = input.nextLine();
						if(newPass.equals("Morty14")) {
							System.out.println("Your New Password Has Not Created.\nPlease Try Another One.");
						} 
						else {
							System.out.println("Your New Password Has Created.");
						}
					break;
					case 2:
							System.out.println("Enter Your Password Again.");
					break;
			}
			
	}
}
