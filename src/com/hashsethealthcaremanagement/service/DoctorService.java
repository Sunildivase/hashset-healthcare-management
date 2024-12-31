package com.hashsethealthcaremanagement.service;

import com.hashsethealthcaremanagement.model.Doctor;

import java.util.HashSet;
import java.util.Scanner;

public class DoctorService {

    private static HashSet<Doctor> doctors = new HashSet<>();

    private static Scanner scanner = new Scanner(System.in);

    void printDoctor(Doctor doctor){
        System.out.println(doctor);
    }
    public Doctor createDoctor(){

        System.out.println("please enter id");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter first name");
        String fName = scanner.nextLine();

        System.out.println("please enter last name");
        String lName = scanner.nextLine();

        System.out.println("please enter age");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter gender");
        String gender = scanner.nextLine();

        System.out.println("please enter contact number ");
        String contactNo = scanner.nextLine();

        System.out.println("please enter speciality");
        String speciality = scanner.nextLine();

        System.out.println("please enter experience");
        int experience = Integer.parseInt(scanner.nextLine());

        Doctor doctor = new Doctor();
        doctor.setDoctorId(doctorId);
        doctor.setfName(fName);
        doctor.setlName(lName);
        doctor.setAge(age);
        doctor.setGender(gender);
        doctor.setContactNo(contactNo);
        doctor.setSpeciality(speciality);
        doctor.setExperience(experience);

        doctors.add(doctor);
        return doctor;

    }
    public void displayDoctor(){
        for(Object doctor : doctors){
            System.out.println("doctor created: "+doctor);
        }
    }
}
