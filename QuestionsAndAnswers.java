import java.util.*;
public class QuestionsAndAnswers {
	public static void main(String[] args) {
  
 Scanner scan = new Scanner(System.in);     
	 
	       String[][] questions = {

 {"1. It is an event that occurs during the execution of a program that disrupts the normal flow of instructions ? ","                   a. Exception     b. Extends     c. Inheritance"                          ,},
 
 {"2. It occurs during the execution?", "                              a. Checked Exception          b. Unchecked Exception        c. Execution",},
 
 {"3. A block of code that might throw a exeption that can be handled by a matching catch block.","                                          a. catch block           b. finally block      c. try block",},
 
 {"4. A segment of code that can handle an exception that might be thrown by the try block that precedes it.","                     a. try block        b. catch block         c. finally  block",},
 
 {"5. Invalid use of null reference.","                                a. InputMismatchException           b. NullPointerException         c. StringIndexOutOfBoundsException ",},
   
   {"6. Invalid conversion of String to a numeric format.","                a. NumberFormatException     b. NullPointerException        c. StringIndexOutOfBoundsException ",},
   
     {"7.  Enteting a value that does not match tge expected data type.","                  a. NumberFormatException                   b. InputMismatchException    c. StringIndexOutOfBoundsException ",},
   
   {"8. Acessing an invalid index of array. ","                        a. ArrayIndexOutOfBound       b. ArrayStoreException     c. ArithmeticException ",},
   
    {"9. Assignning a value to an array index that does not match the expected data type. ","                                        a. ArrayIndexOutOfBound       b. ArrayStoreException     c. ArithmeticException ",},
    
    {"10. Occurs during Compilation. ","                                      a. Unchecked Exception     b. Checked Exception      c. Exception handling0 ",},
    
    
	       };
	        // answers 
	        
	    String [][]answers = {
	    	{"a","b","c","b","b","a","b","a","b","b"}
	    	};
	     
	      String [] stats =  new String[10];
	       int a = 0; 
           int c = 0; // correct
	       int w = 0; // wrong
	       
   	     
     do{    	       
try{	 
  	System.out.println( questions[a][0]+questions[a][1]);
  	String ans = scan.next();
     stats[a]= (ans);

          if((answers[0][a]).equalsIgnoreCase(stats[a])){
         	System.out.println(" ");
         	System.out.println("correct ");
             c++;
             System.out.println(" ");
             
             }else if (!(answers[0][a]).equalsIgnoreCase(stats[a]))  { 
             System.out.println(" ");
             System.out.println("wrong");
             w++;  
             System.out.println(" ");
        }
             a++;
}
     }
           catch(InputMismatchException sp){
	 		System.out.println("invalid letter not a,b,c");

           }      
 	

	 }
 while(a < 10);   {
 	
         	System.out.println(" ");
 	System.out.println(" score: " + c);
 }
	}


	 	
