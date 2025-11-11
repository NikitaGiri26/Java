package Array;

import java.util.Scanner;

public class PrimeArray {
	
	public void isPrime(int[] arr) {
		
		int[] temp = new int[2];
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) 
		{
			for(int j = 2; i < arr[i]; j++) // 1 2 3 4 5
			{
				if(arr[i] % j != 0)
				{
					System.out.println("Prime numbers are " + arr[i]);
				}
			}
		}

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		PrimeArray obj = new PrimeArray();
		
		obj.isPrime(arr);
		
		sc.close();
		
	}

}
