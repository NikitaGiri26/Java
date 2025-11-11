package Array;
import java.util.Scanner;

public class AddData {
	//Function for addition of array elements
	public int sum(int s[]) {
		int sum = 0;
		for(int i =0; i < s.length;i++) {
			sum += s[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int sum;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Array:");
		int arr[] = new int[5];
		
		for(int i = 0;i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		AddData d = new AddData();
		sum = d.sum(arr);
		System.out.println("Sum of the Array: "+sum);
		
		sc.close();
	}

}
