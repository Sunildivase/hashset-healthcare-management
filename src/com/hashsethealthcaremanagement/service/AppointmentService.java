package com.hashsethealthcaremanagement.service;

import com.hashsethealthcaremanagement.model.Appointment;

import java.util.HashSet;
import java.util.Scanner;

public class AppointmentService {

    private static HashSet<Appointment> appointments = new HashSet<>();

    private static Scanner scanner = new Scanner(System.in);

    void printAppointment(Appointment appointment){
        System.out.println(appointment);
    }

    public Appointment createAppointment(){

        System.out.println("please enter appointment Id");
        int appointmentId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter person id");
        int personId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter doctor id");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hId");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter department id ");
        int deptId =Integer.parseInt(scanner.nextLine());

        Appointment appointment = new Appointment();
        appointment.setAppointmentId(appointmentId);
        appointment.setPersonId(personId);
        appointment.setDoctorId(doctorId);
        appointment.setHospitalId(hospitalId);
        appointment.setDeptId(deptId);

        if(appointments.contains(appointment)){
            System.out.println("appointment already booked");
        }
        else {
            appointments.add(appointment);
        }
        return appointment;

    }
    public void displayAppointment(){
        for(Object appointment : appointments){
            System.out.println("appointment created "+appointment);
        }
    }

//    public boolean deleteAppointment(int appointmentId){
//        boolean removedAppointment=appointments.remove(appointmentId);
//        return removedAppointment;
//    }

    public void deleteAllAppointment(){
        appointments.clear();
    }
}
