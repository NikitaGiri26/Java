import java.util.Scanner;
class Max3numbers{
	
	public static void main(String args[]){
		int n1=0,n2=0,n3=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three Numbers: ");
		
		
		n1= sc.nextInt();
		n2= sc.nextInt();
		n3= sc.nextInt();
		

			if (n1==n2 && n2==n3){
				System.out.println("Numbers are Equal");
			}
			else
			{
				if(n1>n2 && n1>n3)
				{
					System.out.println(n1+"is greater than other two");
				}
				else if(n2>n1 && n2>n3)
				{
					System.out.println(n2+"is greater than other two");
				}
				else
				{
					System.out.println(n3+"is greater than other two");
				}
			
			}
					sc.close();
	
	}	
}