package in.kanth.common;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author ramakanth.b
 *
 */
public class EmployeeList {
	public static List<Employee> getEmployeeList() {

		return Arrays.asList(new Employee("Tommy", Gender.FEMALE, 20), 
				new Employee("Tommy", Gender.FEMALE, 22),
				new Employee("Deepak", Gender.MALE, 20), 
				new Employee("Anusha", Gender.FEMALE, 32),
				new Employee("Amit", Gender.MALE, 32),
				new Employee("Vikram", Gender.MALE, 2),
				new Employee("Vikram", Gender.MALE, 72), 
				new Employee("Darshan", Gender.FEMALE, 12));
	}
}
