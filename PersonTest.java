package person_test;
import java.util.Collection;
import models.Person;
import java.util.Scanner;
import services.Person_Services;

public class PersonTest {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Person_Services service =new Person_Services();
		int i;
		String n,b;
		int a;
		while(true) {
			System.out.println(" Welcome to the GYM Management");
			System.out.println(" ********* Enter Your Choice");
			System.out.println(" 1. Add  New Person");
			System.out.println(" 2. List all Persons");
			System.out.println(" 3. View Person By Id");
			System.out.println(" 4.  Delete Person By Id");
			System.out.println(" 5.  Update Person By Id");
			System.out.println("6.  Exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1: //adding a person
				System.out.println(" Enter the Person Id, Name, Branch and Age");
			         i=sc.nextInt();
			         n=sc.next();
			         b=sc.next();
			         a=sc.nextInt();
			          Person p=new Person(i,n,b,a);
			          service.addPerson(p);
			          System.out.println(" person addded Successfully !!");
			          break;
			case 2: // List All Persons
				    Collection<Person> allPerson=service.getAllPersons();
				    allPerson.forEach(Persons -> System.out.println(Persons));
				    System.out.println(" Here is  the List of All Person");
				    break;
				    
			case 3:  // View person By id
				   System.out.println(" Enter the id to view the Person");
				   i=sc.nextInt();
				   try {
					   Person Persons=service.getPersonById(i);
					   System.out.println(Persons);
				   }
				   catch(Exception e) {
					   System.err.println("Please enter the valid Person Id");
				   }
			         break;
			case 4:   // delete Person By Id
				System.out.println("Enter the id to Delete the Person");
				i=sc.nextInt();
				try {
					service.deletePersonById(i);
					System.out.println(" Person delete Successfully!!");
				}
				catch(Exception e) {
					   System.err.println("Please enter the valid Person Id");
				   }
				break;
				
			case 5: //  Update person By id
				System.out.println("Enter the Person id to Update Details");
				i=sc.nextInt();
				try {
					
					Person Person= service.getPersonById(i);
					System.out.println(" The existing Details are ");
					System.out.println(Person);
					System.out.println(" Enter New Name, Branch and Age");
					n=sc.next();
					b=sc.next();
					a=sc.nextInt();
					Person.setName(n);
					Person.setBranch(b);
					Person.setAge(a);
					Person updated=service.updatePersonById(Person);
					System.out.println(" Updated person details are ");
					System.out.println(updated);
				}
				catch(Exception e) {
					System.err.println("Plz enter the Valid Person id");
				}
					break;
				
					
			case 6: //Exit
				System.out.println(" Thank You for using this Application!!");
				System.out.println(" Application will Closed ");
				System.exit(0);
				break;
				default:
					System.err.println(" Kindly enter valid Choice");
					break;
			}
			
		}
	}

}
