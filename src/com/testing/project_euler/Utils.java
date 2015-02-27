package com.testing.project_euler;

public class Utils {

	static boolean IsPrime(long n) { 
		long l = (long) Math.ceil(Math.sqrt(n)); 
		if (n!=1 && n!=2) {
			for (long i=2; i<=l; i++) {
				if ((n%i==0)) {
					return false; 
				} 
			} 
		} 
		return true; 
	} 
	
	static int mcd(int a, int b)
    {
        int x=0,bb=0;
        x = a;
 
        if (a < b) {
            a = b;
            b = x;
            return mcd(a,b);
        }
        else if (b != 0) {
            bb = a % b;
            a = b;
            b = bb;
            return mcd(a,b);
        }
        return a;
    }
 
    static int mcm(int a, int b) {
        int m=0;
        m=mcd(a,b);
        return(m*(a/m)*(b/m));
    } 
	
	static boolean isPalindrome(int n) {
		int numberOfDigits = 0;
		int palindromeSum = 0; 
		int k = n; 
		while (k>0) { 
			numberOfDigits+=1; 
			k = k/10; 
		} 
		k = n; 
		for (int i=numberOfDigits-1; i>=0;i--) {
			palindromeSum += ((k%10)*Math.pow(10,i)); 
			k = k/10; 
		} 
		if (palindromeSum == n) {
			return true; 
		}
		return false; 
	}
} 
	