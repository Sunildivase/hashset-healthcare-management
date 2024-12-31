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
        int hId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospital name");
        String hName = scanner.nextLine();

        System.out.println("please enter hospital name");
        String hAddress = scanner.nextLine();

        System.out.println("please enter contact no");
        String contactNo = scanner.nextLine();

        System.out.println("please enter email id");
        String emailId = scanner.nextLine();

        Hospital hospital = new Hospital();
        hospital.sethId(hId);
        hospital.sethName(hName);
        hospital.sethAddress(hAddress);
        hospital.setContactNo(contactNo);
        hospital.setEmailId(emailId);

        hospitals.add(hospital);
        return hospital;

    }
    public void displayHospital(){
        for(Object hospital : hospitals){
            System.out.println("hospial created "+ hospital);
        }
    }
}
