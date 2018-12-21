package in.kanth.streams;

import java.util.List;
import java.util.Map;

import in.kanth.common.Employee;
import in.kanth.common.EmployeeList;
import static java.util.stream.Collectors.*;


/**
 * 
 * @author ramakanth.b
 * convert list of employeees to map so that empnameand age is key 
 * and employee object itslef as value
 */
public class Stream9_Map {

	public static void main(String[] args) {
		List<Employee> emplist = EmployeeList.getEmployeeList();
		
		Map<String,Employee> employeeagemap=emplist.stream()
				                            .collect(toMap(p->p.getName()+""+p.getAge(),p->p));
		
		System.out.println(employeeagemap);

	}

}
