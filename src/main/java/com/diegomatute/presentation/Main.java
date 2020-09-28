/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diegomatute.presentation;

import com.diegomatute.business.Shift;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintStream;


/**
 *
 * @author diegomatute
 */
public class Main { public static void main(String args[])
{
    int choice;
    Scanner input = new Scanner(System.in);
    
    Shift s = new Shift();
    GsonBuilder builder = new GsonBuilder();
    builder.setPrettyPrinting();
    Gson gson = builder.create();
    
    String jsonString = gson.toJson(s);
    
    
    do
    {
        
        System.out.println("Shift UI");
        System.out.println("--------");
        System.out.println("1 - Read shift from file as JSON");
        System.out.println("2 - Write shift to file as JSON");
        System.out.println("3 - Show shift to file as JSON");
        System.out.println("4 - Exit");
        System.out.println("Enter choice ");
        
        choice = input.nextInt();
        
        switch(choice)
        {
            case 1:
        }
    }
    while(choice != 4);
}
    
}
