package co.com.sanipet.Patient;

/*
 * Class that represent an owner of a patient.
 */
public class Owner {
    //Attributes
    private int DNI; // Exactly 5 digits
    private String Name; // Can include one or more names
    private String Surname; // Can include 1 or both surnames
    private String Cellphone; // 12 digits
    private int Age; // In years

    //Constructor
    public Owner(int DNI, String name, String surname, String cellphone, int age) {
        boolean correct = false;

        while (!correct) {
            if (Integer.toString(DNI).length() != 5) this.DNI = DNI;
            else {System.out.println("DNI must have 5 digits.");

            this.Name = name;
            this.Surname = surname;

            if (cellphone.length() != 12) this.Cellphone = cellphone;
            else System.out.println("Cellphone number must have 12 digits (including first two digits for country).");

            if (age>=18) this.Age = age;
            else System.out.println("Owner must be older than 18 years.");
            correct = true;
            }
        }


    }

}
