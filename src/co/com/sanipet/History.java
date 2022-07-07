package co.com.sanipet;
import co.com.sanipet.Patient.Patient;

import java.util.ArrayList;
import java.util.Date;   // Import the Date class
import java.util.List;
import java.util.Scanner;  // Import the Scanner class

public class History {
    protected  int PatientNumber;
    protected  String Name; // Can include one or more names
    protected  String Owner;
    protected  String Age; // Can include 1 or both surnames
    protected  String MRDiagnosis; // Most Recent Diagnosis
    protected  boolean isVaccinated;
    protected Date deparasitationDate;
    protected  Date MRMedicalAppointment; // Date of the most recent Medical Appointment
    protected  Date MRSurgeryAppointment; // Date of the most recent Surgery Appointment
    protected  Date MRAestheticAppointment; // Date of the most recent Aesthetical Appointment

    List<Object> Registry = new ArrayList<Object>;

    // Constructor
    public void beginHistory( Patient PatientToRegister){
        this.PatientNumber = PatientToRegister.getPetAttributes().get(1).hashCode();
        this.Name = PatientToRegister.getPetAttributes().get(2).toString();
        this.Breed = PatientToRegister.getPetAttributes().get(3).toString();
        this.Owner = PatientToRegister.getPetAttributes().get(4).toString();
        this.Age = PatientToRegister.getPetAttributes().get(5).toString()
        this.MRDiagnosis = MRDiagnosis;
        this.MRMedicalAppointment = MRMedicalAppointment;
        this.MRSurgeryAppointment = MRSurgeryAppointment;
        this.MRAestheticAppointment = MRAestheticAppointment;
    }

    public void openRegistry(Patient PatientToRegister) {
        this.myPatient = PatientToRegister;
    }





    Patient myPatient = new Patient(PatientNumber, ) {
    };

    private String[] Registry; //Keeps the whole history of the patient

}
