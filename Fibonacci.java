//question 4:- Fibonacci series upto... 

package Scanner;

import java.util.Scanner;

public class Fibonacci {
   
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Fibonacci Series upto ");
		int num=Sc.nextInt();
		int a=0;
		int b=1;
		int c;
		for(int i=1;i<=num;i++) {
			System.out.println(a+" ");
		
		c=a+b;
		a=b;
		b=c;
		}
	}
}
