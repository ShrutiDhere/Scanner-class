// question 2:- Factorial of a number

package Scanner;

import java.util.Scanner;

public class Factorial {
 public static void main(String[] args) {
	Scanner Sc= new Scanner(System.in);
	System.out.println("Enter the number :- ");
	int num = Sc.nextInt();
	long fact=1;
	for(int i=1;i<=num;i++) {
	fact=fact*i;
	Sc.close();
	
}
	System.out.println("Factorial of Number " + num + " is = " + fact);
}
}
