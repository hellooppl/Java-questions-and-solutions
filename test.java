package codingwars;

public class test {

	public static String revRot(String strng, int sz) {
		String rtnvalue = "";
		if((strng.length()<sz) ||strng.length()<=0)
		{
			System.out.println("2");
			return "";
		}
		
		rtnvalue = strng.substring(0,sz);
		double temp=0.0;
		for(int i = 0; i<rtnvalue.length();i++)
		{
		System.out.println("1");
			temp = Math.pow((char)rtnvalue.charAt(i), 3)+temp;
		}
		
		if(temp/2==Math.round(temp/2)) {
			for(int i = rtnvalue.length()-1; i>0; i++) 
			{
				rtnvalue = rtnvalue + rtnvalue.charAt(i);
			}
		}
		rtnvalue = rtnvalue+revRot(strng.substring(sz),sz);	
		return rtnvalue;
	}

	public static void main(String[] args)

	{
		System.out.println(revRot("123456789", 4)+"hello world");
	}
}
