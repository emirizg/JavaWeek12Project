package constructors;

public class Employee {

    public String name, jobTitle;
    public int ID;
    public double salary; // instance variable, belongs to Object

    public static String companyName; // static variable, belongs to Class

    static {
        companyName = "Microsoft"; // this value is same for all the objects of this class
    }

    public Employee() {
        salary = 10000; // when I create an Employee object with defeault constructor, their salary will be 10000 as default
    }

    public Employee(String name, String jobTitle, int ID, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.salary = salary;
    }


}
/*
Task 1:
Employee:
    attribute/fields/variables
name, jobTitle, ID, salary

    add a constructor to initialize all the fields
    add a default constructor with no fields

    toString() method will rint out the fields
 */