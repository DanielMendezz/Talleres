/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author Daniel Mendez
 */
public class Main { 
    public static void main(String[] args) { 
        //Declaracion de variables  
        int i = 0; 
        int j = 1; 
        int aux; 
        int fin = 100; 
 
        System.out.println(i); 
        System.out.println(j); 
         
        while (j + i <= fin) {//Inicio ciclo  
            aux = i; 
            i = j; 
            j = aux + i; 
 
            System.out.println(j); 
        } 
    } 
} 
     
