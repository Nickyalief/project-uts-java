/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekuts;

import java.util.Scanner;

public class reamur {
    public void ream(){
    
Scanner input = new Scanner(System.in);

System.out.println("Masukkan temperatur di Reamur : ");
double reamur = input.nextDouble();
double fahrenheit = reamur * 9/5 + 32;
System.out.println(reamur + " Celcius sama dengan " + fahrenheit + " Fahrenheit");
 
    System.out.println("Masukkan temperatur di fahrenheit : ");
    double celcius = input.nextDouble();
    double fahrenheit = celcius * 9/5 + 32;
    System.out.println(celcius + " Celcius sama dengan " + fahrenheit + " Fahrenheit");

}
}
