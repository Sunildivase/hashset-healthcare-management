package com.hashsethealthcaremanagement.service;

import com.hashsethealthcaremanagement.model.Person;

import java.util.HashSet;
import java.util.Scanner;

public class PersonService {

    private static HashSet<Person> persons = new HashSet<>();

    private static Scanner scanner =new Scanner(System.in);

    void printPerson(Person person){
        System.out.println(person);
    }

    public Person createPerson(){

        System.out.println("please enter id");
        int personId= Integer.parseInt(scanner.nextLine());

        System.out.println("please enter type");
        String type = scanner.nextLine();

        System.out.println("please enter first name");
        String firstName= scanner.nextLine();

        System.out.println("please enter last name");
        String lastName = scanner.nextLine();

        System.out.println("please enter age");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter gender");
        String gender = scanner.nextLine();

        System.out.println("please enter mobile number");
        String mobileNo = scanner.nextLine();

        System.out.println("please enter alternate mobile");
        String alternateMobile = scanner.nextLine();

        System.out.println("please enter address");
        String address = scanner.nextLine();


        Person person = new Person();
        person.setPersonId(personId);
        person.setType(type);
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        person.setGender(gender);
        person.setMobileNo(mobileNo);
        person.setAlternateMobile(alternateMobile);
        person.setAddress(address);

        if(persons.contains(person)){
            System.out.println("person is already in system");
        }
        else {
            persons.add(person);
        }
        return person;
    }

    public void displayPerson(){
        for(Object person : persons){
            System.out.println("person created :"+ person);
        }
    }
}
