package com.hashsethealthcaremanagement.service;

import com.hashsethealthcaremanagement.model.Billing;

import java.util.HashSet;
import java.util.Scanner;

public class BillingService {

    private static HashSet<Billing>  billings = new HashSet<>();

    private static Scanner scanner = new Scanner(System.in);

    void printBilling(Billing billing){
        System.out.println(billing);
    }

    public Billing createBilling(){

        System.out.println("please enter id");
        int bId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter bill");
        int bill = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter total bill");
        int totalBill = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter person id");
        int personId = Integer.parseInt(scanner.nextLine());

        Billing billing = new Billing();
        billing.setBillId(bId);
        billing.setBill(bill);
        billing.setTotalBill(totalBill);
        billing.setPersonId(personId);

        if(billings.contains(billing)){
            System.out.println("Already bill generated");
        }
        else {
            billings.add(billing);
        }
        return billing;

    }
    public void displayBilling(){
        for(Object billing : billings){
            System.out.println("billing created "+billing);
        }
    }
}
