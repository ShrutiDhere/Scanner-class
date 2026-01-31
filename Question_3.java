//Question 3:- Take 3 Numbers and Print the Largest Number 

package Scanner;

import java.util.Scanner;

public class Question_3 {

	   public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter 1St Number :- ");
          int Num1=sc.nextInt();
          Scanner sc1=new Scanner(System.in);
          System.out.println("Enter 2nd Number :- ");
          int Num2=sc1.nextInt();
          Scanner sc3=new Scanner(System.in);
          System.out.println("Enter 3rd Number :- ");
          int Num3=sc3.nextInt();
          sc.close();
          if(Num1>Num2) {
        	  System.out.println("1st Number is Largest ");
          }
          else if(Num2>Num3){
        	  System.out.println("2nd Number is Largest ");
          }
          else if(Num3>Num1){
        	  System.out.println("3rd Number is Largest ");
          }
          else {
        	  System.out.println("All Numbers are equal ");
          }
          
	}

	   
}
