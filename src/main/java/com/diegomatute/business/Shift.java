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
 *
 * @author diegomatute
 */
public class Shift
{
    //Do i need an @Serialized for this? Or not since its in MyDate class
    private MyDate Date;
    
    @SerializedName("hoursWorked")
    private double HoursWorked; 
    
    public Shift()
    {
        Date = new MyDate();
        HoursWorked = 0.0;
    }
    
    public Shift(int Month1, int Day1, int Year1, double HW)
    {
        Date = new MyDate(Month1, Day1, Year1);
        HoursWorked = HW;
    }
    
    public MyDate GetDate()
    {
        return Date;
    }
    
    public double GetHoursWorked()
    {
        return HoursWorked;
    }
    
    
    public void SetDate(int Month1, int Day1, int Year1)
    {
        Date.SetMonth(Month1);
        Date.SetDay(Day1);
        Date.SetYear(Year1);
        
    }
    
    public void SetHoursWorked(double HW)
    {
        HoursWorked = HW;
    }
    
     void readJSON(FileReader fr)
    {
        
    }
    
    void writeJSON(PrintStream ps)
    {
        
    }
    
    @Override
    public String toString()
    {
        String y = "Descriptive Text"; 
        return y;
    }
    
}
