package a.targil;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	private static String[] firstNames = { "yonathann", "aaron", "dan", "zac", "lea", "alison" };
	private static String[] lastNames = { "suissa", "hazout", "sebag" };
	private static String[] departments = { "Legal", "Sales", "Technical" };
	
	public static void main(String[] args) {
		List<Employee>employees=new ArrayList<Employee>();
		for (int i = 0; i < 100; i++) {
			employees.add(getRandomEmployee());
			
		}
	}
	
	public static Employee getRandomEmployee() {

		String first = firstNames[(int) (Math.random() * firstNames.length)];
		String last = lastNames[(int) (Math.random() * lastNames.length)];
		double salary = (int) (Math.random() * 5000);
		String departement = departments[(int) (Math.random() * departments.length)];
		
		Employee e = new Employee(first, last,salary,departement);
		return e;
	}

}
