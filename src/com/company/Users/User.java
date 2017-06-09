package com.company.Users;

import java.util.List;
import java.util.Random;

/**
 * Created by Giorgio on 09/06/2017.
 */
public abstract class  User {
    String firstName;
    String secondName;
    int age;
    int identifierNumber;
    //SimpleUser da 1 a 10000 Admin da 10001 a 20000 Bookseller 20001 a 30000
    String role;
    //getter and setter


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdentifierNumber() {
        return identifierNumber;
    }

    public void setIdentifierNumber(int identifierNumber) {
        this.identifierNumber = identifierNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
