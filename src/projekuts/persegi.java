/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekuts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReaader;

public class persegi {
    public int celcius;
    public int fahrenheit;
    
    public static String readInputan() {
        String Read = "";
        InputStreamReader input = new InputStreamReader (System.in);
        BufferedReader buf = new BufferedReader (input);
        try {
            read = buf.readLine();
        }catch (IOException e){
            System.err.println("Error!");
        }
        return read;
    }
    
    public persegi(){
        System.out.println("Masukkan Suhu Celcius : ");
        panjang=Integer.parseInt(readInputan());
        System.out.println("Masukkan Lebar");
        lebar=Integer.parseInt(readInputan ());
    }
    public int kali (int a, int b){
        return a*b;
    }
    public void ubah (int p, int l)
    }
    }
    public String cetak() {
        System.out.println("Panjang : " + panjang + " cm");
        System.out.println("Lebar : " + lebar + " cm");
        return "Hasil  : " + kali (panjang, lebar) + " cm";
    }
