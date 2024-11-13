//Given a list of employees, use the Stream API to group employees by their department.
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
    String name;
    String department;

    Employee(String name,String department){
        this.name=name;
        this.department=department;
    }

    public String getDepartment(){
        return department;
    }

    @Override
    public String toString(){
        return name+" ("+department+")";
    }
}


public class MainEmployee {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee("John", "Sales"));
        employees.add(new Employee("Alice", "Sales"));
        employees.add(new Employee("Bob", "Marketing"));
        employees.add(new Employee("Charlie", "Marketing"));
        employees.add(new Employee("David", "Sales"));

        Map<String, List<Employee>> employeesByDepartment = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment));

        employeesByDepartment.forEach((department, empList) -> {
            System.out.println("Department: " + department);
            empList.forEach(System.out::println);
        });
    }
}
