
/**
 * @author Charlie Bloomfield
 * Feb 17, 2015
 */
public class PersonExample {

}

interface IPerson{
	String getName();
	int getAge();
}


class Student implements IPerson{
	String name;
	int age, gpa;
	
	public Student(String name, int age, int gpa){
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
