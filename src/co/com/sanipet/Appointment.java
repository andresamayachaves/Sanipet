package co.com.sanipet;

/*
 * Class that represent a patient.
 */
public class Appointment {
    // Attributes
    protected String type;
    protected String petName;
    protected String petOwner;
    protected boolean petIsVaccinated;
    protected boolean petIsDeparasited;
    protected String status;

    //Constructor
    public Appointment(String type, String petName, String petOwner, boolean petIsVaccinated, boolean petIsDeparasited, String status) {
        this.type = type;
        this.petName = petName;
        this.petOwner = petOwner;
        this.petIsVaccinated = petIsVaccinated;
        this.petIsDeparasited = petIsDeparasited;
        this.status = "Not started";
    }
}
