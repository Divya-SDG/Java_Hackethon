import java.util.*;
public class Q30 {

	public static void main(String[] args) {

        Q30 q= new Q30();
        System.out.println("Enter the string ");
        Scanner sc= new Scanner(System.in);
        String c= sc.next();
       String k = q.findLongestPalindrome(c);
        System.out.println("The longest substring which is plaindrome is " + k);

    }
    
    public String findLongestPalindrome(String s) {
       
      if (s.length() == 1) {
            return s;
        }
        
        String longest = s.substring(0, 1);
        for (int i = 0; i < s.length(); i = i+1) {
            
            
            String s1 = ToKnowEqual(s, i, i);
            if (s1.length() > longest.length()) {
                longest = s1;
            }
    
           
            s1 = ToKnowEqual(s, i, i + 1);
            if (s1.length() > longest.length()) {
                longest = s1;
            }
        }
    
        return longest;
    }
    
    
    
    public String ToKnowEqual(String s, int begin, int end) {
        while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
        return s.substring(begin + 1, end);    
    }


	}


