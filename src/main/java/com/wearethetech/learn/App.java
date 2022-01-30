package com.wearethetech.learn;

import java.io.File;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args.length < 1){
            System.err.println("Please provide an input!");
            System.exit(0);
        }
        System.out.println(processInput(args[0]));
    }

    public static String processInput(String inputFileName){
        File inputFile = new File(inputFileName);
        boolean exists = inputFile.exists();

        // JSON


        return inputFileName+ " "+exists;
    }

}
