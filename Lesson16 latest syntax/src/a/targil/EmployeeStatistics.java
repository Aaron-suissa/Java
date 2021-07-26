package a.targil;

import java.util.List;

public class EmployeeStatistics {

	public static double averageSalary(List<Employee> employees) throws RuntimeException {
		double sum = 0;
		int n = 0;
		for (Employee currEmp : employees) {
			if (currEmp != null) {
				sum += currEmp.getSalary();
				n++;
			}
		}
		if (n > 0) {
			double avg = sum / n;
			return avg;
		} else {
			throw new RuntimeException("no average - list is empty");
		}
	}

	public static int getNumberOfEmployees(List<Employee> employees) {
		int n = 0;
		for (Employee currEmp : employees) {
			if (currEmp != null) {
				n++;
			}
		}
		return n;
	}

	public static int getNumberOfEmployees(List<Employee> employees, String departement) {
		int n = 0;
		for (Employee currEmp : employees) {
			if (currEmp != null && currEmp.getDepartement().equals(departement)) {
				n++;
			}
		}
		return n;
	}

}
