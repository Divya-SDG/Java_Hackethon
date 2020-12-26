import java.util.*;
public class Q27 {

	public static void main(String[] args) {
		
        Integer[] array = new Integer[] { 5,8,1,3,0 };
         quickSort( array, 0, array.length - 1 );
         
         
         System.out.println();
         System.out.println("The quick sorted array is : ");
                System.out.println(Arrays.toString(array));
    }
 
    public static void quickSort(Integer[] arr, int low, int high)
    {
       
        if (arr == null || arr.length == 0){
            return;
        }
         if (low >= high){
            return;
        }
 
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
        int i = low, j = high;
        while (i <= j)
        {
            
            while (arr[i] < pivot)
            {
                i++;
            }
           
            while (arr[j] > pivot)
            {
                j--;
            }
            
            if (i <= j)
            {
                swap (arr, i, j);
                i++;
                j--;
            }
        }
        
        if (low < j){
            quickSort(arr, low, j);
        }
        if (high > i){
            quickSort(arr, i, high);
        }
    }
     
    public static void swap (Integer num[], int x, int y)
    {
        int temp = num[x];
        num[x] = num[y];
        num[y] = temp;
    }
    

}


