package VehicleData;

import java.util.Date;

public class Vehicle 
{
	// private variables
	private int vehicle_id;
	private String owner_name;
	private String vehicle_type;
	private Date purchase_date;
	
	// Default Constructor
	public Vehicle() 
	{
		vehicle_id = 0;
		owner_name = null;
		vehicle_type = null;
		purchase_date = null;
	}
	
	// Parameterized Constructor
	public Vehicle(int id, String name, String type, Date pdate) 
	{
		vehicle_id = id;
		owner_name = name;
		vehicle_type = type;
		purchase_date = pdate;
	}
	
	// Setter Functions
	public void setVId(int id) 
	{
		this.vehicle_id = id;
	}
	
	public void setOName(String name) 
	{
		this.owner_name = name;
	}
	
	public void setVType(String type) 
	{
		this.vehicle_type = type;
	}
	
	public void setPDate(Date pdate) 
	{
		this.purchase_date = pdate;
	}
	
	// Getter Functions
	public int getVId() 
	{
		return vehicle_id;
	}
	
	public String getOName() 
	{
		return owner_name;
	}
	
	public String getVType() 
	{
		return vehicle_type;
	}
	
	public Date getPDate() 
	{
		return purchase_date;
	}
	
	// Print toString Function
	public String toString() 
	{
		return "Vehicle ID : " + vehicle_id + 
				"\nOwner Name : " + owner_name + 
				"\nVehicle Type : " + vehicle_type + 
				"\nPurchase Date : " + purchase_date + 
				"\n----------------------------------------------------";
	}
}
