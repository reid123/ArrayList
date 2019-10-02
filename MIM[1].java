/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mim;

import java.util.*;
import java.util.Iterator;

/**
 *
 * @author RahafEid
 */
public class MIM {
    
    public static void main(String[] args) {
//create an Arraylist
        ArrayList<String> arr = new ArrayList<>();
     arr.add(0, "house-");  
     arr.add(1, "CHRIstmas");
     arr.add(2, "Employee");
     arr.add(3, "book");   
     arr.add(4, "chrietmast");
     arr.add(5, "EMPloyee");
     
     System.out.println("Input Arraylist is  " + arr);
     System.out.println("The length of each String in the input Arraylist");
 for (int counter = 0; counter < arr.size(); counter++) { 		      
          System.out.print(arr.get(counter).length() + " "); 		
      }
    //Call the method 
         myMethod(arr);
    }

     public static void myMethod(ArrayList<String> arr) {
       
     //Iterate through the Arraylist     
    for (int i = 0; i<arr.size(); i++) {
             //get the string in certain index      
            String str=arr.get(i);   
            //find the length of the string in index i
            int len=str.length();
                  
        //check if length of the string is a multiple of 4 
              if(len % 4 == 0){
               //reverse the string using StringBuilder
                  String rev = new StringBuilder(str).reverse().toString();
                //remove the string at i index
                  arr.remove(str);
                // add the reversed value
                   arr.add(rev); 
               }
              
                //check if the length of the string is a multiple of 5
                else if((len % 5) == 0){
                        //cut the string to 5 charachters string if it is divideable by 5
                        String nVal= str.substring(0,6);
                        //remove the string
                        arr.remove(str);
                        //add the new string    
                        arr.add(nVal);
                       }
                //check of the string contains -
                else if(str.contains("-")){
                      // find the index
                     int place = arr.indexOf(str);
                     //remove the string
                      arr.remove(str); 
                      //find the next xtring value in the next index
                      String nv= arr.get(place+1);                  
                      //add the string value
                     arr.add(nv);                                    
                  }
                  //Convert the string to all uppercase if it contains at least 3 uppercase characters in the first 5 characters.
                 else
                      //check if the string length is biggher than 4
                  if(len > 4 ){
                      int total=0;
                      // create a string that contains 5 charachter from the String
                      String tem= str.substring(0,6);                   
                        //itterate through the string
                        for (int j=0; j< tem.length(); j++)
                        {
                            char ch = tem.charAt(j);
                            //check of the character is uppercase
                            if (Character.isUpperCase(ch)){
                            //update the total 
                            total = total+1;
                            if (total>3){
                            tem=tem.toUpperCase();
                            arr.add(tem);
                                }
                              }
                         }
                    }  
                 
     
                    else {
                      // if the string doesn't meet any of teh previous if statements, delete the string from the ArrayList 
                        arr.remove(str);
                    }
                }
    ///print the array
 
      System.out.println("\n" + "the new array after calling the method   " + arr);
      System.out.println("The length of each String in the output Arraylist");
 for (int counter = 0; counter < arr.size(); counter++) { 		      
          System.out.print(arr.get(counter).length() + " "); 		
      }
  }
}
    
    