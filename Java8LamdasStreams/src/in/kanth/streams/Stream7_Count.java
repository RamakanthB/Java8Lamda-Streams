package in.kanth.streams;

import java.util.List;

import in.kanth.common.Employee;
import in.kanth.common.EmployeeList;

/**
 * 
 * @author ramakanth.b
 * How many people are under age 18
 */
public class Stream7_Count {
	public static void main(String[] args) {
		List<Employee> emplist = EmployeeList.getEmployeeList();
		
		int count=0;
	   for(Employee emp: emplist){
		   if(emp.getAge()<18)
			   count++;
	   }
	   System.out.println("Total count of under 18 is "+count);
	   
	   System.out.println("**************************");
		long total=emplist.stream()
				.filter(p->p.getAge()<18)
				.count();
		System.out.println(total);
	}
}
