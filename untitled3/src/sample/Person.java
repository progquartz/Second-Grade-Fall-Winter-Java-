package sample;

import javafx.beans.property.SimpleStringProperty;

public class Person {
    private SimpleStringProperty firstName;
    private SimpleStringProperty lastName;
    private SimpleStringProperty email;

    public Person(String firstName, String lastName, String email) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.email = new SimpleStringProperty(email);
    }

    public String getFirstName(){
        return firstName.get();
    }

    public void setFirstName(String fName){
        firstName.set(fName);
    }

    public String getLastName(){
        return lastName.get();
    }

    public void setLastName(String fName){
        lastName.set(fName);
    }

    public String getEmail(){
        return email.get();
    }

    public void setEmail(String em){
        email.set(em);
    }

    @Override
    public String toString() {
        return "(" + getFirstName() + " " + getLastName() + " " + getEmail() + ")";
    }
}
