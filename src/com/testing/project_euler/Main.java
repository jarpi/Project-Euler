package com.testing.project_euler;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) { 
		BusinessLogic lb = new BusinessLogic(); 
		boolean exit = false; 
		Scanner s = new Scanner(System.in);
		int option = 0; 

		/* Get methods of class 
		 * If they have an annotation, run it 
		 */
		/* AnnotationRunner runner = new AnnotationRunner();
        Method[] methods = runner.getClass().getMethods();
        for (Method method : methods) {
            CanRun annos = method.getAnnotation(CanRun.class);
            if (annos != null) {
                try {
                    method.invoke(runner);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } */ 
		/* HelloWorldAnonymousClasses myApp =
	            new HelloWorldAnonymousClasses();
	        myApp.sayHello();*/ 
		while (!exit) { 
			System.out.println("Project Euler menu assistant");
			System.out.println("Type the number you want to see result and a little explanation");
			System.out.println("1- First exercise - arithmetic serie");
			System.out.println("2- Second exercise - Sum of fibonacci even numbers");
			System.out.println("3- Third exercise - Prime factorization");
			System.out.println("4- Fourth exercise - Palindrome Numbers");
			System.out.println("5- Fifth exercise - Smallest Multiple");  
			System.out.println("6- Sixth exercise - Sum of squares - squares sum");
			System.out.println("7- Seventh exercise - find prime");
			System.out.println("0- Exit"); 
			try { 
				// TODO: Fix input method to clear buffer 
				option = s.nextInt(); 
			} catch (InputMismatchException e) { 
				System.out.println("\nInput not recognized");
				// System.exit(0); 
				option = 99; 
				s.nextLine(); 
			} 
			switch (option) {
			case 0: 
				exit=true;
				s.close(); 
				break; 
			case 1: 
				int a=3, b=5, c=Utils.mcm(a, b); 
				int sumOfA = lb.SumOfMultiplesBelow(a, 999); 
				int sumOfB = lb.SumOfMultiplesBelow(b, 999); 
				int sumOfC = lb.SumOfMultiplesBelow(c, 999); 
				int total = sumOfA + sumOfB - sumOfC; 
				System.out.println("The sum of multiples of 3 or 5 below 1000: " + total);  
				break;
			case 2: 
				System.out.println("The sum of fibonacci even numbers is: " + lb.SumOfFibonacciEvenNumbers()); 
				break; 
			case 3: 
				// lb.test(); 
				// System.out.println("IsPrime(" + i +"): " + lb.IsPrime(i));
				long l = new Long(600851475143L);  
				System.out.println(lb.PrimerNumberFactorization(l));
				break; 
			case 4: 
				System.out.println("Palindrome number: " + lb.PalindromeNumber()); 
				break; 
			case 5: 
				System.out.println("Smallest multiple: " + lb.SmallestMultipleImprovement(11, 20)); 
				break; 
			case 6: 
				System.out.println("Sum of squares - Squares sum: " + lb.SumSquaresSquaresSumDiff(100)); 
				break; 
			case 7: 
				System.out.println("Find prime: " + lb.findIndividualPrime(10001)); 
				break; 
			case 99: 
				break; 
			} 
		} 
	}
}

// testing 