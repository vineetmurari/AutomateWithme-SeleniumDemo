package modifiers.demo2;

public class Employee {

	public  String Employe_ID ;
	public String  Name ;
	
	public Employee() {
		System.out.println("THIS IS NON PARAM ");
	}
	
	public Employee(String Employe_ID, String Name){
		this.Employe_ID=Employe_ID;
		this.Name=Name;
	}
	
	public void Get_My_emp_details(){
		System.out.println(this.Employe_ID+"  "+this.Name);
	}
	
	public void Dummy(){
		Get_My_emp_details();
	}	
}
