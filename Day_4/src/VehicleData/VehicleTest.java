package VehicleData;

import java.util.Date;
import java.util.Scanner;

public class VehicleTest {

	public static void main(String[] args) 
	{
		Vehicle v1 = new Vehicle(101, "abc", "4 Wheeler", new Date());
		Vehicle v2 = new Vehicle(102, "xyz", "2 Wheeler", new Date());
		
		System.out.println(v1);
		System.out.println(v2);
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do 
		{
			System.out.println("1. Display all\n2. Add new vehicle\n3. Search by Vehicle ID");
			System.out.println("4. Search by Owner Name\n5. Update Vehicle Type\n6. Exit");
			System.out.print("\nEnter your choice : ");
			choice=sc.nextInt();
			
			System.out.println("----------------------------------------------------");
			
			switch(choice) 
			{
			case 1:
				VehicleService.displayAll();
				break;
			
			case 2:
				boolean status = VehicleService.addNewVehicle();
				
				if(status) {
					System.out.println("Data Addded");
				}
				else
					System.out.println("Data Not Addded");
				break;
				
			case 3:
				VehicleService.searchByVId();
				break;
			}
			
		}while(choice != 6);
	}

}
