//Question 10:- Take 2 Numbers , Print Multiplication & Division 

package Scanner;

import java.util.Scanner;

public class Question_10 {
	
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter 1st Number ");
	   int Num1=sc.nextInt();
	   Scanner sc1=new Scanner(System.in);
	   System.out.println("Enter 2nd Number ");
	   int Num2=sc.nextInt();
	   sc.close();
	   System.out.println("Multiplication of Two Number is = " + (Num1*Num2));
	   System.err.println("Division btween Two Number gives :- ");
	   System.out.println("Quotient of two number is = " + (Num1/Num2));
	   System.out.println("Remainder of two Number is = " + (Num1%Num2));
	
}
}
