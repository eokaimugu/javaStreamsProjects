package streamsJavaDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int empId;
	String empname;
	int salary;

	Employee(int empId, String empname, int salary) {
		this.empId = empId;
		this.empname = empname;
		this.salary = salary;
	}
}

public class StreamMapDemo4 {

	public static void main(String[] args) {

		List<Employee> employeeList = Arrays.asList(new Employee(101, "Samuel", 22000),
				new Employee(102, "Batonga", 260000), new Employee(103, "Sasata", 450000),
				new Employee(104, "Foyoo", 520000), new Employee(105, "Zizinko", 35000));

		List<Integer> empSalList = employeeList.stream().filter(e -> e.salary > 300000).map(e -> e.salary)
				.collect(Collectors.toList());
		System.out.println(empSalList);

	}

}
