//Question 9:- Take a number check if it is positive,negative or zero

package Scanner;

import java.util.Scanner;

public class Question_9 {

	 public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number ");
		int Number = sc.nextInt();
		sc.close();
		if(Number==0) {
			System.out.println(Number + " = Number is Zero ");
		}
		else if(Number >= 0) {
			
			System.out.println(Number + " = Number is Positive ");
		}
		else if(Number <= 0 ) {
			System.out.println(Number + " = Number is Negative ");
		}
		else {
			System.out.println("Invalid Input");
		}
		
		
	}
}
