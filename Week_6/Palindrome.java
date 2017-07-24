//Caleb Miller
	//2170720	
		//I should have taken my math classes after these classes :}
public class Palindrome {
	public static boolean isPrime(int n) {
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return (n != 1) ? true : false;
	}
	public static boolean isPalindrome(int n){
		int primeNum = n;
		int palindNum = 0;
		while(primeNum > 0) {
			palindNum = (palindNum * 10) + primeNum % 10;
			primeNum = primeNum / 10;
		}
		return n == palindNum;
	}
	public static void main(String[] args) {
		for(int i = 1; i <= 100000; i++) {
			if(isPrime(i) && isPalindrome(i)){
				System.out.println(i);
			}
		}
	}
}
