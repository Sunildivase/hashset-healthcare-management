package com.hashsethealthcaremanagement.service;

import com.hashsethealthcaremanagement.model.Department;

import java.util.HashSet;
import java.util.Scanner;

public class DepartmentService {

    private static HashSet<Department> departments = new HashSet<>();

    private static Scanner scanner = new Scanner(System.in);

    void printDepartment(Department department){
        System.out.println(department);
    }

    public Department createDepartment(){

        System.out.println("please enter id");
        int deptId =Integer.parseInt(scanner.nextLine());

        System.out.println("please enter department name");
        String deptName = scanner.nextLine();

        System.out.println("please enter doctor id");
        int doctorId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter hospital id");
        int hospitalId = Integer.parseInt(scanner.nextLine());

        Department department =new Department();
        department.setDeptId(deptId);
        department.setDeptName(deptName);
        department.setDoctorId(doctorId);
        department.sethospitalId(hospitalId);

        if(departments.contains(department)){
            System.out.println("department is already exist ");
        }
        else {
            departments.add(department);
        }
        return department;
    }

    public void displayDepartment(){
        for(Object department : departments){
            System.out.println("create department "+department);
        }
    }
}
