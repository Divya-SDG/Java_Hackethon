import java.util.Scanner;

public class Q28 {

	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner s= new Scanner(System.in);
		int number =s.nextInt();
		    int i,fact=1;  
			   fact = factorial(number);   
			  System.out.println("Factorial of "+number+" is: "+fact);    
			 }  

	
	static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 } 

}
