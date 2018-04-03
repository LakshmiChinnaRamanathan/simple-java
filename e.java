class employee{
 	int id;
	String name,gender;
	double salary;
 	employee(int id,String name,String gender,double salary){
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.salary=salary;
	}
	void display(){
		System.out.println("ID of the employee:   "+id);
		System.out.println("Name of the employee:  "+name);
		System.out.println("GENDER OF THE EMPLOYEE:  "+gender);
		System.out.println("Salary of the employee:"  +salary);
	}
	void raisesal(){
		salary=salary+(salary*5/100);
		
	}
	void update(double salary){
		this.salary=salary;
	}
	
}
class emp{
	public static void main(String args[]){
		employee e1=new employee(101,"uma","female",20000);
		e1.display();
		System.out.println("\n");
		employee e2=new employee(102,"manickkam","male",40000);
		e2.display();
		System.out.println("\n");
		employee e3=new employee(103,"abi","female",10000);
		e3.display();
		System.out.println("\n");
		System.out.println("AFTER RAISED SALARY");
		e1.raisesal();
		e1.display();
		System.out.println("\n");
		e2.raisesal();
		e2.display();
		System.out.println("\n");
		e3.raisesal();
		e3.display();
		System.out.println("\n");
		System.out.println("AFTER UPDATED SALARY");
		e1.update(50000);
		e1.display();
		System.out.println("\n");
		e2.update(60000);
		e2.display();
		System.out.println("\n");
		e3.update(70000);
		e3.display();
		
}
}

