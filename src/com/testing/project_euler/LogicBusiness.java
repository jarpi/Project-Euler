package com.testing.project_euler;

public class LogicBusiness {
	public LogicBusiness() {}
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
	
	static int mcd(int a, int b)
    {
        int x=0,nuevob=0;
        x = a;
 
        if (a < b)
        {
            a = b;
 
            b = x;
            return mcd(a,b);
        }
        else if (b != 0)
        {
            nuevob = a % b;
            a = b;
            b = nuevob;
            return mcd(a,b);
        }
        return a;
 
    }
 
    static int mcm(int a, int b)
    {
        int m=0;
        m=mcd(a,b);
        return(m*(a/m)*(b/m));
    }
}
