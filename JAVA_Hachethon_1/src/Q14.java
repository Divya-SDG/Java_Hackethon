import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		String st= "Java  Code";
        System.out.println("The given String is "+ st);
        String[]  d= st.split("\\s+");
        int k= d.length;
        System.out.println(k);
        System.out.println("The desired output  for given string is ");
        for(int i=k-1;i>=0;i--) {
		System.out.printf("%s " ,d[i]);
	}

}
}
