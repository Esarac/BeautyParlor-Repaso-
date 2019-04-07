package model;
import java.util.Scanner;
import model.*;

public class Main{
	
	//Atributes
	private BeautyParlor salon;
	private Scanner s;
	
	public static void main(String[]args){
		
		Main m=new Main();
		
	}
	
	public Main(){
		
		init();
		
	}
	
	public void init(){
		
		Employee e1=new Employee("Roberto Ariza", 1007678665, "Estilista", 2008);
		Employee e2=new Employee("Catalina Morales", 1001857474, "Maquilladora", 2012);
		
		salon=new BeautyParlor(e1, e2);
		
		s=new Scanner(System.in);
		
	}
	
	public void menu(){
		
		boolean run=true;
		
		while(run){
			
			System.out.print(salon.showMenu());
			
			int option=s.nextInt();
			s.nextLine();
			
			switch(option){
				
				case 1:
					
				break;
				
				case 2:
					
				break;
				
				case 3:
					
				break;
				
				case 4:
					
				break;
				
				case 5:
					
					run=false;
					System.out.print("Hasta luego!");
					
				break;
				
				default:
					
					System.out.print("Opcion equivocada. Intentelo de nuevo.");
					
				break;
				
			}
			
		}
		
	}
	
}