/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekuts;

import java.io.InputStreamReader;
import java.util.Scanner;

class Projekuts {
    
     public static String readInputan() {
        String read = "";
        InputStreamReader input = new InputStreamReader (System.in);
        java.io.BufferedReader buf = new java.io.BufferedReader (input);
        try {
            read = buf.readLine();
        }catch (java.io.IOException e){
            System.err.println("Error!");
        }
        return read;
    }   
     public static void main (String [] args){
     Scanner input = new Scanner (System.in);
        System.out.println("===============================");
        System.out.println("      ---KONVERSI SUHU---      ");
        System.out.println("===============================");
        System.out.println("1. Celcius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Reamur");
        System.out.println("4. Keluar");
        System.out.println(" Pilih Pilihan : ");
        int oi = input.nextInt();
        switch (oi) {
            case 1:
                celcius hitungCelcius = new celcius();
                hitungCelcius.cel();
            break;
            case 2:
                fahrenheit hitungFahrenheit = new fahrenheit();
                hitungFahrenheit.fahr();
            break;
            case 3:
                reamur hitungReamur = new reamur ();
                hitungReamur.ream();
            break;
            default:
                
        }
                
                    
        }
    }
    

