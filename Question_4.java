//Question 4:- Take a Radius from a user and Print Area of A Circle .

package Scanner;

import java.util.Scanner;

public class Question_4 {
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Radius :- ");
		 int Radius=sc.nextInt();
		 float Area = 3.14f*Radius*Radius;
		 System.out.println("Area of a circle = " + Area );
		 sc.close();
		 

}
}
