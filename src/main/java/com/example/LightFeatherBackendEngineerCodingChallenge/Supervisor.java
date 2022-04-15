package com.example.LightFeatherBackendEngineerCodingChallenge;

public class Supervisor implements java.lang.Comparable<Supervisor>{

    String id;
    String phone;
    String jurisdiction;
    String identificationNumber;
    String firstName;

    String lastName;
    public Supervisor(){
    }

    public Supervisor(String id, String phone, String jurisdiction, String identificationNumber, String firstName, String lastName){
        super();
        this.id = id;
        this.phone = phone;
        this.jurisdiction = jurisdiction;
        this.identificationNumber = identificationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;}

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getJurisdiction() {
        return jurisdiction;
    }
    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }
    public String getidentificationNumber() {
        return identificationNumber;
    }
    public void setidentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String name) {
        this.lastName = name;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String summary) {
        this.firstName = summary;
    }
    @Override
    public String toString() {
        if (!isNumeric(jurisdiction)) return jurisdiction + " - " + lastName + ", " + firstName + "\n";
        else return "";
        //return jurisdiction + " - " + lastName + ", " + firstName + "\n";
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
    @Override
    public int compareTo(Supervisor s){
        return this.getJurisdiction().compareTo(s.getJurisdiction());
    }
}
