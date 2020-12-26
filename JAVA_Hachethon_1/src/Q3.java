import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
         System.out.println(" Enter  the size of array");
			Scanner s= new Scanner(System.in);
			int a =s.nextInt();
			int k=0;
			int [] num= new int[a];
			 for(int i=0;i<num.length;i++) {
				System.out.println(" enter  the " + i +" number");
				 k =s.nextInt();
				num[i]=k;
				}
			
			System.out.println("Given array is ");
			//System.out.println();
			for(int i=0;i<num.length;i++) {
				System.out.printf("%d ", num[i]);
				 }
			Arrays.sort(num);
			System.out.println("After sorting the array is ");
			for(int i=0;i<num.length;i++) {
				System.out.printf("%d ", num[i]);
				
				}
	}

}
