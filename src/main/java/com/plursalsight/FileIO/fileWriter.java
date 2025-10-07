package com.plursalsight.FileIO;

import java.io.*;


public class fileWriter {


    public static void main(String args[]) {
            // how to read a file using
            // BufferdReader + fileReader : for reading Text files line by line
             // midel man
            // FileInputStream: Best for binary files e.g image audio files
            //RandomAccessFile: Best for read/write specific portions of a larger file
            String filepath = "goldilocks.txt";
          // this is reading file
            try ( BufferedReader reader = new BufferedReader(new FileReader(filepath))){
                String line;
                while((line = reader.readLine()) != null){
                    System.out.println(line);
                }
            }
            catch (FileNotFoundException a){
                System.out.println("Could not locate file ");

            }
            catch (IOException a){
                System.out.println("Something is wrong");
            }




        }
}
