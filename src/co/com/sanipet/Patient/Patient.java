package co.com.sanipet.Patient;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * Class that represent a patient.
 */
public class Patient {
    // Attributes
    protected int petNumber;
    protected String name;
    protected String breed;
    protected Owner owner;
    protected int age; // in years
    protected boolean isVaccinated;
    protected Date deparasitationDate;

    // Constructor
    public Patient(int petNumber, String name, String breed, int Age, Owner owner, boolean isVaccinated, Date deparasitationDate) {
        this.petNumber = petNumber; // Attribute 1
        this.name = name; // Attribute 2
        this.breed = breed; // Attribute 3
        this.owner = owner; // Attribute 4
        this.age = age; // Attribute 5
        this.isVaccinated = isVaccinated; // Attribute 6
        this.deparasitationDate = deparasitationDate; // Attribute 7
    }

    /*
     * Assign a number to the patient.
     * @param petNumber_in. petNumber to be assigned.
     */
    protected void setNumber(int petNumber_in){
        petNumber = petNumber_in;
    }

    protected void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    /*
     * Obtain a list of every attribute of the patient
     * @return PettAtt. Pet Attributes
     */
    public List<Object> getPetAttributes() {
        List<Object> PetAtt = new ArrayList <Object>();
        PetAtt.add(this.petNumber);
        PetAtt.add(this.name);
        PetAtt.add(this.breed);
        PetAtt.add(this.isVaccinated);
        PetAtt.add(this.deparasitationDate);

        return PetAtt;
    }

}