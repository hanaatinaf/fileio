package com.plursalsight;

import java.io.FileReader;
import java.io.IOException;
import  java.io.BufferedReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //exception : an event that occurs during the execution of
        // a program that disrupts the normal flow of instractions
      try {

          System.out.println("Entre a whole num:");
          int x = scanner.nextInt();
          System.out.println("Entre a whole num devided by:");
          int y = scanner.nextInt();
          int z = x/y;
          System.out.println("Resulat:" + z);


          String[] names = {
                  "Ezra", "Elisha", "Ian",
                  "Siddalee", "Pursalane", "Zephaniah"
          };
          System.out.print("Pick a kid (select #1 - #6): ");
          int index = scanner.nextInt();
          index--; // change number from range 1-6 to range 0-5
          // as long as the user entered a number in the range
          // of 1 to 6, this will work. Otherwise the index
          // will be out of range.
          System.out.println(names[index]);

      }
      catch (ArithmeticException a){System.out.println("You can not divide by zero! ");}
      catch (InputMismatchException a){System.out.println("Please Entre A Number!!!");}
      catch (Exception e){
          System.out.println("Something went Wrong ");
          System.out.println("Your number was out of range!");
          e.printStackTrace();}
      finally {
          System.out.println("this  will alway print");
          scanner.close();}




    }
}
