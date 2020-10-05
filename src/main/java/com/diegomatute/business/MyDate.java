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
 * Contains MyDate class code. This class holds MyDate member variables
 * and methods.
 * 
 * @author diegomatute
 * @since 9/25/2020
 * 
 */
public class MyDate 
{
    //Attributes that maps class variables to JSON variables
    @SerializedName("month")
    private int Month;
    
    //Attributes that maps class variables to JSON variables
    @SerializedName("day")
    private int Day;
    
    //Attributes that maps class variables to JSON variables
    @SerializedName("year")
    private int Year;
    
    /**
     * This method sets the values of each member variable to
     * a default value.
     */
    public MyDate()
    {
        Month = 0;
        Day = 0;
        Year = 0;
    
    };
    
    /**
     * This method sets the values of each member variable to
     * the corresponding parameter values.
     * 
     * @param m Month is set to m.
     * @param d Day os set to d.
     * @param y Year is set to y.
    */
    public MyDate(int m, int d, int y)
    {
        Month = m;
        Day = d;
        Year = y;
    };
    
        
    /**
     * This method gets and returns Month.
     * 
     * @return Month
    */
    public int GetMonth()
    {
        return Month;
    };
    
            
    /**
     * This method gets and returns Day.
     * 
     * @return Day
    */
    public int GetDay()
    {
        return Day;
    };
    
            
    /**
     * This method gets and returns Year.
     * 
     * @return Year
    */
    public int GetYear()
    {
        return Year;
    };
    
            
    /**
     * This method sets Month to m.
     * 
     * @param m Month is set to m.
    */
    public void SetMonth(int m)
    {
        Month = m;
    };
    
            
    /**
     * This method sets Day to d.
     * 
     * @param d Day is set to Day.
    */
    public void SetDay(int d)
    {
        Day = d;
    };
    
            
    /**
     * This method sets Year to y.
     * 
     * @param y Year is set to y.
    */
    public void SetYear(int y)
    {
        Year = y;
    };
    
            
    /**
     * This method reads the contents of all member variables 
     * from the given instance of FileReader as JSON.
     * 
     * @param fr An open file.
    */
    public void readJSON(FileReader fr)
    {
        String jsonString = ("shift.json");
    };
    
            
    /**
     * This method writes the member variables in JSON format
     * too the given PrintStream.
     * 
     * @param ps A new output file.
    */
    public void writeJSON(PrintStream ps)
    {
        String jsonString = "{\"date\":\" \", \"month\": 9, \"day\": 2, \"year\": 2020}";

    };
    
    /**
     * This method should return a String instance that contains 
     * a formatted date.
     * 
     * @return String S
     */
    @Override 
    public String toString()
    {
        String s = Month + "/" + Day + "/" + Year; 
        return s;
    }
    
    
    
    
}
