package in.kanth.streams;

import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Set;

import in.kanth.common.Employee;
import in.kanth.common.EmployeeList;
/**
 * 
 * @author ramakanth.b
 * print the names of employees in uppercase whose age is above 17
 */
public class Stream8_Set {

	public static void main(String[] args) {
		List<Employee> emplist = EmployeeList.getEmployeeList();

	Set<String> empset=	emplist.stream()
		.filter(p -> p.getAge() > 17)
		.map(Employee::getName)
		.map(String::toUpperCase)
		.collect(toSet());
	
	System.out.println(empset);
	}

}
