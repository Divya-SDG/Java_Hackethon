import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		System.out.println("Enter the string ");
		Scanner s= new Scanner(System.in);
		String st =s.next();
		//System.out.println("Enter the char to be removed");
		Character  ct= new Character('v');
		String c= ct.toString(ct);
		Q16  q= new Q16();
	      q.removeChar(st, c);	
	}
	public void removeChar(String str, String c) {
		String strn= str.replace(c, "");
		System.out.println(strn);
		}
}
