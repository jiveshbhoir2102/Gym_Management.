package models;

public class Person{
	private int id;
	private String Name,Branch;
	private int age;
	public Person() {
		System.out.println(" Person Object Created");
		
	}
	public Person(int id, String Name, String Branch, int age) {
		this.id=id;
		this.Name=Name;
		this.Branch=Branch;
		this.age=age;
		
	}
	public int getId() {
		return id;
		
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return Name;
		
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public String getBranch() {
		return Branch;
		
	}
	public void setBranch(String Branch) {
		this.Branch=Branch;
	}
	public int getAge() {
		return age;
		
	}
	public void setAge(int age) {
		this.age=age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person[id="+ id + ", Name= "+Name + ", Branch= "+Branch+ ", Age="+age+"]";
	}
     
}
