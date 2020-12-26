import java.util.Scanner;
public class Q2 {
	
	public static void main(String[] args) {
		
			
		int i; 
		float  factorial=1;
	Scanner s = new Scanner(System.in);
	System.out.println("enter the number");
	int n= s.nextInt();
						
	for(i=0;i<n;i++) {
	factorial = factorial*(n-i) ;
	}
	System.out.println("Factorial of " + n +" is " + factorial);
								
	}
		}


