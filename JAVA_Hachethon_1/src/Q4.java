import java.util.Arrays;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		System.out.println(" Enter  the size of array");
		Scanner s= new Scanner(System.in);
		int a =s.nextInt();
		int [] num= new int[a];
	int k=0;
	Q4  q= new Q4();
		for(int i=0;i<num.length;i++) {
			System.out.println(" enter  the " + i +" number");
			 k =s.nextInt();
			num[i]=k;
			}
		
		for(int i=0;i<num.length;i++) {
	Boolean f=	q.palindrome(num[i]);
	if(f==true) {
		System.out.println("The number "+ num[i]+ " is palindrome");
	}
	else {
		System.out.println("The number "+ num[i]+ " is  not a  palindrome");
	}
			}
	}
	
public Boolean 	palindrome(int h){
		String  b1= Integer.toString(h);
		StringBuilder sb= new StringBuilder(b1);
		StringBuilder sb1=sb.reverse();
		String b2= sb1.toString();
	if(b1.equals(b2)) {
		return true;
	}
	else {
		return false;
	}
		
	}

}
