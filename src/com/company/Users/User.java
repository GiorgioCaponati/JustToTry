package com.company.Users;

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
}
