package com.afs.tdd;

public class Rover {
    private int x;
    private int y;
    private char dir;

    public Rover()
    {
        this.x = 0;
        this.y = 0;
        this.dir = 'N';
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
    }

    public String getLocation()
    {
        return String.format("%d %d %c" , this.x , this.y , this.dir);
    }
}
