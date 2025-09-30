import java.util.Scanner;
class TestFunction{
	public int factorial(int n){
		int fact=1;
		if(n<1){
			return 1;
		}
		else{
			for (int i=1;i<=n;i++){
				fact=fact*i;
			}
			return fact;
		}
		
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		TestFunction obj=new TestFunction();
		int factorial=obj.factorial(num);
		System.out.println("factorial is" +factorial);
	}
	
}