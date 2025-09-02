package Test;
import java.util.*;

class Employee{
	String name ;
	int age;
	double salary;
	public Employee(String name,int salary,int age) {
		this.name=name;
		this.salary=salary;
		this.age=age;
	}
	public String toString() {
		return "Name: " + name + "Salary: $" + salary + "Age :" + age;
	}
}

public class EmployeeRecordSorter {

	public static void main(String[] args) {
		List<employee> employee = new ArrayList<>();
		employee.add(new Employee("Aman",50000,28));
		employee.add(new Employee("Mohan",35000,22));
		employee.add(new Employee("Vipin",80000,25));
		Scanner sc = new Scanner(System.in);
		System.out.println("Sort by: 1. Name  2. Age  3. Salary");
	    System.out.print("Enter your choice (1/2/3): ");
	    int choice = scanner.nextInt();

	    switch (choice) {
	        case 1:
	            Collections.sort(employees, Comparator.comparing(emp -> emp.name));
	            break;
	        case 2:
	            Collections.sort(employees, Comparator.comparingInt(emp -> emp.age)
	            break;
	        case 3:
	                Collections.sort(employees, Comparator.comparingDouble(emp -> emp.salary));
	            break;
	        default:
	            System.out.println("Invalid choice");
	            Collections.sort(employees, Comparator.comparing(emp -> emp.name));
	    }

	    System.out.println("\nSorted List:");
	    for (Employee emp : employees) {
	        System.out.println(emp);
	        }
	}
	

}
