package com.plursalsight.FileIO;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class writefile {
    public static void main(String[] args) {
        // how to write a file usin g
        // fileWriter = Good for small or medium sizied text files
        // BufferedWriter = Better performance for large amount of text
        // PrintWriter = Best for strutured data like reports or logs
        // FileOutputStream =  Best for binary files e.g image ,audio books


        try(FileWriter write  = new FileWriter("hana.txt")){
            write.write("I like this food");
            System.out.println("File has been wrriten");


        }
        catch (FileNotFoundException a){
            System.out.println("File not find location ");
        }
        catch (IOException a){
            System.out.println("Could not write file");
        }


    }
}
