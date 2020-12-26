import java.util.*;

public class Q15 {
	public static void main(String[] args) {
		System.out.println("Enter the string with lowercase ");
		Scanner s= new Scanner(System.in);
		String st =s.nextLine();
	//String st="Divya  is  a   good  good  girl";
	System.out.println("The given string is " + st);
	
	String[]  d= st.split("\\s+");
    int k= d.length;
    System.out.println(k);
    
    Map<String, Integer> hMap = new LinkedHashMap<String, Integer>();
        for(int i = 0; i <k ; i++ ) {
           if(!hMap.containsKey(d[i])) {
              hMap.put(d[i],i);
           }         
        }
        System.out.println("The Unique words of String are ");
        Set<String> keys =hMap.keySet();
		 for(String l:keys ) {
			 System.out.println(l);
		}
        		
     }
	

}
