package com.hashsethealthcaremanagement;

import com.hashsethealthcaremanagement.service.DoctorService;
import com.hashsethealthcaremanagement.service.HospitalService;
import com.hashsethealthcaremanagement.service.PersonService;

import java.util.Scanner;

public class HashsetHealthcareDemo {

   private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option = 0;
        do {
            System.out.println("---------healthcare management system -----------");
            System.out.println("1. create person");
            System.out.println("2. create doctor");
            System.out.println("3. create hospital");
            System.out.println("4. create department");
            System.out.println("5. create appointment");
            System.out.println("6. create prescription");
            System.out.println("7. create billing");
            System.out.println("please enter the option");
            option = Integer.parseInt(scanner.nextLine());

            switch(option) {
                case 1:
                    PersonService personService = new PersonService();
                    personService.createPerson();
                    personService.displayPerson();
                    System.out.println("person created successfully");
                    break;

                case 2:
                    DoctorService doctorService = new DoctorService();
                    doctorService.createDoctor();
                    doctorService.displayDoctor();
                    System.out.println("doctor created successfully");
                    break;

                case 3:
                    HospitalService hospitalService = new HospitalService();
                    hospitalService.
            }
        }while(option != 0);{
            System.out.println("thank You!!!");
        }

    }
}
