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
}
