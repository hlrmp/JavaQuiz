
package LabExer5A;
import java.util.*;
import java.util.InputMismatchException;
public class GuessingGame {
	
public static void main(String[] args) {
	
Scanner scan = new Scanner(System.in);
	
int a = 0;
	
int b = 0;
int c = 0;

do{

try{
		
	
	System.out.println("Guess a number from 1 to 50 "	);
	
	int no = scan.nextInt();
	
		if ( no < 1 || no > 50) {
			
			throw new InvalidNumberException("out of range !!!");
			
		}

	
	if ( no > 9){
			
System.out.println("Too high try again"	);
		
	a++;
		b++;
		
	}
			
			
else if (no <  9){
			
	System.out.println("Too low try again"	);
		
	a++;
	    	b++;
				
}
				
			
	else if(no == 9){

System.out.println("You got it in " + (a + 1) +	" atempts");
	b++;
		
			}
		      

	else {

		System.out.println();
		throw new InputMismatchException ("invalid input");
			
				
					}
}

	
		
 catch (InputMismatchException ae  ) {
		String str = scan.nextLine();
		System.out.println("invalid input");
	
		a++;
	
		 }
		
	
	catch(InvalidNumberException ae) {
  
	
	System.out.println(ae.getMessage());
	
	a++;
	
		}
		
		c++;
	
	}while ( a == c );{
			

			
			}	

}
}

