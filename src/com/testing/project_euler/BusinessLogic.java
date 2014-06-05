package com.testing.project_euler;

public class BusinessLogic {
	// DoThing dt;
	public BusinessLogic() {
		// Callback method -> By interface (observer pattern) || By instance (IoC) 
		/* DoThing dt, DoThingImpl dti
		this.dt = dt; 
		dt.Methods(); 
		dti.Methods(); */ 
	}
	
	// 1 
	public int SumOfMultiplesBelow(double multipleOf, double belowOf) { 
	
		// Formula n*(a1+an)/2 
		/* 
		 * Explanation: 
		 * When arithmetic serie was reverted and adding natural serie 
		 * a constant was produced. 
		 * 3 + 6 + 9 = 18 
		 * 9 + 6 + 3 = 18
		 * 12 + 12 + 12 = 36/2 = 18 
		 * 
		 */ 
		int numberOfElements = (int) Math.floor(belowOf/multipleOf); 
		int firstNumberInSequence = (int) multipleOf; 
		int lastNumberInSequence = (int) firstNumberInSequence+(numberOfElements-1)*(int)multipleOf; 
		return (numberOfElements*(firstNumberInSequence+lastNumberInSequence))/2;  
	} 
	
	// 2 
	public long SumOfFibonacciEvenNumbers() {
		int n1=1, n2=1, temp=0; 
		long sumOf = 0; 
		do { 
			if (n1%2==0) {
				sumOf += n1; 
			} 
			temp = n2; 
			n2 = n1; 
			n1 = n1 + temp; 
		} while (n1 < 4000000 && n2 < 4000000); 
		return sumOf; 
	} 
	
	// 3 
	public long PrimerNumberFactorization(long n) {  
		for (long c=(long) Math.sqrt(n); c>1; c--) { 
			if (Utils.IsPrime(c)) { 
				if ((n%c)==0) { 
					System.out.println(c); 
					PrimerNumberFactorization(n/c); 
					break; 
				}  
			} 
		} 
		return 0; 
	} 
	
	// 4 
	public int PalindromeNumber() { 
		int max = 0; 
		for (int i=100; i<999;i++) { 
			for (int j=999;j>i;j--) {
				// System.out.println("i" + i + "*j" + j +"=x" +i*j); 
				boolean result = Utils.isPalindrome(i*j); 
				Utils.isPalindrome(999); 
				if (result) {
					if (i*j>max) {
						max = i*j; 
					}
				} 
			} 
		} 
		System.out.println(max); 
		return 0; 
	} 
	
	public void test() {
		// int i = 3; 
		// ++var primer incrementa i despres evalua  
		// var++ primer evalua i despres incrementa
        /* i++;
        // prints 4
        System.out.println(i);
        ++i;			   
        // prints 5
        System.out.println(i);
        // prints 6
        System.out.println(++i);
        // prints 6 
        // 1- Mostrar valor 2- Incrementar valor 
        System.out.println(i++);
        // prints 7
        System.out.println(i); */ 
		/* for (int j=0; j<10;j++) {
			System.out.println(j); 
		} 
		for (int j=0; j<10;++j) {
			System.out.println(j); 
		} */ 
	} 
}
