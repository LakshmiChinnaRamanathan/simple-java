public class employeee
{
	private int id;
	private String name;
	private double salary;
	
	public employeee() {} 
	public employeee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}	
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
}
