class Employee implements Cloneable{
	int id;
	String name;
	double salary;
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void display() {
		System.out.println("Id: "+id +"\nName: "+name+"\nSalary: "+salary);
	}
	 public Employee clone() throws  CloneNotSupportedException{
		return (Employee) super.clone();
	}
}
public class Wrapper_Classes4 {
public static void main(String[]args) {
	try {
		Employee emp1=new Employee(101,"Bob",10000);
		Employee emp2=emp1.clone();
		emp1.name="Alice";
		emp1.salary=15000;
		System.out.println("Print First Employee Details: ");
		emp1.display();
		System.out.println("Print Second Employee Details: ");
		emp2.display();
	}
	catch(CloneNotSupportedException e) {
		System.out.println("Clone Not Found!");
	}
}
}
