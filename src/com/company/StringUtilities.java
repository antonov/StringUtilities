package com.company;

/**
 * Class utility to replace a content in the text.
 */
public class StringUtilities {
    /** Text to where the content will be replaced */
    private String Subject;

    /** The number of matches */
    private int Matches;


    /** Specify the subject on constructor of the class */
    public StringUtilities(String subject) {
        Subject = subject;
        Matches = 0;
    }

    /** Replace the text in the string */
    public int Replace(String search, String replace) {
        Matches = 0;
        int i = 0;
        while (i + search.length() <= Subject.length()) {
            if (search.equals(Subject.substring(i, i + search.length()))) {
                StringBuilder replacedString = new StringBuilder().append(Subject.substring(0, i));
                Subject = replacedString.append(replace).append(Subject.substring(i + search.length())).toString();
                i += replace.length();
                Matches++;
            }
            i++;
        }
        return Matches;
    }

    /** Get replaced text */
    public String getSubject() {
        return Subject;
    }

    /** Set text to replace */
    public void setSubject(String subject) {
        Subject = subject;
    }

    /** Return the number if matches */
    public int getMatches() {
        return Matches;
    }
}
