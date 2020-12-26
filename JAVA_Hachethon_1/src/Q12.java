import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		System.out.println("Enter the string or number  ");
		Scanner s= new Scanner(System.in);
		String st =s.next();
		StringBuilder sb= new StringBuilder(st).reverse();
		String str= sb.toString();
		if(st.equals(str)) {
		System.out.println(" Given value " + st +" is palindrome");
		}
		else {
			System.out.println(" Given value " + st +"  not a is palindrome");
		}
		System.out.println(str);
     
}
}
