/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diegomatute.business;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import java.io.FileReader;
import java.io.PrintStream;

/**
 * Contains TimeSheet class code. This class holds TimeSheet 
 * member variables and methods.
 * 
 * @author diegomatute
 * @since 10/28/20
 * 
 */
public class TimeSheet 
{
    //Attributes that maps class variables to JSON variables
    @SerializedName ("worker")
    private Worker Worker;
    
    //Attributes that maps class variables to JSON variables
    @SerializedName ("shifts")
    private Shift[] Shifts;
    //private int MAX_SIZE = 10;
    
    /**
     * This method sets the values of each member variable to
     * a default value.
    */
    public TimeSheet()
    {
        Worker = new Worker();
        Shifts = new Shift[10];
    }
    
    /**
     * This method sets the worker member variable.
     * 
     * @param w Worker is set to w.
     */
    public void setWorker(Worker w)
    {
        Worker = w;
    }
    
    /**
     * This method sets the worker member variable.
     * 
     * @return Worker.
     */
    public Worker getWorker()
    {
        return Worker;
    }
    
    /**
     * This method searched the array for the shift
     * that has the most hours worked and returns
     * it from the method.
     * 
     * @return The max hours in a shift.
     */
    public Shift getMaxShift()
    {
        Shift max = Shifts[0];
        
        for(int i = 1; i < Shifts.length; i++)
        {
            if(Shifts[i].GetHoursWorked()> max.GetHoursWorked())
            {
                max = Shifts[i];
            }
        }
    
        return max;
    }
            
    
     /**
     * This method returns or throws the shift at the
     * given index.
     * 
     * @param index Index number for array.
     * @throws ArrayIndexOutOfBoundsException Throws exception.
     * @return The shift at the given index.
     */
    public Shift getAt(int index) throws ArrayIndexOutOfBoundsException
    {
        //If index <0 , then always true 
        if(index < 0 || index >= Shifts.length)
        {
            ArrayIndexOutOfBoundsException x;
            x = new ArrayIndexOutOfBoundsException();
            
            //"Bad" index will go along with exception
            //x.getAt(index);
            
            throw x;
            
            //throw new ArrayIndexOutOfBoundsException("Index out of bounds ");
        }
        
        
        return Shifts[index];

    }
    
    /**
     * This method writes a report on the given 
     * PrintStream.
     * 
     * @param ps The given PrintStream. 
     */
    public void report(PrintStream ps)
    {
        ps.println("PayRoll Report");
        ps.println("--------------");
        
        //Gets and First name 
        ps.printf("First: %4s\n", Worker.GetFirst());
        
        //Gets and prints Last
        ps.printf("Last: %4s\n", Worker.GetLast());
        
        //Gets and prints Last
        ps.printf("Id: %1d\n", Worker.GetId());
        
        ps.printf("Pay Rate: %4.2f\n", Worker.GetPayRate());
        
        //Empty line 
        ps.println(" ");
        
        //Prints header
        ps.printf("%8s %8s %8s %16s %10s", "Month", "Day", "Year", 
                "Hours Worked", "Pay\n");
        
        //Under header
        ps.printf("%8s %8s %8s %16s %11s", "-----", "---", "----", 
            "------------", "--- \n");
        
        double sumHrs = 0;
        double sumPay = 0;
        
        for(int i = 0; i < Shifts.length; i++)
        {
            int month = Shifts[i].GetDate().GetMonth();
            int day = Shifts[i].GetDate().GetDay();
            int year = Shifts[i].GetDate().GetYear();
            double hoursWorked = Shifts[i].GetHoursWorked();
            double payRate = Worker.GetPayRate();
            double pay = hoursWorked * payRate;
            
            sumHrs += hoursWorked;
            sumPay += pay;
            
            ps.printf("%8d %8d %8d %16.2f %10.2f\n", month, day, year,
                hoursWorked, pay);
            
        }
        
        ps.printf("%8s %8s %8s %16s %12s", "-----", "---", "----", 
            "------------", "-------- \n");
        
        //Prints final line of report.
        ps.printf("%8s %34.2f %10.2f", "Total", sumHrs, sumPay);
        
    }
    
    /**
     * This method writes the member variables in
     * JSON format to the given PrintStream.
     * 
     * @param ps The given PrintStream.
     */
    public void writeJSON(PrintStream ps)
    {
        
        
        GsonBuilder builder = new GsonBuilder();
        //Sets prettyPrinting to true
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        
        String jsonString = gson.toJson(this);
        
        /*
        TimeSheet x = new TimeSheet();
        
        x.setWorker(Worker);
        */
        

        
        //String jsonString = gson.toJson(x);
        
        ps.printf("%s\n", jsonString);
        
        
             
    }
    
    /**
     * This method reads the contents of all member
     * variables from the given instance of 
     * FileReader as JSON.
     * 
     * @param fr The given FileReader. 
     */
    public void readJson(FileReader fr)
    {
        Gson gson = new Gson();
        
        TimeSheet x;

        x = gson.fromJson(fr, TimeSheet.class);
        
        Worker = x.Worker;
        
        Shifts = x.Shifts;
        
        
    }
    /**
     * This method should show descriptive text
     * and data.
     * 
     * @return String s. 
     */
    @Override 
    public String toString()
    {
        String s = new String();
        
        /*
        
        String s1 = Shifts[0].toString();
        String s2 = Shifts[1].toString();
        String s3 = Shifts[2].toString();
        String s4 = Shifts[3].toString();
        */
        
        
        //Worker member variable
        s += Worker.GetFirst() + " " + Worker.GetLast();
        s += '\n';
        s += "$" + String.format("%.1f", Worker.GetPayRate()) + " per hour";
        s += '\n';
        //s += s1 + s2 + s3 + s4;
        
        
        
       
        //Loops through array
        for(int i = 0; i < Shifts.length; i++)
        {
            //String x = new String();
            
            //Member variable Shifts
            //s+= Shifts[i].toString();
            s+= Shifts[i];
            s += '\n';
        }
        //String x = Shifts + " " + Worker + "\n"; 

        
        return s;
    }
    
}
