import java.util.*;
public class Q26 {

	public static void main(String[] args) {
		
		Integer[]  array1= {1,2,4,6,9,10};
		Integer array2[] = {3,5,7,8};
		System.out.println("The given arrays are");
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		int k1= array1.length;
		int k2= array2.length;
		 List<Integer>  al= new ArrayList(Arrays.asList(array1));
		 al.addAll(Arrays.asList(array2));
		Collections.sort(al);
		System.out.println("After  merging and sorting the array is :");
		 System.out.println(al);
		 
		
		
		
}
}
