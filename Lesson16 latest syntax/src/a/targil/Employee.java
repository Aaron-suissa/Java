package a.targil;

public class Employee {

	private String first;
	private String last;
	private double salary;
	private String departement;

	public Employee() {
	}

	public Employee(String first, String last, double salary, String departement) {
		super();
		this.first = first;
		this.last = last;
		this.salary = salary;
		this.departement = departement;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String department) {
		this.departement = department;
	}

	@Override
	public String toString() {
		return "Employee [first=" + first + ", last=" + last + ", salary=" + salary + ", departement=" + departement
				+ "]";
	}

}
