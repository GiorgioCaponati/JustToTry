package com.company.Users;

import java.util.Random;

/**
 * Created by Giorgio on 09/06/2017.
 */
public class SimpleUser extends User {

    public SimpleUser(String firstName, String secondName, int age) {
        this.firstName=firstName;
        this.secondName=secondName;
        this.age=age;
        int random = new Random().nextInt(9999)+1;;
        identifierNumber = random;
        role = "simple user";
    }




}
