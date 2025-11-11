package VehicleData;

import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class VehicleService 
{
	static Vehicle[] varr;
	static int cnt;
	static 
	{
		varr=new Vehicle[100];
		varr[0] = new Vehicle(101,"abc","4 Wheeler", new Date(2000-11-11));
		varr[1] = new Vehicle(102,"xyz","3 Wheeler", new Date(1997-11-11));
		varr[2] = new Vehicle(103,"def","2 Wheeler", new Date(1997-11-11));
		cnt=3;
	}
	
	public static void displayAll() 
	{
		for(int i = 0; i < cnt; i++) {
			System.out.println(varr[i]);
		}
		
	}

	public static boolean addNewVehicle() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter vehicle ID : ");
		int vid=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Owner name : ");
		String oname=sc.next();
		
		System.out.print("Enter Vehicle type : ");
		String vtype=sc.next();
		sc.nextLine();
		
		System.out.print("Enter Purchase date (dd/mm/yyyy) : ");
		String pdate=sc.next();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date pdt = null;
		
		try {
			pdt = sdf.parse(pdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Vehicle v = new Vehicle(vid, oname, vtype, pdt);
		
		if(cnt==varr.length) {
			return false;
		}else {
			varr[cnt]=v;
			cnt++;
			return true;
		}
	}

	public static void searchByVId() {
		// TODO Auto-generated method stub
		
	}
}
