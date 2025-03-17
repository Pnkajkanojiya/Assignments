import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;


    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
    }
}

  class EmployeeManagement {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        // Adding employees
        employees.add(new Employee(101, "Alice", 50000));
        employees.add(new Employee(102, "Bob", 60000));
        employees.add(new Employee(103, "Charlie", 55000));

        // Displaying employee details
        System.out.println("Employee Details:");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
