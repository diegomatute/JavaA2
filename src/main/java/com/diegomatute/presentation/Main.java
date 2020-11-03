/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diegomatute.presentation;

//import com.diegomatute.business.MyDate;
import com.diegomatute.business.Shift;
import com.diegomatute.business.TimeSheet;
import com.diegomatute.business.Worker;
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
public class Main {
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
        
        //Instance of TimeSheet
        TimeSheet time = new TimeSheet();
        
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
            System.out.printf("Enter choice \n");

            choice = input.nextInt();
            System.out.println("");
            
            switch(choice)
            {
                case 1:
                    
                    break;
                    
                case 2:
                    
                    break;
                    
                case 3:
                    
                    break;
                    
                case 4:
                    
                    break;
                    
                case 5:
                    
                    break;
                    
                case 6:
                    
                    break;
                    
                default:
                    //If choice is not 1-6, program ends.
                    System.out.println("Exit");

                    break;
            }
        }
        while(choice != 7);
        
        
        
        
}
    }


/*
        
        
        //Assignment 2 Code


        
        int choice;
        
        Worker w = new Worker();

        //Instance of Shift
        Shift s = new Shift();
        
        //Scanner for user input
        Scanner input = new Scanner(System.in);

        //GSON related variables to parse or create JSON.
        GsonBuilder builder = new GsonBuilder();
        //Sets prettyPrinting to true
        builder.setPrettyPrinting();
        Gson gson = builder.create();

        //Read from file
        //Moved to choice 1
        //FileReader fr = new FileReader("shift.json");

        
        //******************************************************
        // Do - While loop prints out a menu for user to
        // interact with. If user inputs 1, 2, or 3, specfic
        // actions will take place. If the user inputs 4, or 
        // or any other number, the program quits.
        // 
        //******************************************************

        do
        {
            //Menu
            System.out.println("Shift UI");
            System.out.println("--------");
            System.out.println("1 - Read shift from file as JSON");
            System.out.println("2 - Write shift to file as JSON");
            System.out.println("3 - Show shift to file as JSON");
            System.out.println("4 - Exit");
            System.out.printf("Enter choice \n");

            choice = input.nextInt();
            System.out.println("");

            switch(choice)
            {
                case 1: 
                    
                    //Worker example
                    /*
                    FileReader fr = new FileReader("worker.json");
                    w.readJSON(fr);
                    
                    System.out.println(w.toString());
                    */
                    
                    
        
                    /*
        
        
        
                    
                    Scanner in= new Scanner(System.in);
                    String filename;
                    //FileReader fr = new FileReader("shift.json");
                    
                    
                    //Asks user for input file name.
                    System.out.printf("Enter Shift JSON Input Filename\n");
                    filename = in.nextLine();
                    FileReader fr = new FileReader(filename);
                    
                    //Pass in FileReader fr
                    s.readJSON(fr);
                    
                    
                    break;
                case 2:
                    Scanner inP = new Scanner(System.in);
                    String outfile;
                    
                    //Asks user for output file name.
                    System.out.printf("Enter output file name: \n");
                    outfile = inP.nextLine();
                    
                    //******************************************************
                    //PrintStream enables data to be written to 
                    // a new file. 
                    //******************************************************
                    PrintStream ps = new PrintStream(outfile);
                    
                    s.writeJSON(ps);
                    
                    break;

                case 3:

                    //Outputs Shift information on screen.
                    System.out.println(s.toString());
                    

                    break;

                default:
                    //If choice is not 1-3, program ends.
                    System.out.println("Exit");

                    break;



            }
        }
        while(choice != 4);
        
        
        */