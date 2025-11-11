package Array;
import java.util.Scanner;

public class SequentialSearch {

	
	
	public static void main(String[] args) {
		
			int s;
			int arr [] = new int[5];
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Array");
			for(int i = 0;i < arr.length;i++) {
				arr[i] = sc.nextInt();	
			}
			
			System.out.println("Enter the Number to Search");
			s = sc.nextInt();
		
			SequentialSearch a = new SequentialSearch();
			int ans = a.seqNumSer(arr, s);
			
			if(ans == -1) {
				System.out.println("Number Not found");
			}
			else System.out.println("Number is found at Index: "+ans);
			
			sc.close();
	}
	
	// function for sequential search
	public int seqNumSer(int num [],int n) {
		for(int i = 0; i < num.length;i++) {
			if(n == num[i]) {
				return i;
			}
			
		}
		return -1;
	}

}
