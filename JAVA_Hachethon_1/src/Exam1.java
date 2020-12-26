import java.util.Scanner;

public class Exam1 {
	
		 public static void main(String[] args) {
		
		System.out.println("Enter the p value ");
		Scanner s= new Scanner(System.in);
		int p =s.nextInt();
		System.out.println("Enter the q value ");
		
		int q =s.nextInt();
		Integer arr[][] = new Integer[p][q];
		System.out.println("Enter the values in the array ");
		for(int i=0;i<p;i++) {
			for(int j=0;j<q;j++) {
				int k= s.nextInt();
				
			     arr[i][j]=k;
			}
		}
		System.out.println("The array is ");
		for(int i=0;i<p;i++) {
			System.out.println();
			for(int j=0;j<q;j++) {
				System.out.printf("%d ", arr[i][j]);
				}
		}
		
		//calculate the  sum of  digits in an array
		int sum=0;
		for(int i=0;i<p;i++) {
			for(int j=0;j<q;j++) {
				sum= sum+ arr[i][j];
				}
		}
		System.out.println();
		System.out.printf("the sum of  the values in the matrix is  %d", sum);
	}
}
	



