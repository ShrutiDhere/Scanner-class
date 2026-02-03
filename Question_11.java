package Scanner;

import java.util.Scanner;

public class Question_11 {
      public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your id :-");
		int id= sc.nextInt();
		sc.nextLine();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter your Name :- ");
		String name=sc1.nextLine();
		System.out.println("Employee id  = " + id + " & Employee name = " + name );
		sc.close();
	}
}
