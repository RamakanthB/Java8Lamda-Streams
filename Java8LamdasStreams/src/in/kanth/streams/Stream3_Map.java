package in.kanth.streams;

import java.util.List;

import in.kanth.common.Employee;
import in.kanth.common.EmployeeList;
import in.kanth.common.Gender;


/**
 * 
 * @author ramakanth.b print males info and name in uppercase
 */
public class Stream3_Map {

	public static void main(String[] args) {
		List<Employee> personlist = EmployeeList.getEmployeeList();

		for (Employee person : personlist) {
			if (person.getGender() == Gender.MALE)
				System.out.println(new Employee(person.getName().toUpperCase(), person.getGender(), person.getAge()));
		}

		System.out.println("***********************");
		personlist.stream()
		.filter(p -> p.getGender() == Gender.MALE)
		.map(p -> new Employee(p.getName().toUpperCase(), p.getGender(), p.getAge()))
		.forEach(System.out::println);
	}

}
