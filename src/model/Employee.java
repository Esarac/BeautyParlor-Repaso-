package model;

public class Employee{
	
	//Atributes
	private String name;
	private int id;
	private String job;
	private int incomeYear;
	
	private Service[] service;
	
	//Constructor
	public Employee(String name, int id, String job, int incomeYear){
		
		this.name=name;
		this.id=id;
		this.job=job;
		this.incomeYear=incomeYear;
		
		this.service=new Service[3];
		
	}
	
	//Do
	public String useService(String service, boolean publicity){
		
		String message="";
		
		return message;
		
	}
	
	public double revenueAverage(){
		
		double average=0;
		
		return average;
		
	}
	
	public double serviceProfit(String service){
		
		double profit=0;
		
		return profit;
		
	}
	
	public String employeeReports(){
		
		String report="";
		
		return report;
		
	}
	
	//Gets
	public String getName(){
		
		return name;
		
	}
	
	public int getId(){
		
		return id;
		
	}
	
	public String getJob(){
		
		return job;
		
	}
	
	public int getIncomeYear(){
		
		return incomeYear;
		
	}
	
	public Service getService(int index){
		
		return service[index];
		
	}
	
	//Sets
	public void setName(String name){
		
		this.name=name;
		
	}
	
	public void setId(int id){
		
		this.id=id;
		
	}
	
	public void setJob(String job){
		
		this.job=job;
		
	}
	
	public void setIncomeYear(int incomeYear){
		
		this.incomeYear=incomeYear;
		
	}
	
	public void setService(int index, Service service){
		
		this.service[index]=service;
		
	}
	
}