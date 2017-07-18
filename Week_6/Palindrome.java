public class Palindrome {
	public static boolean checkIfPrime (int num) {
        boolean isPrime = true;  
        for (int i = 2; i <= 100000; i++) {
            if ( num % i == 0 ){
                isPrime = false;
            }
        }
        return isPrime;
    }	
	public static void isPalindrome(Integer a) {
	    String num=Integer.toString(a);
	    int length=num.length()-1;
	    //System.out.println(num);
	    if(num.length()<=1) {
	        System.out.println("" + num);

	    }
	    else if(num.length()==2) {
	        if(num.charAt(0)==num.charAt(1))
	            System.out.println(num);
	    }
	    else if(num.length()>2) {
	        //now deal with the numbers whose length is greater than 2
	        for(int i=0;i<=length;i++) {
	            if(num.charAt(i)==num.charAt(length-i))
	                System.out.println(num);
	        }
	    }
	}
	private static int reverse(int i) {
		int result = 0;
		while (i > 0) {
			result = result * 10 + (i % 10);
			i = i / 10;
		}
		return result;
	}
	public static void main(String[] args) {
		for ( int i = 0; i < 100000; i++ ) {
            if ( i == reverse(i) ) {
                System.out.println( i );
            }
        }
	}
	
}
