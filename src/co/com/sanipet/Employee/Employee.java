package co.com.sanipet.Employee;

/*
 * Class that represent a patient.
 */
public class Employee {
    // Attributes
    protected String Name;
    protected String Surname;
    protected String Role; // 'Doctor' or 'Stylists'
    protected String Sex; // 'Male or Female'

    //Constructor
    public Employee(String name, String surname, String role, String sex) {
        Name = name;
        Surname = surname;
        Role = role;
        Sex = sex;
    }
}

