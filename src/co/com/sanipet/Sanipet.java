package co.com.sanipet;

import co.com.sanipet.Patient.Owner;
import co.com.sanipet.Patient.Patient;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Class that represent teh whole veterinary
 */
public class Sanipet {
    List<Object>  = new ArrayList<Object>();
    public Sanipet() {
    }

    private Owner createOwner(){

    }

    private Patient createPatient(){

        Scanner cp = new Scanner(System.in);
        System.out.println("Enter an option. 1, 2, or 3\n\n1: Create new History.\n2: ShowHistory.\n2: Delete History.");
        int petNumberUser = Integer.parseInt(cp.nextLine());  // Read user input
        String nameUser = cp.nextLine();  // Read user input
        String breedUser = cp.nextLine();  // Read user input
        int AgeUser = Integer.parseInt(cp.nextLine());  // Read user input
        Owner ownerUser = createOwner();
        boolean isVaccinatedUser = Boolean.parseBoolean(cp.nextLine());  // Read user input
        Date deparasitationDateUser = Date(cp.nextLine());  // Read user input

        Patient NewPat = new Patient(petNumberUser, nameUser, breedUser, AgeUser, ownerUser, isVaccinatedUser, deparasitationDateUser);

        return NewPat;

    }

    private void createHistory(Patient newPatient){
        History newHistory = new History();
    }




    /*
    * Method that follows 'History' menu
    */
    private void HistoryMenu() {

        Scanner ScH1 = new Scanner(System.in);
        System.out.println("Enter an option. 1, 2, or 3\n\n1: Create new History.\n2: ShowHistory.\n2: Delete History.");
        int OptH1 = Integer.parseInt(ScH1.nextLine());  // Read user input

        switch (OptH1) {
            case 1:
                NEWPatient = createPatient();
                createHistory(NEWPatient); // TODO
            case 2:
                showHistory(); // TODO
            case 3:
                deleteHistory(); // TODO
        }
    }

    /*
     * Method that follows 'Appointments' menu
     */
    private void AppointmentsMenu() {
        //TODO
    }

    /*
     * Method that follows 'Inventory' menu
     */
    private void InventoryMeni() {
        //TODO
    }


//Main Method
public void main(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter an option. 1, 2, or 3\n\n1: History.\n2: Appointments.\n3: Inventory.");
        int Option = Integer.parseInt(Sc.nextLine());  // Read user input
        switch(Option){
            case 1:
                HistoryMenu();
            case 2:
                AppointmentsMenu();
            case 3:
                InventoryMenu();
        }
    }
}