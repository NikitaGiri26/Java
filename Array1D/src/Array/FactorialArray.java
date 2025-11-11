package Array;

import java.util.Scanner;

public class FactorialArray {
	
	public void factorialArray(int arr[]) {
		
		int mul = 1;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] <= 7) {
				for(int j = 1; j <= arr[i]; j++) { // 1 2 3 4
					mul *= j;
				}
				System.out.println("Factorial of "+arr[i]+ " is " + mul);
				mul = 1;
			}
			else System.out.println("Greater than 7");
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
		
		FactorialArray obj = new FactorialArray();
		
		obj.factorialArray(arr);
		
		sc.close();

	}

}
