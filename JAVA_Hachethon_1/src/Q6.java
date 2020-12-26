import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		System.out.println(" Enter  the size of array");
		Scanner s= new Scanner(System.in);
		int a =s.nextInt();
		int [] num= new int[a];
	int k=0, temp=0;
		for(int i=0;i<num.length;i++) {
			System.out.println(" enter  the " + i +" number");
			 k =s.nextInt();
			 num[i]=k;
			}
		System.out.println("Before sorting given array is ");
		for(int i=0;i<num.length;i++) {
			System.out.printf("%d ", num[i]);  
			}
		System.out.println();
		 System.out.print("After sorting array as per selection sort");  
	       for( int i=0; i<a; i++)  
	       {  
	           for(int j=i+1; j<a; j++)  
	           {  
	               if(num[i] > num[j])  
	               {  
	                   temp = num[i];  
	                   num[i] = num[j];  
	                   num[j] = temp;  
	               }  
	           }  
	       }  
	         
	       System.out.print("Now the Array after Sorting is :\n");  
	       for(int i=0; i<a; i++)  
	       {  
	           System.out.printf("%d ", num[i]);  
	       }  
	 
	 
	}

}
