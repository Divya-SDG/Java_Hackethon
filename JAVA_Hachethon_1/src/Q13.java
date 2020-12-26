import java.util.*;
public class Q13 {

	public static void main(String[] args) {
		//Using Scanner split with spaces is not working but using scanner if : is given to split its working
              String st= "Java Code";
              System.out.println("The given String is "+ st);
              String[]  d= st.split("//s+");
			int k= d.length;
			/*System.out.println(k);
			for(int i=k-1;i>=0;i--) {
			System.out.println(d[i]);
			}*/
			String reverse=" ";	
			for(int i=k-1;i>=0;i--) {
								
			StringBuilder sb= new StringBuilder(d[i]);
		reverse = reverse+" " + sb.reverse();
								}
		System.out.println("The reverse of the String is "+ reverse);
							
							}
		}


