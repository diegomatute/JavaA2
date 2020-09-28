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
public class Worker 
{
    private String First;
    private String Last;
    private int Id;
    private double PayRate; 
    
    public Worker()
    {
        First = "NO";
        Last = "NO_LAST";
        Id = 0;
        PayRate = 0.0;
    }
    
    public Worker(String f, String l, int Id2, double pRate)
    {
        First = f;
        Last = l;
        Id = Id2;
        PayRate = pRate;   
    }
    
    public String GetFirst()
    {
        return First;
    }
    
    public String GetLast()
    {
        return Last;
    }
    
    public int GetId()
    {
        return Id;
    }
    
    public double GetPayRate()
    {
        return PayRate;
    }
    
    public void SetFirst(String f)
    {
        First = f;
    }
    
    public void SetLast(String l)
    {
        Last = l;
    }
    
    public void SetId(int Id2)
    {
        Id = Id2;
    }
    
    public void SetPayRate(double pRate)
    {
        PayRate = pRate;
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
        String x = First + " " + Last + " " + Id + " " + PayRate; 
        return x;
    }
    
    
}
