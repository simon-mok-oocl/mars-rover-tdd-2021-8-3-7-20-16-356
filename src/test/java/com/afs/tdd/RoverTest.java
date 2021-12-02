package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    @Test
    public void should_Y_increase_when_l_given_n()
    {
        char input = 'm';
        String expected = "0 1 N";
        Rover rover = new Rover();

        rover.exec('m');
        String output = rover.getLocation();

        assertEquals(expected , output);
    }
}
