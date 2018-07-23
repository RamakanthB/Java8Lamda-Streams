package in.kanth.streams;

import java.util.List;

import in.kanth.common.Employee;
import in.kanth.common.EmployeeList;
import in.kanth.common.Gender;



/**
 * 
 * @author ramakanth.b
 * print all the males
 */
public class Stream2_Filter {

	public static void main(String[] args) {

		List<Employee> emplist = EmployeeList.getEmployeeList();
		
		for(Employee person:emplist){
			if(person.getGender()==Gender.MALE)
				System.out.println(person);
		}
		
		//with streams
		System.out.println("***************");
		
		emplist.stream()
		.filter(p->p.getGender()==Gender.MALE)
		.forEach(System.out::println);
		
	}

}
