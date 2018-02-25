package com.pesanteresults.powercruiseusa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by joepesante on 2/24/18.
 */

public class Register {

    String firstName;
    String lastName;
    String emailAddress;
    String phoneNumber;
    public static List<Register> registrantList = new ArrayList<Register>();

    public Register(String firstName, String lastName, String emailAddress, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        //this.registrantList = registrantList;
        registrantList.add(this);
    }

    public static void addRegistrant() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            Register register = new Register(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
            System.out.println(registrantList.toString());
        }


    }

}
