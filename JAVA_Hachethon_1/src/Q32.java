import java.util.Arrays;
import java.util.*;

public class Q32 {

	static int NA =-1; 
    static void merge(int a[], int b[], int n, int m)  
    { 
        int i = n - 1; 
        int j = m - 1; 
          
        int lastIndex = n + m - 1; 
          while (j >= 0)  
        { 
          
             if (i >= 0 && a[i] > b[j])  
            { 
                a[lastIndex] = a[i];  
                i--; 
            } else 
            {   
                
                a[lastIndex] = b[j];  
                j--; 
            } 
           
            lastIndex--;  
        } 
    } 
      
   public static void main (String[] args)  
    { 
        int a[] = {1,2,4,6,9,10, NA, NA, NA, NA};
        System.out.println("Given array A is " + Arrays.toString(a));
        int n = 6; 
        
        int b[] = {3,5,7,8}; 
        System.out.println("Given array B is " + Arrays.toString(b));
        int m = 4; 
        int size_a = m+n; 
        merge(a, b, n, m); 
      
        System.out.println("The  array  after merging of sorted B into A  is  " + Arrays.toString(a));
    } 
} 
       