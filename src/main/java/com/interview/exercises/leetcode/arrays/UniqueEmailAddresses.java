package com.interview.exercises.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

    public int numUniqueEmails(String[] emails) {
        Set<String> parsedEmail = new HashSet<>();

        for (String email: emails) {
            String[] split = email.split("@");
            String localName = split[0].replace(".", "");
            int indexOfPlus = localName.indexOf("+");
            localName = localName.substring(0, indexOfPlus == -1 ? localName.length() : indexOfPlus);

            parsedEmail.add(localName + "@" + split[1]);
        }

        return parsedEmail.size();
    }

}
