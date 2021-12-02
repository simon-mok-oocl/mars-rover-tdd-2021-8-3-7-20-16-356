package com.afs.tdd;

public class Rover {
    private int x;
    private int y;
    private char dir;

    public Rover(int x , int y , char d)
    {
        this.x = x;
        this.y = y;
        this.dir = d;
    }

    public void exec(char comm)
    {
        if(comm == 'm')
        {
            move();
        }
        else
        {
            System.out.println("Illegal command");
        }
    }

    private void move()
    {
        if(this.dir == 'N') {this.y++;}
        else if(this.dir == 'E') {this.x++;}

    }

    public String getLocation()
    {
        return String.format("%d %d %c" , this.x , this.y , this.dir);
    }
}
