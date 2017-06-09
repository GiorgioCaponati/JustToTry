package com.company.Users;

import java.util.Random;

/**
 * Created by Giorgio on 09/06/2017.
 */
public class Admin extends User{
    public Admin(String firstName, String secondName, int age) {
        this.firstName=firstName;
        this.secondName=secondName;
        this.age=age;
        int random = new Random(10000).nextInt(19999)+1;
        identifierNumber = random;
        role = "Admin";
    }
}
