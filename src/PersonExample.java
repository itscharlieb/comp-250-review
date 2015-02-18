import java.util.ArrayList;
import java.util.List;


/**
 * @author Charlie Bloomfield
 * Feb 17, 2015
 */
public class PersonExample {
	public static void main(String[] args) {
		List<IPerson> people = new ArrayList<IPerson>();
		Student sarah = new Student("sarah", 18, 3.7);
		Student johnny = new Student("johnny", 20, 3.2);
		Singer shakira = new Singer("shakira", 42, true);
		
		/* we can add singers and students to a IPerson list because
		 * both singer and students implement the IPerson interface.
		 */
		people.add(sarah);
		people.add(shakira);
		people.add(johnny);
		
		printPeople(people);
	}
	
	private static void printPeople(List<IPerson> people){
		for(int i = 0; i < people.size(); i++){
			IPerson p = people.get(i);
			System.out.println(p.getName() + " is " + p.getAge() + " years old.");
		}
		
		//more elegant for loop. Same exact this as above.
		for(IPerson p : people){
			System.out.println(p.getName() + " is " + p.getAge() + " years old.");
		}
	}
}

interface IPerson{
	String getName();
	int getAge();
}

class Student implements IPerson{
	String name;
	int age;
	double gpa;
	
	public Student(String name, int age, double gpa){
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
}

class Singer implements IPerson{
	String name;
	int age;
	boolean isFemale;
	
	public Singer(String name, int age, boolean isFemale){
		this.name = name;
		this.age = age;
		this.isFemale = isFemale;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
}
