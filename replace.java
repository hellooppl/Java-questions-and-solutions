package codingwars;

public class replace {
	

		 
		 public static int duplicateCount(String text) {
			 int number =0;   
			 
			 
			for(int i = 0; i<text.length();) 
			{
				
				if( text.substring(1).contains(text.substring(0,1))) {
					number = number+1;
					text = text.replace(text.substring(0,1), "");
				}
				

					}
						 
			 return number;
		 }	 
			 

public static void main(String[] args)
{
	System.out.println(duplicateCount("abcdacbd"));
}
}


