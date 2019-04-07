package model;

public class BeautyParlor{
	
	//Atributes
	private Employee[] employee;
	
	//Constructor
	public BeautyParlor(Employee employee1, Employee employee2){
		
		this.employee=new Employee[2];
		
		this.employee[0]=employee1;
		this.employee[1]=employee2;
		
	}
	
	//Do
	public String showMenu(){
		
		String menu="\n|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|";
		menu+="\nJohanios Salon de Belleza";
		menu+="\n|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|";
		menu+="\n 1.Usar un servicio";
		menu+="\n 2.Promedio de ingresos acumulado por servicio de el empleado";
		menu+="\n 3.Ganacia del empleado por un servicio";
		menu+="\n 4.Mostrar reporte del empleado";
		menu+="\n|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|";
		menu+="\n~";
		
		return menu;
		
	}
	
	public String showServiceMenu(){
		
		String menu="";
		
		return menu;
		
	}
	
	public String useService(int employeeId, String service, boolean publicity){
		
		String message="";
		
		return message;
		
	}
	
	public String showEmployeeAverage(int employeeId){
		
		String message="";
		
		return message;
		
	}
	
	public String showEmployeeProfit(int employeeId, String service){
		
		String message="";
		
		return message;
		
	}
	
	public String showEmployeeReport(int employeeId){
		
		String message="";
		
		return message;
		
	}
	
	//Gets
	public Employee getEmployee(int index){
		
		return employee[index];
		
	}
	
	//Sets
	public void setEmployee(int index, Employee employee){
		
		this.employee[index]=employee;
		
	}
	
}