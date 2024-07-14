package MathConcept;

import java.util.ArrayList;

public class CountsDigit {
public static void main(String[] args) {


int number = 9;

/*System.out.println(count2(no));
System.out.println();
System.out.println(reverse(no));
System.out.println(palindrome(no));
System.out.println();

System.out.println(armstrong(no));
*/

int checkPrimeResult=checkprime(number);
if(checkPrimeResult==2) 
	System.out.println(true);
else 
	System.out.println(false);
ArrayList<Integer> divisors = findDivisors(number);

System.out.print("Divisors of " + number + " are: ");
for (int divisor : divisors) {
    System.out.print(divisor + " ");
}
System.out.println();
}

public static int checkprime(int n) {
    // Initialize an empty
    // ArrayList to store the divisors
int cnt=0;
    // Iterate up to the square
    // root of n to find divisors
    // Calculate the square root of n
    int sqrtN = (int) Math.sqrt(n);

    // Loop from 1 to the
    // square root of n
    for (int i = 1; i <= sqrtN; ++i) {
        // Check if i divides n
        // without leaving a remainder
        if (n % i == 0) {
            // Add divisor i to the list
           cnt++;

            // Add the counterpart divisor
            // if it's different from i
            if (i != n / i) {
            	cnt++;
                // Add the counterpart
                // divisor to the list
            }
        }
    }

    // Return the list of divisors
    return cnt;
}

 public static ArrayList<Integer> findDivisors(int n) {
    // Initialize an empty
    // ArrayList to store the divisors
    ArrayList<Integer> divisors = new ArrayList<>();

    // Iterate up to the square
    // root of n to find divisors
    // Calculate the square root of n
    int sqrtN = (int) Math.sqrt(n);

    // Loop from 1 to the
    // square root of n
    for (int i = 1; i <= sqrtN; ++i) {
        // Check if i divides n
        // without leaving a remainder
        if (n % i == 0) {
            // Add divisor i to the list
            divisors.add(i);

            // Add the counterpart divisor
            // if it's different from i
            if (i != n / i) {
                // Add the counterpart
                // divisor to the list
                divisors.add(n / i);
            }
        }
    }

    // Return the list of divisors
    return divisors;
}
private static int[] printDivisors(int n, int[] size) {
	// TODO Auto-generated method stub
	int [] divisors=new int[n];
	int count=0;
	for(int i=1;i<=n;i++) {
		if(n%i==0)
			divisors[count++]=i;
	
	}
	size[0] = count;
	
	return divisors;
}

public static boolean armstrong(int n) {
	int len=0;
	int no=n;
	while(no!=0) {
		len++;
		no/=10;
	}
	return getSum(n,len)==n;
}
public static int getSum(int no,int l) {
	int result=0;

	while(no!=0) {
result+=+Math.pow(no%10, l);

no/=10;
	}
return result;
}
public static int getSumOfKthPowerOfDigits(int n, int k) {
    // `result` stores the result of sum of k'th power of each digit.
   int result = 0;

   // Run until n is not 0
   while(n != 0) {
       // Modulo 10 gives us the last digit
       // Add digit ^ k to the result
       result += Math.pow(n % 10, k);

       // Remove the last digit.
       n /= 10;
   }
   return result;
}
public static boolean isArmstrong(int n) {
    // Initilize length counter to 0.
    int length = 0;

    // Get the number of digits in integer `n`.
    int tempN = n;

    // Get the length of the integer `n`
    while (tempN != 0) {
        length++;
        tempN /= 10;
    }

    // Return true if Sum of k'th power of digits equals original number.
    return getSumOfKthPowerOfDigits(n, length) == n;
}


public static boolean palindrome(int s) {
	int rev=0;
	int no=s;
	while(no>0) {
		int lastDigit=no%10;
		rev=(rev*10)+lastDigit;
				no/=10;
	}
	if(s==rev)
		return true;
	else 
		return false;
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
