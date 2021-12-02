package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    @Test
    public void should_y_increase_when_l_given_n()
    {
        char input = 'm';
        String expected = "0 1 N";
        Rover rover = new Rover(0 , 0 ,'N');

        rover.exec('m');
        String output = rover.getLocation();

        assertEquals(expected , output);
    }

    @Test
    public void should_x_increase_when_l_given_e()
    {
        char input = 'm';
        String expected = "1 0 E";
        Rover rover = new Rover(0 , 0 , 'E');

        rover.exec('m');
        String output = rover.getLocation();

        assertEquals(expected , output);
    }



    @Test
    public void should_y_decrease_when_l_given_s()
    {
        char input = 'm';
        String expected = "0 -1 S";
        Rover rover = new Rover(0 , 0 , 'S');

        rover.exec('m');
        String output = rover.getLocation();

        assertEquals(expected , output);
    }

    @Test
    public void should_x_decrease_when_l_given_w()
    {
        char input = 'm';
        String expected = "-1 0 W";
        Rover rover = new Rover(0 , 0 , 'W');

        rover.exec('m');
        String output = rover.getLocation();

        assertEquals(expected , output);
    }



}
