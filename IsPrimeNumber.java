package week1.day2;

import java.util.Scanner;

public class IsPrimeNumber {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
    boolean x=false;
    for(int i=2; i<=n-1; i++)
    {
    	if(n%i==0)
    	{
    		x=!x;
    		System.out.println("It is a Non-Prime Number");
    		break;
    	}
    }
    if(!x)
    {
    System.out.println("It is a Prime Number");
    }
    scanner.close();
	}

}
