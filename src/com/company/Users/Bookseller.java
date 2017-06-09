package com.company.Users;

import java.util.Random;

/**
 * Created by Giorgio on 09/06/2017.
 */
public class Bookseller extends User{
    public Bookseller(String firstName, String secondName, int age) {
        this.firstName=firstName;
        this.secondName=secondName;
        this.age=age;
        int random = new Random(20000).nextInt(29999)+1;;
        identifierNumber = random;
        role = "Bookseller";
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getSecondName() {
        return super.getSecondName();
    }

    @Override
    public void setSecondName(String secondName) {
        super.setSecondName(secondName);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getIdentifierNumber() {
        return super.getIdentifierNumber();
    }

    @Override
    public void setIdentifierNumber(int identifierNumber) {
        super.setIdentifierNumber(identifierNumber);
    }

    @Override
    public String getRole() {
        return super.getRole();
    }

    @Override
    public void setRole(String role) {
        super.setRole(role);
    }
}
