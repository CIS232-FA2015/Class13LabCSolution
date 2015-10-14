package cis232.classlab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter a byte:");
		Scanner keyboard = new Scanner(System.in);
		try{
			
			byte num = keyboard.nextByte();
			if(num % 2 == 0){
				System.out.println("Your byte is even");
			} else {
				System.out.println("Your byte is odd");
			}
		}catch(InputMismatchException e){
			System.out.println("That's not a byte.");
		}
		
		keyboard.close();
	}

}
