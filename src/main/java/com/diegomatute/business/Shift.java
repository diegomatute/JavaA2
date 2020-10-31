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
 * Contains Shift class code. This class holds Shift member variables
 * and methods.
 * 
 * @author diegomatute
 * @since 9/25/2020
 * 
 */
public class Shift
{
    //Do i need an @Serialized for this? Or not since its in MyDate class
    @SerializedName ("date")
    private MyDate Date;
    
    //Attributes that maps class variables to JSON variables
    @SerializedName("hoursWorked")
    private double HoursWorked; 
    
    /**
     * This method sets the values of each member variable to
     * a default value.
    */
    
    public Shift()
    {
        Date = new MyDate();
        HoursWorked = 5.0;
    }
    
   
    /**
     * This method sets the values of each member variable to
     * the corresponding parameter values.
     * 
     * @param d MyDate calls new on MyDate()
     * @param hw HoursWorked is set to HW
    */
        

    //Constructor with parameters
    public Shift(MyDate d, double hw)
    {
        Date = d;
        HoursWorked = hw;
        /*
        //this.Date = new MyDate();
        //this.Date = d;
        d = Date;
        this.d = new MyDate();
        this.HoursWorked = hw;

        */
        
    }
    
    /*
    public Shift(int Month1, int Day1, int Year1, double HW)
    {
        Date = new MyDate(Month1, Day1, Year1);
        HoursWorked = HW;
    }
    */
    
    
    
    /**
     * This method gets and returns Date.
     * 
     * @return Date
    */
    public MyDate GetDate()
    {
        return Date;
    }
    
    /**
     * This method gets and returns HoursWorked.
     * 
     * @return HoursWorked
    */
    
    public double GetHoursWorked()
    {
        return HoursWorked;
    }
    
    
    /**
     * This method sets Month, Day, and Year to
     * Shift class member variables.
     * 
     * @param d sets the date value.
    */
    
    
    public void SetDate(MyDate d)
    {
        Date = d;
    }
    
    /*
    public void SetDate(int Month1, int Day1, int Year1)
    {
        Date.SetMonth(Month1);
        Date.SetDay(Day1);
        Date.SetYear(Year1);
        
    }
    */
    
    

    /**
     * This method sets HoursWorked to HW
     * 
     * @param hw HoursWorked is set to HW
     */
    public void SetHoursWorked(double hw)
    {
        HoursWorked = hw;
    }
    
    /**
     * This method reads the contents of all member variables 
     * from the given instance of FileReader as JSON.
     * 
     * @param fr An open file.
    */
    public void readJSON(FileReader fr)
    {

        Gson gson = new Gson();
        
        Shift y; 
        y = gson.fromJson(fr, Shift.class);
        
        Date = y.Date;
        HoursWorked = y.HoursWorked;
        
        
    }
    
    /**
     * This method writes the member variables in JSON format
     * too the given PrintStream.
     * 
     * @param ps A new output file.
    */
    public void writeJSON(PrintStream ps)
    {
        GsonBuilder builder = new GsonBuilder();
        //Sets prettyPrinting to true
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        
        Shift x = new Shift();
        
        x.SetDate(Date);
        HoursWorked = x.HoursWorked;

        
        String jsonString = gson.toJson(x);
        ps.printf("%s\n", jsonString);
       
    }
    
    /**
     * This method should return a String with descriptive text.
     * 
     * @return String y
    */
    @Override
    public String toString()
    {
        String y = Date + ", " + HoursWorked + " Hours" + "\n"; 
        return y;
    }
    
}
