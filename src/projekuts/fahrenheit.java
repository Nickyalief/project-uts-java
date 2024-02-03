/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekuts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class fahrenheit {
     public void fahr(){
    
     Scanner input = new Scanner(System.in);

    System.out.println("Masukkan temperatur di Celcius : ");
    double celcius = input.nextDouble();
    double fahrenheit = celcius * 9/5 + 32;
    System.out.println(celcius + " Celcius sama dengan " + fahrenheit + " Fahrenheit");

     }