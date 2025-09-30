class DisplayTable
{
	public static void table(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
	    }
	}	
		
	public static void main (String args[])
	{
		System.out.println("Enter arguments"+args.length);
		if(args.length<=0)
		{
			System.out.println("Error:Atleat one argument required");
		}
		else
		{
			DisplayTable.table(Integer.parseInt(args[0]));
		} 
		
	}
	
}