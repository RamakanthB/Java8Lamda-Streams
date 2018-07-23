package in.kanth.streams;

import java.util.List;

import in.kanth.common.Employee;
import in.kanth.common.EmployeeList;


/**
 * 
 * @author ramakanth.b
 * Sum of all ages
 */
public class Stream4_GeneralReduce {

	public static void main(String[] args) {
		
		List<Employee> personlist = EmployeeList.getEmployeeList();
		int total=0;
		for (Employee person : personlist) {
			total=total+person.getAge();
		}
		System.out.println("Total age is "+total);
		
		System.out.println("***************");
		
		total=personlist.stream()
				.map(Employee::getAge)
				.reduce(0,(accumuated, age) -> accumuated + age);//identity, accumulator
		System.out.println("Total in stream is "+total);
		
		total=personlist.stream().map(Employee::getAge)
				.reduce(0, Integer::sum);
		System.out.println("Total in stream 2 is "+total);
		
	}

}
