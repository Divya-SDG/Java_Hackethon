import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Boolean a,b,c;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value for a, b, c ");
		 a = s.nextBoolean();
		b= s.nextBoolean();
	c=	s.nextBoolean();
		if((a==true && b==true)||(a==true && c==true)||(b==true && c==true)) {
			
			System.out.println("Atleast  two of the variables are true ");
			}
		else {
			System.out.println("Atleast  two of the variables are  not true ");
			
		}
		
		
	}

}
