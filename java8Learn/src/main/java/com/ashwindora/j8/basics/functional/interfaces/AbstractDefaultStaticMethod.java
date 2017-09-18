package com.ashwindora.j8.basics.functional.interfaces;

interface Employee{
	
	Employee find(int id);
	
	default boolean isExec(int id) {
		return true;
	}
	
	static String getDefaultCountry() {
		return "USA";
	}
}

public class AbstractDefaultStaticMethod {
	
	public static void main(String[] args) {
		
		class EmployeeImpl implements Employee{

			@Override
			public Employee find(int id) {
				boolean isExecutable = isExec(id);
				return null;
			}
			
		}
		
		Employee.getDefaultCountry();
	}

}
