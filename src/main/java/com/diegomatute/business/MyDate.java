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
public class MyDate 
{
    @SerializedName("month")
    private int Month;
    
    @SerializedName("day")
    private int Day;
    
    @SerializedName("year")
    private int Year;
    
    public MyDate()
    {
        Month = 0;
        Day = 0;
        Year = 0;
    
    };
    
    public MyDate(int m, int d, int y)
    {
        Month = m;
        Day = d;
        Year = y;
    };
    
    public int GetMonth()
    {
        return Month;
    };
    
    public int GetDay()
    {
        return Day;
    };
    
    public int GetYear()
    {
        return Year;
    };
    
    public void SetMonth(int m)
    {
        Month = m;
    };
    
    public void SetDay(int d)
    {
        Day = d;
    };
    
    public void SetYear(int y)
    {
        Year = y;
    };
    
    void readJSON(FileReader fr)
    {
        
    };
    
    void writeJSON(PrintStream ps)
    {
        
    };
    
    
    //Will this work since variables are int not String? 
    @Override 
    
    public String toString()
    {
        String s = Month + "/" + Day + "/" + Year; 
        return s;
    }
    
    
    
    
}
