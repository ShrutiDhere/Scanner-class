//question 5:- Even odd number 
package Scanner;

import java.util.Scanner;

public class Even_Odd {
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		sc.close();
		
		if(num%2==0) {
			System.out.println("It is even Number = " + num );
		}else {
			System.out.println("It is odd number = " + num );
		}
	}
}
