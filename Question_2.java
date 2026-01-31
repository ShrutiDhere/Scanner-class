//Question 2:- Take Name ANd Age from USer and Display Them.

package Scanner;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name :- ");
		String name = sc.nextLine();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the Age  :- ");
		int Age = sc1.nextInt();
		System.out.println("The Name of the User is :- " + name );
		System.out.println("The Age of The User is :- " + Age );
		
	}
}
