package projectGame;

import java.util.Scanner;

import java.lang.Math;

public class GameGeneratingNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int max = 30, min = 0, value, userValue;
		int i=5;
		while(i-->0) {
		System.out.println("Please Enter A Number You Think It Could Draw Between(0 to 30): ");
		System.out.println();
		userValue = sc.nextInt();
		
		value = (int)(Math.random()*(max-min+1)+min);
		if(value == userValue)
			System.out.println("Congrats!!!You Won");
		else
			System.out.println("Better Luck Next Time");
		System.out.println();
		System.out.println("The Drawn Number is: "+value);

	    }
		System.out.println("TIMES UP:(...  Better Luck Next Time");
	
	}
	
}
