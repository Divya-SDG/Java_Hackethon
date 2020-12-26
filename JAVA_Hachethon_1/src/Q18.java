import java.util.Scanner;

public class Q18 {
	public static void main(String[] args) {
		System.out.println("Enter the string with lowercase ");
		Scanner s= new Scanner(System.in);
		String st =s.next();
		int a= st.length();
		int count;
		System.out.println(a);
		char c[]=st.toCharArray();
		//int[] c= {1,2,3,4,4,5,6};
		System.out.println("The occurence of  charcters  in string are");
		
		
		for(int i=0;i<a;i++)
	    {
	        count=1;
	        for(int j=i+1;j<=a-1;j++)
	        {
	            if(c[i]==c[j] && c[i]!='\0')
	            {
	                count++;
	                c[j] = '\0';
	            }
	        }
	        if(c[i]!='\0')
	        {
	        	System.out.println(c[i] + " -- " + count + " times");
	        }
	    }  
		}
	}


