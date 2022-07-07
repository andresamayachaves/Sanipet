package co.com.sanipet.Patient;

import java.util.Date;

/*
 * Class that represent a patient.
 */
public abstract class Patient {
    // Attributes
    protected int petNumber;
    protected String name;
    protected String breed;
    protected Owner owner;
    protected boolean isVaccinated;
    protected Date deparasitationDate;

    // Constructor
    public Patient(int petNumber, String name, String breed, Owner owner, boolean isVaccinated, Date deparasitationDate) {
        this.petNumber = petNumber;
        this.name = name;
        this.breed = breed;
        this.owner = owner;
        this.isVaccinated = isVaccinated;
        this.deparasitationDate = deparasitationDate;
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
}