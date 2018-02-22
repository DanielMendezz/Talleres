/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Daniel Mendez
 */
import java.util.Scanner; 
 
/** 
 * 
 * @author Alison Ramos 
 */ 
public class main {
    Scanner entradaTecldo=new Scanner(System.in);//declaracion de un instancia 
     
    public static void main(String[] args){ 
        do{ 
        Scanner sam=new Scanner(System.in);//lectura de dato ingresado 
        System.out.println("Ingrese mes del año"); 
        int mes = sam.nextInt();//almacenamiento de dato*/  
        if((3 == mes) || (2 == mes) || (1 == mes) ){//Comparacion de datos si es verdaddero pasa a la siguiente instrucción 
            System.out.println("INVIERNO"); 
        } 
        if((4 == mes) || (5 == mes) || (6 == mes) ){ 
            System.out.println("VERANO"); 
        } 
        if((7 == mes) || (8 == mes) || (9 == mes) ){ 
            System.out.println("OTOÑO"); 
        } 
        if((10 == mes) || (11 == mes) || (12 == mes) ){ 
            System.out.println("PRIMAVERA"); 
        } 
        }while(true); 
    } 
}
        
