package learning.day15_exceptions;

public class ExceptionsPractice {
    public static void main(String[] args) {
        System.out.println("1");
        wait2(1);
        System.out.println("2");

        try {
            System.out.println(5/0);
        } catch (ArithmeticException e) {
            System.out.println("Invalid division");
        } finally {
            System.out.println("Gary");
        }

        System.out.println("Hello");

        Person person = new Person();
        // person.setAge(-20);
        person.setName("Gary");
        person.setName("Bagtyyar");
    }

    // Create a static reusable method that allows us to have some delays in our program - wait(int sec) {}
    // Throws - only for checked exceptions (needs handling before running)
    public static void wait(int sec) throws Exception {
        Thread.sleep(sec * 1000);
    }

    public static void wait2(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Person {
    private int age;
    private String name;

    public void setAge(int newAge) {
        if(newAge <= 0) throw new RuntimeException("Age can't be negative");
        this.age = newAge;
    }

    public void setName(String name) {
        try {
            if(name.equals("Gary")) throw new GaryException("Name can't be Gary");
        } catch(GaryException e) {
            System.out.println("No Gary");
        }

        this.name = name;
    }
}