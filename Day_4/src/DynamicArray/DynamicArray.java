package DynamicArray;

import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		int[][] arr = new int[3][];
		
		Array2DService.acceptData(arr);
		Array2DService.displayData(arr);
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.println("\n1. find max of all data\n2. find max rowwise");
			System.out.println("3. find max column wise\n4. find addition rowwise");
			System.out.println("5. find addition columnwise\n6. exit");
			
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice) 
			{
			case 1:
				int max = Array2DService.maxOfAll(arr);
				System.out.print("Max of all array : " + max);
				System.out.println();
				break;
			
			case 2:
				int[] max1 = Array2DService.maxOfAllRowwise(arr);
				for(int i : max1) {
					System.out.println("Max Row wise : " + i);
				}
				
				System.out.println();
				break;
			
			case 3:
				int[] max2 = Array2DService.maxOfAllColwise(arr);
				for(int i : max2) {
					System.out.println("Max Column wise : " + i);
				}
				
				System.out.println();
				break;
			
			case 4:
				int[] add = Array2DService.rowWiseAddition(arr);
				for(int i : add) {
					System.out.println("Addition Row wise : " + i);
				}
				
				System.out.println();
				break;
				
			case 5:
				int[] add2 = Array2DService.colWiseAddition(arr);
				for(int i : add2) {
					System.out.println("Addition Column wise : " + i);
				}
				
				System.out.println();
				break;
			}
			
		} while(choice!=6);
		
		sc.close();

	}

}
