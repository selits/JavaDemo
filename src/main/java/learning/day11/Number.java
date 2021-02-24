package learning.day11;

public class Number {

    private String name;
    private int value;
    private boolean isPositive;

    public Number(String name, int value) {
        this.name = name;
        this.value = value;
        setSign(value);
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public boolean isPositive() {
        return isPositive;
    }

    public void setName(String theName) {
        this.name = theName;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private void setSign(int value) {
        isPositive = value > 0;
    }

    public String toString() {
        return "Number: " + value + " " + name + " " + isPositive;
    }

    /*
    Step 1: Create a package named 'day11' and make a class 'Number'.
    Step 2: Declare field/variable as private.
    Step 3: Create a public getter method for private variable.
    Step 4: Create a public setter method for private variable and declare the parameter.
    Step 5: Create another class EncapTest.
    Step 6: Create an object of class Number using the new keyword.
    Step 7: Now call setter method and set value of the variable.
    Step 8: Call getter method to read the value of variable.
    Step 9: Print the output.
    */
}

class EncapTest {
    public static void main(String[] args) {
        Number one = new Number("One", 1);
        Number hundred = new Number("Hundred", 100);
        Number negTwenty = new Number("Negative Twenty", -20);
        System.out.println(one);
        System.out.println(hundred);
        System.out.println(negTwenty);
    }
}