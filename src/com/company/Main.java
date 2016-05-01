package com.company;

public class Main {

    public static void main(String[] args) {
        StringUtilities stringUtilities = new StringUtilities("Microsoft");
        int matches = stringUtilities.Replace("ic", "MSFT");

        System.out.println("Matches: " + matches);
        System.out.println("Matches: " + stringUtilities.getSubject());
    }
}
