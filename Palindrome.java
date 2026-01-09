package week1.day2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		int output=0;
		
		for(int number=input; number>0; number/=10)
		{
			int rem=number%10;
			output=output*10 + rem;
		
		}
		System.out.println(output);
		
		if(input==output)
		{
			System.out.println("It is a Palindrome Number");
		}
		else
		{
			System.out.println("It is not a Palindrome Number");
		}
		scanner.close();
	}

}
