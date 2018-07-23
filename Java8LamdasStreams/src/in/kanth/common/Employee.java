package in.kanth.common;

/**
 * 
 * @author ramakanth.b
 *
 */
public class Employee {

	private final String name;
	private final Gender gender;
	private final int age;

	public Employee(String theName, Gender theGender, int theAge) {
		name = theName;
		gender = theGender;
		age = theAge;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Gender getGender() {
		return gender;
	}

	public String toString() {
		return String.format("%s -- %s -- %d", name, gender, age);
	}

}
