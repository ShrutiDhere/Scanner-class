
package Scanner;

import java.util.Scanner;

public class Prime_No {
        public static void main(String[] args) {
        
        	boolean isprime=true;
			Scanner Sc=new Scanner(System.in);
			System.out.println("Enter a number:-" );
			int num=Sc.nextInt();
			if(num<=1) {
				isprime=false;
			}
			else {
				for(int i=2;i<=num/2;i++) {
					if(num%i==0) {
						isprime=false;
						break;
					}
				}
				
			}if(isprime) {
				System.out.println("It is Prime Number Hence it is " +  isprime);
			}
				else {
					System.out.println("It is not a prime Number Hence it is 2 " +  isprime);
				}
			Sc.close();
			
			
			
		}
        }

