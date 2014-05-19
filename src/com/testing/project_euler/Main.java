package com.testing.project_euler;

import java.io.DataInputStream;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) { 
		LogicBusiness lb = new LogicBusiness(); 
		boolean exit = false; 
		Scanner s = new Scanner(System.in);
		int option = 0; 
		while (!exit) {
			System.out.println("Project Euler menu assistant");
			System.out.println("Type the number you want to see result and a little explanation");
			System.out.println("1- First exercise - arithmetic serie");
			System.out.println("0- Exit"); 
			option = s.nextInt(); 
			switch (option) {
			case 0: 
				exit=true;
				s.close(); 
				break; 
			case 1: 
				int a=3, b=5, c=LogicBusiness.mcm(a, b); 
				int sumOfA = lb.SumOfMultiplesBelow(a, 999); 
				int sumOfB = lb.SumOfMultiplesBelow(b, 999); 
				int sumOfC = lb.SumOfMultiplesBelow(c, 999); 
				int total = sumOfA + sumOfB - sumOfC; 
				System.out.println("The sum of multiples of 3 or 5 below 1000: " + total);  
				break; 
			}
		} 
	}
}
