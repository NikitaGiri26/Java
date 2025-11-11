package Array;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {

		Scanner sc = new  Scanner(System.in);
		
		
//		System.out.println("Enter no of row ");
//		int row = sc.nextInt();
//		System.out.println("Enter no of col ");
//		int col = sc.nextInt();
		
		int arr[][] = new int[2][3];
		
		System.out.println("Enter the elements ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The elements are ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
		}

	}

}
