public class Employee{
int empId;
String empName;
String email;
String gender;
float salary;
public Employee(int empId,String empName,String gender, String string, float salary) {
	this.empId=empId;
	this.empName=empName;
	this.email=email;
	this.gender=gender;
	this.salary=salary;
}
public String getEmployeeDetails() {
	return "ID: "+empId+" , Name: "+empName+" , Email: "+email+", Gender: "+gender+", Salary: "+salary;
}
public void printEmployeeDetails() {
	System.out.println(getEmployeeDetails());
}
}