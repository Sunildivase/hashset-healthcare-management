package com.hashsethealthcaremanagement.service;

import com.hashsethealthcaremanagement.model.Hospital;

import java.util.HashSet;
import java.util.Scanner;

public class HospitalService {

    private static HashSet<Hospital> hospitals = new HashSet<>();

    private static Scanner scanner = new Scanner(System.in);

    void printHospital(Hospital hospital){
        System.out.println(hospital);
    }

    public Hospital createHospital(){

        System.out.println("please enter id");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospital name");
        String hospitalName = scanner.nextLine();

        System.out.println("please enter hospital name");
        String hospitalAddress = scanner.nextLine();

        System.out.println("please enter contact no");
        String contactNo = scanner.nextLine();

        System.out.println("please enter email id");
        String emailId = scanner.nextLine();

        Hospital hospital = new Hospital();
        hospital.setHospitalId(hospitalId);
        hospital.setHospitalName(hospitalName);
        hospital.setHospitalAddress(hospitalAddress);
        hospital.setContactNo(contactNo);
        hospital.setEmailId(emailId);

        if(hospitals.contains(hospital)){
            System.out.println("already hospital in system");
        }
        else {
            hospitals.add(hospital);
        }
        return hospital;

    }
    public void displayHospital(){
        for(Object hospital : hospitals){
            System.out.println("hospial created "+ hospital);
        }
    }
}
