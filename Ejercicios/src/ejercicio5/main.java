/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Alison Ramos
 */
public class main {
   
 Scanner entradaTecldo=new Scanner(System.in);//declaracion de un instancia 
     
    public static int main(String[] args){ 
       int b=0,c=0,d=0,e=0;
        do{ 
        Scanner sam=new Scanner(System.in);//lectura de dato ingresado 
        System.out.println("Ingrese Edad"); 
        int edad= sam.nextInt();//almacenamiento de dato*/  
        
        for (edad = 0; edad<=7;edad++){//Comparacion de datos si es verdaddero pasa a la siguiente instrucción 
            b=1;
            return b;
        } 
         for (edad = 7; edad<=17;edad++){
            c=1;
            return c;
        } 
        for (edad = 18; edad<=25;edad++){
            d=1;
            return d;
        } 
        for (edad = 60; edad<=100;edad++){ 
            e=1; 
            return e;
        } 
        }while(true); 
    
        if (1 == b ){
            System.out.println("Categoria Pre-Infantil");
        }
        if (1 == c ){
            System.out.println("Ctegoria Infantil"); 
        }
        if (1 == d ){
             System.out.println("Mayores ");
        }
        if (1 == e ){ 
            System.out.println("Veteranos"); 
        }
    } 
}