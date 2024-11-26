package de.mblip.webprojekt_demo.model;

public class Person {
    private String firstName;
    private String lastName;
    private boolean ofLegalAge;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public boolean isOfLegalAge() {
        return ofLegalAge;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setOfLegalAge(boolean ofLegalAge) {
        this.ofLegalAge = ofLegalAge;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ofLegalAge=" + ofLegalAge +
                '}';
    }
}
