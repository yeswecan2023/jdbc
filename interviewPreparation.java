import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}


public class interviewPreparation {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "HR"),
                new Employee("Alice", "IT"),
                new Employee("Bob", "IT"),
                new Employee("Eve", "HR")
        );

        Map<String, List<Employee>> grouped = employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.department));

        grouped.forEach((dept, emps)-> {
            System.out.println(dept+" : "+emps.stream().map(e -> e.name).collect(Collectors.joining(", ")));
        });
    }
}
