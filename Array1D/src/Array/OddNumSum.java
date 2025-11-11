package Array;

import java.util.Scanner;

public class OddNumSum {
	
	public int oddNumSum(int[] arr) {
		int sum = 0;
		
		for(int i: arr) {
			if(i % 2 != 0) {
				sum+= i;
			}
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		OddNumSum obj = new OddNumSum();
		
		int ans = obj.oddNumSum(arr);
		
		System.out.print("Sum of odd numbers is "+ans);
		
		sc.close();

	}

}
