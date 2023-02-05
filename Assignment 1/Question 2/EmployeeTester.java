package Day7;
import java.util.*;
import java.util.stream.Collectors;
public class EmployeeTester {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();
		List<Employee> newEmpList = new ArrayList<Employee>();
		
		empList.add(new Employee(101, "Shubh", 25000f));
		empList.add(new Employee(102, "Manish", 26000f));
		empList.add(new Employee(103, "Mujeeb", 27000f));
		empList.add(new Employee(104, "Bakode", 28000f));
		
		
		newEmpList = empList
							.stream()
							.map(emp -> {
								emp.salary += emp.salary*0.1;
								return emp;
							})
							.collect(Collectors.toList());
		for(Employee emp : newEmpList) {
			System.out.println(emp.salary);
		}


	}

}
