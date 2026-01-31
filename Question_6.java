//Question 6 :- Take Marks of 5 Subjects ,  print total & percentage .

package Scanner;

import java.util.Scanner;

public class Question_6 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 st Subject mark ");
		float Sub1=sc.nextFloat();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 2nd Subject mark ");
		float Sub2=sc1.nextFloat();
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter 3rd Subject mark ");
		float Sub3=sc2.nextFloat();
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter 4th Subject mark ");
		float Sub4=sc3.nextFloat();
		Scanner sc4=new Scanner(System.in);
		System.out.println("Enter 5th Subject mark ");
		float Sub5=sc4.nextFloat();
		sc.close();
		System.out.print("Marks of 5 Subjects are = " + "Sub1 Mark = " + Sub1 + " , Sub2 Mark = "+ Sub2 + " , Sub3 Mark =  " +  Sub3 + " , Sub4 Mark = " + Sub4 + " , Sub5 Mark =  " + Sub5);
		
		float Total=Sub1+Sub2+Sub3+Sub4+Sub5;
		
		float Percentage=(Total/500)*100;
		
	System.err.println("\n Total Marks of 5 Subject =" + Total);
		System.out.println("Percentage of 5 Subject is = " + Percentage + "%" );
		
		
	}

}
