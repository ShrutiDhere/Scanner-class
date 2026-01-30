//program 3:- Reverse of a number program

package Scanner;

import java.util.Scanner;

public class Reverse_of_number {

	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in); 
		System.out.println("Enter a number");
		int num=Sc.nextInt();
		int rev=0,digit;
		while(num!=0) {
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
			Sc.close();
		}
		System.out.println("The Reverse of a number is = " + rev );
		
	}
}
