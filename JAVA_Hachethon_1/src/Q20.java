import java.util.Scanner;

public class Q20 {
	public static void main(String[] args) {
		System.out.println("Enter the string with lower,caps,numbers ");
		Scanner s= new Scanner(System.in);
		String st =s.next();
		String s1="",s2="",s3="";
		int count1=0, count2=0, count3=0;
		for(int i=0;i<st.length();i++) {
			if(Character.isLowerCase(st.charAt(i))) {
				s1=s1+st.charAt(i);
				count1++;
			}
			
		}
			for(int i=0;i<st.length();i++) {
				if(Character.isUpperCase(st.charAt(i))) {
					s2=s2+st.charAt(i);
					count2++;
				}
			}
				for(int i=0;i<st.length();i++) {
				if(	Character.isDigit(st.charAt(i))) {
					s3=s3+st.charAt(i);
						count3++;
					}
				}
				
				
				System.out.println("The number of lower-case in String are " + count1 +",Uppercase are "+ count2  + " numbers are " +count3);
				
				
				//System.out.println("occurencce of lower case");
	       Q20 a1= new Q20();
	       a1.OccurenceOfDups(s1, count1);
	       System.out.println("occurencce of upper case");
	        Q20 a2= new Q20();
	       a1.OccurenceOfDups(s2, count2);
	       System.out.println("occurencce of numbers");
	       Q20 a3= new Q20();
	       a1.OccurenceOfDups(s3, count3);
	       
	}
public void OccurenceOfDups(String s, int a) {
	int count;
	char c[]=s.toCharArray();
	//System.out.println(a);
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
        if(count>1)
        {
        	System.out.println(c[i] + " -- " + count + " times");
        }
    }  
	}

	
	
}

