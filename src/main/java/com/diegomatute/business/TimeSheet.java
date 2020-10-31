/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diegomatute.business;

import java.io.FileReader;
import java.io.PrintStream;

/**
 *
 * @author diegomatute
 */
public class TimeSheet 
{
    private Worker Worker;
    private Shift[] Shifts;
    //private int MAX_SIZE = 10;
    
    public TimeSheet()
    {
        Worker = new Worker();
        Shifts = new Shift[10];
        /*
        Worker = new Worker();
        //Shifts = new Shift[MAX_SIZE];
        Shifts = new Shift[10];
        
        for(int i = 0; i < Shifts.length; i++)
        {
            Shifts[i] = new Shift();
            
            //Sets default data for all array element
            this.Shifts[i].SetHoursWorked(5.0);
            this.Shifts[i].SetDate(Date);
        }   
        */
    }
    
    
    public void setWorker(Worker w)
    {
        Worker = w;
    }
    
    public Worker getWorker()
    {
        return Worker;
    }
    
    public double getMaxShift()
    {
        //Shift max = Shifts[0];
        //Shift x = new Shift();
        
        double max = 0;
        //int maxA = 0;
        for(int i = 0; i < Shifts.length; i++)
        {
            //Shifts[i] = new Shift();
            //this.Shifts[i].GetHoursWorked();
            
            if(Shifts[i].GetHoursWorked() > max)
            {
                max = i;
            }
            /*
            if (Shifts[i] > max)
            {
                max = Shifts[i];
            } 
            */
        }
        return max;
    }
            
    
    
    public Shift getAt(int index) throws ArrayIndexOutOfBoundsException
    {
        for(int i = 0; i < Shifts.length; i++)
        {
            //if(index.equals(Shifts[i]))
            if(Shifts[i] == index)
        {
            ArrayIndexOutOfBoundsException x; 
            x = new ArrayIndexOutOfBoundsException();
            
        }
        }
        
        return Shifts[index];

    }
    
    public void report(PrintStream ps)
    {
        
    }
    
    public void writeJSON(PrintStream ps)
    {
        
    }
    
    public void readJson(FileReader fr)
    {
        
        
    }
    
    @Override 
    
    public String toString()
    {
        String x = Shifts + " " + Worker + "\n"; 
        return x;
    }
    
}
