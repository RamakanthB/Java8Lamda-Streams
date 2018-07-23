package in.kanth.streams;

import java.util.List;

import in.kanth.common.Employee;
import in.kanth.common.EmployeeList;

/**
 * 
 * @author ramakanth.b
 *
 */
public class Stream5_Sum {

	public static void main(String[] args) {
		List<Employee> personlist = EmployeeList.getEmployeeList();
		
	int total=personlist.stream()
		.mapToInt(Employee::getAge)
		.sum();
	System.out.println("Total age is "+total);

	}

}
