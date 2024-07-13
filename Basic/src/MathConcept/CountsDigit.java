package MathConcept;

public class CountsDigit {
public static void main(String[] args) {
int no=7898;
System.out.println(count(no));


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
