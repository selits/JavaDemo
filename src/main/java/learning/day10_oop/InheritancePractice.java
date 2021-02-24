package learning.day10_oop;

public class InheritancePractice {
    /**
     * Create a class named 'Member' having the following members:
     * Data members
     * 1 - Name
     * 2 - Age
     * 3 - Phone number
     * 4 - Address
     * 5 - Salary
     * It also has a method named 'printSalary' which prints the salary of the members.
     * Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have
     * data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and
     * salary to an employee and a manager by making an object of both of these classes and print the same.
     */

    public static void main(String[] args) {
        Member ob1 = new Employee("JOhn", 39, 12345, "12 test", 70000, "QA" );
        Member ob2 = new Manager("Jake", 40, 22222, "123 Orange Rd", 90000, "IT");

        ob1.printSalary();
        ob2.printSalary();
    }
}

class Member {
    String name, address;
    int age, phoneNumber, salary;

    public Member(String name, int age, int phoneNumber, String address, int salary) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;

    public Employee(String name, int age, int pN, String address, int salary, String specialization) {
        super(name, age, pN, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Member {
    String department;

    public Manager(String name, int age, int phoneNumber, String address, int salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}