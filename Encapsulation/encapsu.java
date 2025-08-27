package Encapsulation;

class Employee {
    private double salary;
    private String name;

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class encapsu {
    public static void main(String[] args) {
        System.out.println("Encapsulation in Java");


        Employee emp = new Employee();
        emp.setName("John Doe");
        emp.setSalary(50000);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());

    }
}
