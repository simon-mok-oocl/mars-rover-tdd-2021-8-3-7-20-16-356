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

    public String batchExecute(String comm)
    {
        for(int i = 0 ; i < comm.length() ; i++)
            this.exec(comm.charAt(i));
        return this.getLocation();
    }

    public void exec(char comm)
    {
        if(comm == 'm')
        {
            move();
        }
        else if(comm == 'r' || comm == 'l')
            turn(comm);
        else
        {
            System.out.println("Illegal command");
        }
    }

    private void turn(char comm)
    {
        if(this.dir == 'N' && comm == 'r') {this.dir = 'E';}
        else if(this.dir == 'E' && comm == 'r') {this.dir = 'S';}
        else if(this.dir == 'S' && comm == 'r') {this.dir = 'W';}
        else if(this.dir == 'W' && comm == 'r') {this.dir = 'N';}
        else if(this.dir == 'N' && comm == 'l') {this.dir = 'W';}
        else if(this.dir == 'E' && comm == 'l') {this.dir = 'N';}
        else if(this.dir == 'S' && comm == 'l') {this.dir = 'E';}
        else if(this.dir == 'W' && comm == 'l') {this.dir = 'S';}
    }

    private void move()
    {
        if(this.dir == 'N') {this.y++;}
        else if(this.dir == 'E') {this.x++;}
        else if(this.dir == 'S') {this.y--;}
        else if(this.dir == 'W') {this.x--;}

    }

    public String getLocation()
    {
        return String.format("%d %d %c" , this.x , this.y , this.dir);
    }
}
