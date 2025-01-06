package com.hashsethealthcaremanagement.service;

import com.hashsethealthcaremanagement.model.Prescription;

import java.util.HashSet;
import java.util.Scanner;

public class PrescriptionService {

    private static HashSet<Prescription> prescriptions = new HashSet<>();

    private static Scanner scanner = new Scanner(System.in);

    void printPrescription(Prescription prescription){
        System.out.println(prescription);
    }

    public Prescription createPrescription(){

        System.out.println("please enter id");
        int prescriptionId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter prescription details ");
        String prescriptionDetails = scanner.nextLine();

        System.out.println("please enter person id");
        int personId = Integer.parseInt(scanner.nextLine());

        Prescription prescription = new Prescription();
        prescription.setPrescriptionId(prescriptionId);
        prescription.setPrescriptionDetails(prescriptionDetails);
        prescription.setPersonId(personId);

        if(prescriptions.contains(prescription)){
            System.out.println("prescription already generated");
        }
        else {
            prescriptions.add(prescription);
        }
        return prescription;
    }
    public void displayPrescription(){
        for (Object prescription : prescriptions){
            System.out.println("prescription created "+prescription);
        }
    }
}
