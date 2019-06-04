package main;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PreferencesTest {

    private Preferences prefTest = new Preferences();

    @Before
    public void setUp() throws Exception {
        prefTest.setUsername("ezaz");
        prefTest.setPassword("azez");
    }

    @Test
    public void mid() throws Exception {
        assertEquals("ezaz", prefTest.getUsername());
        assertEquals("azez", prefTest.getPassword());
    }

    @Test
    public void mid2() throws Exception {
        assertEquals("kutya", prefTest.getUsername());
        assertEquals("macska", prefTest.getPassword());
    }

    @Test
    public void mid3() throws Exception {
        assertEquals(null, prefTest.getUsername());
        assertEquals(null, prefTest.getPassword());
    }
}