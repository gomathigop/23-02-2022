package com.encapsulation;
public class Employee {
	//variables
	int id;
	String name;
	double salary;
	static String orgName;
	//constructors
	public Employee()
	{
		id=6567;
		name="Kavi";
		salary=50000.68;
	}
	//blocks
	static
	{
		orgName="xxx";
	}
	//methods
	public void getEmployeeInfo()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(orgName);
	}
	static
	{
		orgName="xxx";
		
	}
	public static void main(String[] args) {
		{
			Employee employee=new Employee();
			employee.getEmployeeInfo();
		}
	}
		
		
		

	

}

