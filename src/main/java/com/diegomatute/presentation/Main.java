/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diegomatute.presentation;


//import com.diegomatute.business.ArrayIndexOutOfBoundsException;
import com.diegomatute.business.Shift;
import com.diegomatute.business.TimeSheet;
import com.diegomatute.business.Worker;
import com.diegomatute.business.MyDate;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintStream;


/**
 * Contains Main class code. This class generates a menu for a 
 * user.
 * 
 * @author diegomatute
 * @since 9/25/2020
 * 
 */
public class Main 
{
    /**
     * This method outputs a menu to a user and performs an action
     * depending on user input.
     * 
     * @param args Contains the supplied command-line arguments as an
     * array of string.
     * @throws FileNotFoundException  Throws an exception FileNotFoundException.
     */
    public static void main(String args[]) throws FileNotFoundException
    {
        
        int choice; 
        
        String filename;
        
        
        //Instance of TimeSheet
        TimeSheet timeSheet = new TimeSheet();
        
        int timeSheetIndex = 0;
        
        //Allows for user input
        Scanner input = new Scanner(System.in);
        
        
        //GSON related variables to parse or create JSON.
        GsonBuilder builder = new GsonBuilder();
        //Sets prettyPrinting to true
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        
        do 
        {
            //Menu
            System.out.println("TimeSheet UI");
            System.out.println("-------------");
            System.out.println("1 - Read TimeSheet from file as JSON");
            System.out.println("2 - Write TimeSheet to file as JSON");
            System.out.println("3 - Show Shift at index");
            System.out.println("4 - Show Shift with most hours");
            System.out.println("5 - Show TimeSheet report on screen");
            System.out.println("6 - Show TimeSheet toString on screen");
            System.out.println("7 - Exit");
            System.out.printf("Enter choice: \n");

            choice = input.nextInt();
            input.nextLine();
            System.out.println("");
            
            switch(choice)
            {
                case 1:
                    
                    System.out.printf("Enter Time Sheet JSON Input Filename: \n");
                    
                    //Read user input
                    filename = input.nextLine();
    
                    FileReader fr = new FileReader(filename);
                    
                    //readJson method called
                    timeSheet.readJson(fr);
                    

                    
                    break;
                    
                case 2:
                    System.out.printf("Enter Time Sheet JSON Output Filename: \n");
                    
                    filename = input.nextLine();
                    
                    //Open PrintStream
                    PrintStream ps = new PrintStream(filename);
                    
                    //writeJson called
                    timeSheet.writeJSON(ps);
                    
                    
                    break;
                    
                case 3:
                    
                    //Try/catch block
                    try
                    {
                        System.out.printf("Enter index\n");
                        timeSheetIndex = input.nextInt();
                        
                        input.nextLine();
                        System.out.println(timeSheet.getAt(timeSheetIndex));
                    } 
                    //Catches exception
                    catch (ArrayIndexOutOfBoundsException ex) 
                    {
                        System.out.println("Exception: Handled in main\n");
                        //System.out.println(ex);
                        //System.out.printf("ArithmeticException caught!");
                    //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //Runs regardless of catch blocks
                    finally
                    {
                        System.out.println("Finally!\n");
                    }
                    
                    
                    break;

                    
                case 4:
                    //getMaxShift method called
                    System.out.println(timeSheet.getMaxShift());
                    break;
                    
                case 5:
                    
                    //PrintStream prints called
                    PrintStream prints = new PrintStream(System.out);
                    
                    //report method called
                    timeSheet.report(prints);
                    
                    break;
                    
                case 6:
                    //System.out.println(timeSheet);
                    
                    //Call to toString
                    System.out.println(timeSheet.toString());
                    break;
                    
                default:
                    //If choice is not 1-6, program ends.
                    if (choice <= 0 || choice > 7)
                    {
                        System.out.println("Invalid choice\n");
                    }
                    //System.out.println("Exit");

                    break;
            }
        }
        while(choice != 7);
    }
    
}
        
        
       