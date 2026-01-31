//Question 5:- TAke A Sentence from user using nextLine() and print it .

package Scanner;

import java.util.Scanner;

public class Question_5 {
    
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence ");
		String sentence=sc.nextLine();
		System.out.println("The Sentence is :- " + sentence );
		sc.close();
		
	
	}
}
