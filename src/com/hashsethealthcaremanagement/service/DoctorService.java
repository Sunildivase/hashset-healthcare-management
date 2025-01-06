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
        String firstName = scanner.nextLine();

        System.out.println("please enter last name");
        String lastName = scanner.nextLine();

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
        doctor.setFirstName(firstName);
        doctor.setLastName(lastName);
        doctor.setAge(age);
        doctor.setGender(gender);
        doctor.setContactNo(contactNo);
        doctor.setSpeciality(speciality);
        doctor.setExperience(experience);

        if(doctors.contains(doctor)){
            System.out.println("doctor already in system");
        }
        else {
            doctors.add(doctor);
        }
        return doctor;

    }
    public void displayDoctor(){
        for(Object doctor : doctors){
            System.out.println("doctor created: "+doctor);
        }
    }
}
