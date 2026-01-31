//Question 8 :- Take a number And Check if it is even or odd

package Scanner;

import java.util.Scanner;

public class Question_8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number ");
		int Number=sc.nextInt();
		sc.close();
		if(Number%2==0) {
			System.out.println(Number + " = It is Even Number ");
		}
		else {
			System.out.println(Number + " = It is Odd Number ");
		}
	}
}
