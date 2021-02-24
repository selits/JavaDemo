package learning.day08;

import java.util.ArrayList;

public class Employee {
    public String name, address;
    public int year, salary;
    private static ArrayList<Employee> employees = new ArrayList<>();

    public Employee(String name, int year, int salary, String address) {
        this.name = name;
        this.address = address;
        this.year = year;
        this.salary = salary;
        employees.add(this);
    }

    public static void printEmployees() {
        System.out.println("Name\t\t\tYear\t\t\tAddress");
        for(Employee each: employees) {
            System.out.println(each.name + "\t\t\t" + each.year + "\t\t\t" + each.address);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("John", 2021, 50_000, "12 XYZ Road San Diego, CA, 92126");
        Employee e2 = new Employee("Robert", 1994, 120_000, "179 ABC Road San Diego, CA, 92126");
        Employee e3 = new Employee("Samy", 2000, 110_000, "657 Mindera Road San Diego, CA, 92126");

        Employee.printEmployees();
    }
}
