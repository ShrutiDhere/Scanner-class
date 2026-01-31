//question 1:- Take 2 numbers from user and print their addition.

package Scanner;

import java.util.Scanner;

public class question_1 {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter First number :- ");
		int A= Sc.nextInt();
		Scanner Sc1=new Scanner(System.in);
		System.out.println("Enter Second number :- ");
		int B= Sc1.nextInt();
		Sc.close();
		int C = A+B;
		System.out.println("The Addition Of TWo Numbers Is :- " + C);
		
	}
}
