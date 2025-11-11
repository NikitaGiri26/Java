package Array;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		System.out.println("Enter the elements of array");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Elements of array are ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		int choice;
		
			do {
			System.out.println("\n\n1. To search a number \n2. To find minimun element\n3. To find maximun element\n4. To add all numbers\n5. Exit");
			choice = sc.nextInt();
			switch (choice) {
				
				case 1:
					
					System.out.println("Enter the number to search : ");
					int n = sc.nextInt();
					
					for (int i = 0; i < arr.length; i++) {
						if (n == arr[i]) {
							System.out.println("The number is found at index " + i);
						}
		//				else System.out.println("The number not found");
					}
					break;
					
				case 2 :
					int min = arr[0];
					for(int i = 0;i < arr.length;i++) {
						
						if(min > arr[i]) {
							min = arr[i];
						}
					}
					System.out.println("Smallest number in array: "+min);
					break;
				
					
				case 3 :
					int max = arr[0];
					for(int i=0;i < arr.length;i++) {
						
						if(max < arr[i]) {
							max = arr[i];
						}
					}
					System.out.println("Largest number in array: "+max);
					break;
				
					
				case 4 :
					int sum = 0;
					for(int i = 0;i < arr.length;i++) {
						sum += arr[i];
						}
					
					System.out.println("Sum of all number in array: "+sum);
					break;
			
			}
		}while(choice!=5);
		
		
		
		sc.close();
	}

}
