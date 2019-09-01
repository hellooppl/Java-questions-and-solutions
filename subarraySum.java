// this will add sub array to give a certain result.
// eg {1,5,10}   // 5+1 =6
import java.util.Scanner;

public class subarraySum {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int arrSize = sc.nextInt();
		int sum = sc.nextInt();
		
		int[] lowest = new int[arrSize];
		int j =0,  k =0;
		int[] highest = new int[arrSize];
		
		for(int i =0; i<arrSize; i++) {
		
			int temp = sc.nextInt();
			
			if(temp<sum) 
			{
				lowest[j++] = temp;
				
			}
			else 
			{
				highest[k++]  = temp;
			}
			

		}
		method2(lowest,sum,0);		
		
		
		
		
	}
		
	
	public static int method2(int [] lowest,int sum, int index) 
	{
		if(index == lowest.length) {
			return lowest[index];
		}
	   if((method2(lowest,sum,index)+lowest[index])==12) {
		   return index;
	   }
	   return lowest[index];
	}
	
}
