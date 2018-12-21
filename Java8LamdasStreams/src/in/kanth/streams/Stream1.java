package in.kanth.streams;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;

import in.kanth.common.Employee;
import in.kanth.common.EmployeeList;
import in.kanth.common.Gender;
/**
 * 
 * @author ramakanth.b
 *get the names of all female emp whose age is above 18 and
 * convert name to upercase
 */
public class Stream1 {

	public static void main(String[] args) {

		List<Employee> emplist = EmployeeList.getEmployeeList();

		List<String> names = new ArrayList<>();

		for (Employee person : emplist) {
			if (person.getGender().equals(Gender.FEMALE) && person.getAge() > 18) {
				names.add(person.getName().toUpperCase());
			}
		}

		System.out.println(names);
		

		System.out.println(emplist.stream()
				.filter(p -> p.getGender() == Gender.FEMALE)
				.filter(p -> p.getAge() > 18)
				.map(p -> p.getName().toUpperCase()).collect(toList()));

	}

}
