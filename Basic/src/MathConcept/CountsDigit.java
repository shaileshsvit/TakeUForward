package MathConcept;

public class CountsDigit {
public static void main(String[] args) {
int no=1534236469;  
System.out.println(count2(no));
System.out.println();
System.out.println(reverse(no));
}
public static int reverse(int x) {
boolean isNegative = false;
if (x < 0) {
    isNegative = true;
    x = -x;
}
//1534236469
int res = 0;
while (x > 0) { 
    int digit = x % 10;
    x /= 10;
	
	  if (res > (Integer.MAX_VALUE - digit) / 10) {
		  
		  return 0;
		  
	  }
	
    res = (res * 10) + digit;
}

return isNegative ? -res : res;    
	
}
public static int count2(int no) {
	
	int cnt=(int) (Math.log10(no)+1);
	return cnt;
	
}
public static int count(int no) {
	int cnt=0;
	while(no>0) {
		int lastDigit=no%10;
		cnt=cnt+1;
		no=no/10;
		
	}
	return cnt;
}
}
