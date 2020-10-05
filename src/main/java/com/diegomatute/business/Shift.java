/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diegomatute.business;

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
     * @param Month1 Date calls new on MyDate(Month1)
     * @param Day1 Date calls new on MyDate(Day1)
     * @param Year1 Date calls new on MyDate(Year1)
     * @param HW HoursWorked is set to HW
    */
    
    public Shift(int Month1, int Day1, int Year1, double HW)
    {
        Date = new MyDate(Month1, Day1, Year1);
        HoursWorked = HW;
    }

    /**
     * This method gets and returns Month.
     * 
     * @return Month
    */
    public MyDate GetDate()
    {
        return Date;
    }
    
    public double GetHoursWorked()
    {
        return HoursWorked;
    }
    
    /**
     * This method sets Month, Day, and Year to
     * Shift class member variables.
     * 
     * @param Month1 Month is set to Month1.
     * @param Day1 Day is set to Day1.
     * @param Year1 Year is set to Year1.
    */
    public void SetDate(int Month1, int Day1, int Year1)
    {
        Date.SetMonth(Month1);
        Date.SetDay(Day1);
        Date.SetYear(Year1);
        
    }

    /**
     * This method sets HoursWorked to HW
     * 
     * @param HW HoursWorked is set to HW
     */
    public void SetHoursWorked(double HW)
    {
        HoursWorked = HW;
    }
    
    /**
     * This method reads the contents of all member variables 
     * from the given instance of FileReader as JSON.
     * 
     * @param fr An open file.
    */
    public void readJSON(FileReader fr)
    {
        String jsonString = ("shift.json");
               
    }
    
    /**
     * This method writes the member variables in JSON format
     * too the given PrintStream.
     * 
     * @param ps A new output file.
    */
    public void writeJSON(PrintStream ps)
    {
        String jsonString = "{\"date\":\" \", \"month\": 9, \"day\": 2, \"year\": 2020}";
       
    }
    
    /**
     * This method should return a String with descriptive text.
     * 
     * @return String y
    */
    @Override
    public String toString()
    {
        String y = "Descriptive Text"; 
        return y;
    }
    
}
