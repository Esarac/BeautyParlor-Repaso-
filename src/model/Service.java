package model;

public class Service{
	
	//Constants
	//...Services:
	public static final String HAIR_CUT="Corte de cabello";
	public static final String MANICURE="Manicure";
	public static final String PEDICURE="Pedicure";
	//...
	//...Service Costs:
	public static final double C_HAIR_CUT=8000;
	public static final double C_MANICURE=7000;
	public static final double C_PEDICURE=9000;
	//...
	//...Tax
	public static final double TAX=0.19;
	//...
	//...Employee Revenue Percentage:
	public static final double P_HAIR_CUT=0.2;
	public static final double P_MANICURE=0.35;
	public static final double P_PEDICURE=0.25;
	//...
	//Publicity 
	public static final double PT_PUBLICITY=0.13;
	public static final double P_PUBLICITY=0.05;
	//...
	
	//Atributes
	private String name;
	private int times;
	private double revenue;
	private double totalTax;
	private double employeeRevenue;
	
	//Constructor
	public Service(String name){
		
		this.name=name;
		times=0;
		revenue=0;
		totalTax=0;
		employeeRevenue=0;
		
	}
	
	//Do
	public String useService(boolean publicity){
		
		String message="";
		
		return message;
		
	}
	
	public String report(){
		
		String report="";
		
		return report;
		
	}
	
	//Gets
	public String getName(){
		
		return name;
		
	}
	
	public int getTimes(){
		
		return times;
		
	}
	
	public double getRevenue(){
		
		return revenue;
		
	}
	
	public double getTotalTax(){
		
		return totalTax;
		
	}
	
	public double getEmployeeRevenue(){
		
		return employeeRevenue;
		
	}
	
	//Sets
	public void setName(String name){
		
		this.name=name;
		
	}
	
	public void setTimes(int times){
		
		this.times=times;
		
	}
	
	public void setRevenue(double revenue){
		
		this.revenue=revenue;
		
	}
	
	public void setTotalTax(double totalTax){
		
		this.totalTax=totalTax;
		
	}
	
	public void setEmployeeRevenue(double employeeRevenue){
		
		this.employeeRevenue=employeeRevenue;
		
	}
	
}