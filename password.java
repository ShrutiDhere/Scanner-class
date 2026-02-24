//Question 3:=WAP to accept password from the user and count no of alphabets 
//and digits.

package string;
import java.util.Scanner;
public class password {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the password");
	String password=sc.nextLine();
	System.out.println(password.length());
	int alphabet=0,digits=0;
	for(int i=0;i<password.length();i++) { 

		char ch = password.charAt(i);
	
    if (Character.isLetter(ch)) {
        alphabet++;
    } else if (Character.isDigit(ch)) {
        digits++;
    }
	}
    System.out.println("Number of alphabets in the password are"+ alphabet );
    System.out.println("Number of digits in the password are "+digits);
	
	

}
}
