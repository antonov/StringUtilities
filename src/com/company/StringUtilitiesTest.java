package com.company;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Test StringUtilities class.
 */
public class StringUtilitiesTest {
    /** Replace a text and check the number of the matches */
    @Test
    public void replace() throws Exception {
        StringUtilities stringUtilities = new StringUtilities("Microsoft");
        int matches = stringUtilities.Replace("ic", "MSFT");
        assertEquals("There should be one match", 1, matches);
        assertTrue("The replaced text should be MMSFTrosoft", "MMSFTrosoft".equals(stringUtilities.getSubject()));

        stringUtilities.setSubject("Lorem ipsum dolor sit amet ipsum.");
        stringUtilities.Replace("ipsum", "test");
        assertEquals("There should be one match", 2, stringUtilities.getMatches());
        assertTrue("The replaced text should be 'Lorem test dolor sit amet test.'",
                "Lorem test dolor sit amet test.".equals(stringUtilities.getSubject())
        );


    }

}