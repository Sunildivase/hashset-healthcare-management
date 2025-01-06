package com.hashsethealthcaremanagement.model;

import java.util.Objects;

public class Person {

    private int personId;
    private String type;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String mobileNo;
    private String alternateMobile;
    private String address;

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", type='" + type + '\'' +
                ", fName='" + firstName + '\'' +
                ", lName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", alternateMobile='" + alternateMobile + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAlternateMobile() {
        return alternateMobile;
    }

    public void setAlternateMobile(String alternateMobile) {
        this.alternateMobile = alternateMobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getPersonId() == person.getPersonId() && getAge() == person.getAge() && Objects.equals(getType(), person.getType()) && Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(), person.getLastName()) && Objects.equals(getGender(), person.getGender()) && Objects.equals(getMobileNo(), person.getMobileNo()) && Objects.equals(getAlternateMobile(), person.getAlternateMobile()) && Objects.equals(getAddress(), person.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPersonId(), getType(), getFirstName(), getLastName(), getAge(), getGender(), getMobileNo(), getAlternateMobile(), getAddress());
    }
}
