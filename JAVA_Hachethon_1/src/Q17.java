import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		System.out.println("Enter the string with lower,caps,numbers ");
		Scanner s= new Scanner(System.in);
		String st =s.next();
		int count1=0, count2=0, count3=0;
		for(int i=0;i<st.length();i++) {
			if(Character.isLowerCase(st.charAt(i))) {
				count1++;
			}
		}
			for(int i=0;i<st.length();i++) {
				if(Character.isUpperCase(st.charAt(i))) {
					count2++;
				}
			}
				for(int i=0;i<st.length();i++) {
				if(	Character.isDigit(st.charAt(i))) {
						count3++;
					}
				}
				
				System.out.println("The number of lower-case in String are " + count1 +",Uppercase are "+ count2  + " numbers are " +count3);
}
}
