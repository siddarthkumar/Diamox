/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dojo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author siddarth
 */
public class Dojo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String input="";
     while(((input=br.readLine()).equalsIgnoreCase("Over")!=true))
     {
     double year = Double.parseDouble(input);
     if(year%100==0 && year%400==0){
         System.out.println("LeapYear");
     }else if(year%100==0 && year%4==0){
    System.out.println("Not a Leap Year");
     }
     else if(year%4==0 && year%100!=0){
     System.out.println("Leap Year");
     }
     
      else{
       System.out.println("Not a Leap Year");
            }
     System.out.println();
     System.out.println("Enter the value Again");
     
     }
     System.out.println("Program Executed!");
     
    }
    
}
