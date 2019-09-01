package codingwars;

import java.util.Scanner;

public class MaximumIndex {

	
	public static int findMax(int[] arr, int size) {
		
		
		int highest = Integer.MIN_VALUE;
		
		for(int i = 0; i<size; i++) {
			for(int j= i; j<size; j++)
			{
				if(arr[i]<arr[j]) 
				{
					if((j-i)>highest) 
					{
						highest = j;
					}
				}
			}
		}
	return highest;
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		int size = sc.nextInt();
		int [] arr = new int[size];
		
		for(int i = 
				0; i<size; i++) 
		{
			arr[i] = sc.nextInt();
		}
	
	System.out.println(arr[0]);
	
	while(testCase>0) {
	System.out.println(findMax(arr, size));
	testCase=-1;
	}
	}
	
}
