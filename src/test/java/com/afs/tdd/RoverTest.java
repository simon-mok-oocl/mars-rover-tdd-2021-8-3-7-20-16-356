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

        rover.exec(input);
        String output = rover.getLocation();

        assertEquals(expected , output);
    }

    @Test
    public void should_x_increase_when_l_given_e()
    {
        char input = 'm';
        String expected = "1 0 E";
        Rover rover = new Rover(0 , 0 , 'E');

        rover.exec(input);
        String output = rover.getLocation();

        assertEquals(expected , output);
    }



    @Test
    public void should_y_decrease_when_l_given_s()
    {
        char input = 'm';
        String expected = "0 -1 S";
        Rover rover = new Rover(0 , 0 , 'S');

        rover.exec(input);
        String output = rover.getLocation();

        assertEquals(expected , output);
    }

    @Test
    public void should_x_decrease_when_l_given_w()
    {
        char input = 'm';
        String expected = "-1 0 W";
        Rover rover = new Rover(0 , 0 , 'W');

        rover.exec(input);
        String output = rover.getLocation();

        assertEquals(expected , output);
    }

    @Test
    public void should_turn_to_e_when_r_given_n()
    {
        char input = 'r';
        String expected = "0 0 E";
        Rover rover = new Rover(0 , 0 , 'N');

        rover.exec(input);
        String output = rover.getLocation();

        assertEquals(expected , output);
    }

    @Test
    public void should_turn_to_s_when_r_given_e()
    {
        char input = 'r';
        String expected = "0 0 S";
        Rover rover = new Rover(0 , 0 , 'E');

        rover.exec(input);
        String output = rover.getLocation();

        assertEquals(expected , output);
    }

    @Test
    public void should_turn_to_w_when_r_given_s()
    {
        char input = 'r';
        String expected = "0 0 W";
        Rover rover = new Rover(0 , 0 , 'S');

        rover.exec(input);
        String output = rover.getLocation();

        assertEquals(expected , output);
    }

    @Test
    public void should_turn_to_n_when_r_given_w()
    {
        char input = 'r';
        String expected = "0 0 N";
        Rover rover = new Rover(0 , 0 , 'w');

        rover.exec(input);
        String output = rover.getLocation();

        assertEquals(expected , output);
    }

}
