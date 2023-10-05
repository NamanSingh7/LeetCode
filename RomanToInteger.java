import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    // Given a roman numeral, convert it to an integer.
 public static int romanToNumber(String str){
    HashMap <Character,Integer> mp = new HashMap<>();
    mp.put('I', 1);
    mp.put('V', 5);
    mp.put('X', 10);
    mp.put('L', 50);
    mp.put('C', 100);
    mp.put('D', 500);
    mp.put('M', 1000);
    int ans = 0;
    int n = str.length();
    if(n==0) return 0;
    ans = ans + mp.get(str.charAt(n-1));
    
    for (int i = n-2; i>=0; i--) {
        char ch1 = str.charAt(i);
        char ch2 = str.charAt(i+1);

        if(mp.get(ch1)<mp.get(ch2)){
            ans = ans - mp.get(ch1);
            
        }
        else if(mp.get(ch1)>=mp.get(ch2)){
            ans = ans +mp.get(ch1);
            // System.out.println(ans);
        }
        
    }

    return ans;
 }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter a Roman Value:");
            String str = s.nextLine();
            int n = romanToNumber(str);
            System.out.println(n);
        }

    }
    
    
}
