//Question 7 :- Take Length & Width , Calculate Area of Rectangle .

package Scanner;

import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length ");
		int Length=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Width ");
		int Width=sc1.nextInt();
		sc.close();
		int Area = Length * Width ;
		System.err.println("Area Of Rectangle = " + Area );
		
		
		
	}
}
