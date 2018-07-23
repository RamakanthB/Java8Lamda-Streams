package in.kanth.streams;

import java.util.List;

import in.kanth.common.Employee;
import in.kanth.common.EmployeeList;


/**
 * 
 * @author ramakanth.b
 *Returns the maximum element of this stream
 * according to the provided Comparator (age)
 */
public class Stream6_Max {

	public static void main(String[] args) {
		List<Employee> emplist = EmployeeList.getEmployeeList();
		
	System.out.println(emplist.stream()
			.max((p1,p2)->p1.getAge()>p2.getAge()?1:-1) ); //comparator

	}

}
