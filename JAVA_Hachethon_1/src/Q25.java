import java.util.Scanner;

public class Q25 {

	
		public static void main(String[] args) {
			System.out.println(" Enter  the size of array");
			Scanner s= new Scanner(System.in);
			int a =s.nextInt();
			int [] num= new int[a];
		int k=0, first=0, last= a-1;
			for(int i=0;i<num.length;i++) {
				System.out.println(" enter  the " + i +" number");
				 k =s.nextInt();
				 num[i]=k;
				}
			System.out.println("Enter the element to be searched");
			int f= s.nextInt();
			System.out.println("The given array is : ");
			for(int i=0;i<num.length;i++) {
				System.out.printf("%d ", num[i]);  
				}
			
			int  mid = (first + last)/2;  
			   while( first <= last ){  
			      if ( num[mid] < f ){  
			        first = mid + 1;     
			      }else if ( num[mid] == f ){  
			        System.out.println("Element is at index: " + mid);  
			        break;  
			      }else{  
			         last = mid - 1;  
			      }  
			      mid = (first + last)/2;  
			   }  
			   if ( first > last ){  
			      System.out.println("Element is not found!");  
			   }  
			 }  

	}


