/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diegomatute.business;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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
        ps.println("PayRoll Report");
        ps.println("--------------");
        
        //First name
        
        //Last
        
        //Id
        
        //Pay Rate
        
        //Empty line 
        ps.println(" ");
        
        //Prints header
        ps.printf("%8s %8s %8s %16s %10s", "Month", "Day", "Year", 
                "Hours Worked", "Pay\n");
        
        //Under header
        ps.printf("%8s %8s %8s %16s %11s", "-----", "---", "----", 
            "------------", "--- \n");
        
        
        /*
        
        //Prints First: Rose
    output.printf("First: %4s\n", fName);
    
    //Prints Last: Diaz
    output.printf("Last: %4s\n", lName);
    
    //Prints Id: 1
    output.printf("Id: %1d\n", id);
    
    //Prints Pay Rate: 20.00
    output.printf("Pay Rate: %4.2f\n", payRate);
    
    //Prints empty line
    output.println(" ");
    
    //Prints Header
    output.printf("%8s %8s %8s %16s %10s", "Month", "Day", "Year", 
            "Hours Worked", "Pay\n");
    
    output.printf("%8s %8s %8s %16s %11s", "-----", "---", "----", 
            "------------", "--- \n");
    
    
    //During loop 
   
    //Global variables sumHrs and sumPay
    double sumHrs = 0, sumPay = 0;
    
    //*********************************************************
    // For loop processes one record at a time from the file  
    // as long as integer i is less than or equal to the 
    // number of shifts (shiftCount)+2. Double "pay" is then
    // calculated by multiplying hoursWorked by payRate. 
    // Doubles hoursWorked and totalPay are continuously added
    // The data stored is then displayed on the outfile in 
    // column form.
    // 
    //*********************************************************
    for(int i =0; i <= shiftCount+2; i++)
    {
        
        month = infile.nextInt();
        
        day = infile.nextInt();
        
        year = infile.nextInt();
        
        hoursWorked = infile.nextDouble();

        pay = hoursWorked * payRate; 
         sumHrs += hoursWorked;
         sumPay += pay;
       
        output.printf("%8d %8d %8d %16.2f %10.2f\n", month, day, year,
                hoursWorked, pay);
        i++;
        
        
    }
    
    output.printf("%8s %8s %8s %16s %12s", "-----", "---", "----", 
            "------------", "-------- \n");
    
    //Prints final line of report.
    output.printf("%8s %34.2f %10.2f", "Total", sumHrs, sumPay);
        
        
        
        
        
        */
    }
    
    public void writeJSON(PrintStream ps)
    {
        
        
        GsonBuilder builder = new GsonBuilder();
        //Sets prettyPrinting to true
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        
        TimeSheet x = new TimeSheet();
        
        x.setWorker(Worker);
        
        


        
        String jsonString = gson.toJson(x);
        ps.printf("%s\n", jsonString);
        
        
             
    }
    
    public void readJson(FileReader fr)
    {
        Gson gson = new Gson();
        
        TimeSheet x;
        
        x = gson.fromJson(fr, TimeSheet.class);
        
        Worker = x.Worker;
        
        Shifts = x.Shifts;
        
        
    }
    
    @Override 
    
    public String toString()
    {
        
        String x = Shifts + " " + Worker + "\n"; 
        return x;
    }
    
}
