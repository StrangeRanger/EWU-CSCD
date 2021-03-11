// *****************************************************************************
//
// Name: Hunter Thompson
//
// Sections 11.5–11.14
//
// 1. 11.2 (THE PERSON, STUDENT, EMPLOYEE, FACULTY, AND STAFF CLASSES) Design a
//    class named Person and its two subclasses named Student and Employee. Make
//    Faculty and Staff subclasses of Employee. A person has a name, address,
//    phone number, and e-mail address. A student has a class status (freshman,
//    sophomore, junior, or senior). Define the status as a constant. An employee
//    has an office, salary, and date hired. Use the MyDate class defined
//    java.util.calendar to create an object for date hired. A faculty member
//    has office hours and a rank. A staff member has a title. Override the
//    toString method in each class to display the class name and the person’s
//    name.
// 2. Output will look something like this:
//    Person: Peter
//    Student: Susan
//    Employee: Eva
//    Faculty: Frank
//    Staff: Shane
// 4. Draw the UML diagram for the classes and implement them. Write a test
//    program that creates a Person, Student, Employee, Faculty, and Staff, and
//    invokes their toString() methods.
// 5. Submit a 1 page descriptive document of the attached video (send as a .pdf).
//    Submit all as a zip file named:  CSCD211Lab6_Firstname_lastname.zip.
//
// *****************************************************************************

// MyDate doesn't exist in java.util.calendar
import java.util.Date;

public class CSCD211Lab6 {

    public static void main(String[] args) {
        Person person = new Person("Peter");
        Person.Student student = new Person.Student("Susan");
        Person.Employee employee = new Person.Employee("Eva");
        Person.Faculty faculty = new Person.Faculty("Frank");
        Person.Staff staff = new Person.Staff("Shane");

        // Everything for Person Peter
        person.address = "Peter's address";
        person.phoneNumber = "111-1111";
        person.email = "perter@email.com";

        // Everything for Student Susan
        student.address = "Susan's address";
        student.phoneNumber = "222-2222";
        student.email = "susan@email.com";

        // Everything for Employee Eva
        employee.address = "Eva's address";
        employee.phoneNumber = "333-3333";
        employee.email = "eva@email.com";
        employee.salary = 20.01;
        employee.office = "West wing room 120";

        // Everything for Faculty Frank
        faculty.address = "Frank's address";
        faculty.phoneNumber = "444-4444";
        faculty.email = "frank@email.com";
        faculty.salary = 20.02;
        faculty.office = "West wing room 200";
        faculty.officeHours = "1:00 PM - 2:00 PM";
        faculty.rank = "Unknown";

        // Everything for Staff Shane
        staff.address = "Shane's address";
        staff.phoneNumber = "555-5555";
        staff.email = "shane@email.com";
        staff.salary = 20.03;
        staff.office = "North wing room 1";
        staff.title = "Unknown 2";

        // Output
        System.out.println(person.toString());
        System.out.println("Student: " + student.getName());
        System.out.println("Employee: " + employee.getName());
        System.out.println("Faculty: " + faculty.getName());
        System.out.println("Staff: " + staff.getName());
    }
}

/**
 * Person class
 */
class Person {

    // A person has a name, address, phone number, and e-mail address
    protected String name, address, phoneNumber, email;

    /** Default constructor */
    public Person() {} // Unused and is therefore redundant

    /** Constructor */
    Person(String providedName) {
        this.name = providedName;
    }

    /** Get person's name */
    public String getName() {
        return name;
    }

    /** Override toString to output Person's name */
    @Override
    public String toString() {
        return "Person: " + name;
    }

    /** Student class status */
    public static class Student extends Person {

        // I'm not sure what I am supposed to do with these variables exactly
        public static final int FRESHMEN = 1;
        public static final int SOPHOMORE = 2;
        public static final int JUNIOR = 3;
        public static final int SENIOR = 4;

        // Refer to super class constructor
        public Student(String providedName) {
            super(providedName);
        }
    }

    public static class Employee extends Person {

        // I'm not sure what I am supposed to do with this object
        Date dateHired = new Date();
        public double salary;
        public String office;

        // Refer to super class constructor
        public Employee(String providedName) {
            super(providedName);
        }
    }

    public static class Faculty extends Employee {

        public String officeHours;
        public String rank;

        // Refer to super class constructor
        public Faculty(String providedName) {
            super(providedName);
        }
    }

    static class Staff extends Employee {

        public String title;

        // Refer to super class constructor
        public Staff(String providedName) {
            super(providedName);
        }
    }
}
