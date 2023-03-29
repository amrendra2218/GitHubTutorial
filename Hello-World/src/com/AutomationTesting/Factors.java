package com.AutomationTesting;

public class Factors {
	static int n=18;
	

	public static void main(String[] args) {
		int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
				System.out.println("The Factors of n is:" +i);
			}
		}
		if(c==2) {
			System.out.println("n is prime Number");
		}
		else {
			System.out.println("n is not a prime number");
		}
		System.out.println("The Factors of n is:"+c);
		

	}

}
