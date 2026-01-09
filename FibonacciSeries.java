package week1.day2;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Scanner scanner = new Scanner(System.in);
		
		int range = scanner.nextInt();
		
		int num1=0;
		int num2=1;
		int num3;
		
		for(int i=0; i<range; i++)
		{
			System.out.println(num1);
			
			num3= num1 + num2;
			num1=num2;
			num2=num3;
			
		}
	}
}

