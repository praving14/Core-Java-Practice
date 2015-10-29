package com.practice.PlayWithFile;

import com.sun.javaws.exceptions.ErrorCodeResponseException;

import java.io.*;
import java.nio.Buffer;

/**
 * Created by Pravin on 10/12/2015.
 */
public class ReadAFile {
    // File Path
    private static String FileName = "C:\\Users\\Pravin\\IdeaProjects\\src\\com\\practice\\PlayWithFile\\random.txt";
    private static String NewFileName = "C:\\Users\\Pravin\\IdeaProjects\\src\\com\\practice\\PlayWithFile\\newFile.txt";

    /*
     * Open a the file using the buffered reader;
     */
    public static BufferedReader openFile(String prompt){
        BufferedReader rd =null;
        while(rd == null){
            try{
                rd = new BufferedReader(new FileReader(prompt));
            } catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        return rd;
    }

    /*
     * Reading the file content line by line
     */
    public static void readFile(String fileName){
        BufferedReader rd =openFile(fileName);
        try{
            String line = " ";
            while (line != null){
                line = rd.readLine();
                System.out.println("Read Line: [" + line + "]");
                // this is reading another line with null ...why?

            }
            rd.close();
        } catch (IOException ex){
            ex.getMessage();
        }

    }

    /*
     * This basically write the string to the new file
     * We can also read a linf from a old file and write it to the new file as well
     */
    public static void writeAfile(String filename){
        try{
            PrintWriter wr =new PrintWriter(new FileWriter(filename));
            String line = "This is the new file.";
            wr.println(line);
            wr.close();
        } catch (IOException ex){
            ex.getMessage();
        }
    }

    public static void main(String[] args) {
        readFile(FileName);
        writeAfile(NewFileName);

    }
}
