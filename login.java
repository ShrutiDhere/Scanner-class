//Question 2:- WAP to accept username & password from the user 
//and check if the login is successful or not.

package string;
import java.util.Scanner;

public class login {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username");
		String username=sc.nextLine();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the password");
		String password=sc1.nextLine();
		System.out.println(username.equals(password));
		
	}
}

