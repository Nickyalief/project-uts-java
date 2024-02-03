/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekuts;

import java.util.Scanner;

public class celcius {
    public void cel(){
    
Scanner input = new Scanner(System.in);

System.out.println("Masukkan temperatur di celcius : ");
double celcius = input.nextDouble();
double fahrenheit = celcius * 9/5 + 32;
System.out.println(celcius + " Celcius sama dengan " + fahrenheit + " Fahrenheit");
double reamur = celcius * 5/4 + 32;
System.out.println(celcius + " Celcius sama dengan " + reamur + " Reamur");
    
        
}
}
