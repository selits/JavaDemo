package learning.day11;

public class Person {
    public String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int age) {
        if(age<=0) System.out.println("Age can't be a negative number");
        else this.age = age;
        return age>=0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class TestingPersonClass {
    public static void main(String[] args) {
        Person p1 = new Person("XYZ");
        boolean isSuccessful = p1.setAge(20);
        p1.setAge(20);
        // p1.age = -20; // Shouldn't allow age to be a negative number

        System.out.println(p1);
        System.out.println(isSuccessful);
        System.out.println(p1.getAge());
    }
}