package DynamicArray;

import java.util.Scanner;

public class Array2DService {

	// Function to Accept Data from user
	public static void acceptData(int[][] arr) 
	{
	    Scanner sc = new Scanner(System.in);

	    for (int i = 0; i < arr.length; i++) 
	    {
	        System.out.println("enter number of columns for row " + i);
	        int col = sc.nextInt();
	        arr[i] = new int[col];

	        for (int j = 0; j < arr[i].length; j++) 
	        {
	            System.out.println("enter value for " + i + "," + j);
	            arr[i][j] = sc.nextInt();
	        }
	    }

	}
	
	// Function to Display Data
	public static void displayData(int[][] arr) 
	{
	    for (int i = 0; i < arr.length; i++) 
	    {
	        for (int j = 0; j < arr[i].length; j++) 
	        {
	            System.out.print(arr[i][j] + "\t");
	        }
	        System.out.println();
	    }
	}
	
	// Function to find maximum element from array
	public static int maxOfAll(int[][] arr) 
	{
		int max = arr[0][0];

	    for (int i = 0; i < arr.length; i++) 
	    {
	        for (int j = 0; j < arr[i].length; j++) 
	        {
	            if (max < arr[i][j]) 
	            {
	                max = arr[i][j];
	            }
	        }
	    }
		return max;
	}
	
	// Function to find max element in each row and return array of it
	public static int[] maxOfAllRowwise(int[][] arr) 
	{
		int[] max = new int[arr.length];
		
	    for (int i = 0; i < arr.length; i++) 
	    {
	        max[i] = arr[i][0];
	        for (int j = 0; j < arr[i].length; j++) 
	        {
	            if (max[i] < arr[i][j]) 
	            {
	                max[i] = arr[i][j];
	            }
	        }
	    }
	    return max;
	}

	// Function to find max element in each column and return array of it
	public static int[] maxOfAllColwise(int[][] arr) 
	{
		int max_length = arr[0].length;
		
		// Find max column length to create 1D array
		for(int i = 0; i < arr.length; i++) 
		{
			for(int j = 0; j < arr[i].length; j++) 
			{
				max_length = arr[i].length;
			}
		}
		
		int[] max = new int[max_length];
		
		// Compare each element with elements in max[]
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				if (max[j] < arr[i][j]) 
				{
					max[j] = arr[i][j];
				}

			}
		}
		
		return max;
	}

	// Function to find add element in each row and return array of it
	public static int[] rowWiseAddition(int[][] arr) 
	{
		int[] add = new int[arr.length];
		
	    for (int i = 0; i < arr.length; i++) 
	    {
	        add[i] = 0;
	        for (int j = 0; j < arr[i].length; j++) 
	        {
	            add[i] += arr[i][j];
	        }
	    }
	    return add;
	}

	// Function to find add element in each column and return array of it
	public static int[] colWiseAddition(int[][] arr) 
	{
		int max_length = arr[0].length;
		
		// Find max column length to create 1D array
		for(int i = 0; i < arr.length; i++) 
		{
			for(int j = 0; j < arr[i].length; j++) 
			{
				max_length = arr[i].length;
			}
		}
		
		int[] add = new int[max_length];
		
		// Compare each element with elements in max[]
		for (int i = 0; i < arr.length; i++) 
		{
			add[i] = 0;
			for (int j = 0; j < arr[i].length; j++) 
			{
				add[i] += arr[i][j];
			}
		}
		
		return add;
	}
	

}
