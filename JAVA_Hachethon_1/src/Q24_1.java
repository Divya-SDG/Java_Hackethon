import java.util.Scanner;

public class Q24_1 {

	public static void main(String[] args) {
		System.out.println("Enter the number ");
		Scanner s= new Scanner(System.in);
		int n =s.nextInt();
		 int sum=0,c=0,j=0;
		 System.out.println("The possible combination are :");
         for(int i=1;i<n;i++)
         {
             sum=i;
             j=i+1;
        while(sum<n)
             {
                 sum=sum+j;
                 j++;
             }

           if(sum==n)
                 {
                     for(int k=i;k<j;k++)
                     {
                         if(k==i)
                             System.out.print(k);
                         else
                             System.out.print(" + "+k);
                     }
                  System.out.println();
                 }
         }
     }
 
}


