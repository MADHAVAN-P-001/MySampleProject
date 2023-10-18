package com.edubridge.app1.model;

public class SimpleEmployee {
	private int emp_id;
	private String emp_name;
	private double emp_sal;
	
	
	public SimpleEmployee(int emp_id, String emp_name, double emp_sal) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_sal = emp_sal;
	}


	@Override
	public String toString() {
		return "SimpleEmployee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_sal=" + emp_sal + "]";
	}
}
