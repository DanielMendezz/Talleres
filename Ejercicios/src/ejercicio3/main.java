/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Alison Ramos
 */
import java.util.Scanner; 
/** 
 * 
 * @author Alison Ramos 
 */ 
public class main { 
        
    public static void main(String[] args) { 
         
        Scanner sc=new Scanner(System.in); 
        int hor,min,seg,dia; 
        System.out.println("\ningrese los segundos "); 
        seg=sc.nextInt(); 
         
        hor=seg/3600; 
        min=(seg-(3600*hor))/60; 
        seg=seg-((hor*3600)+(min*60)); 
        dia=hor/24; 
        System.out.println(+dia+"   Dias\n"+hor+"   Horas\n "+min+"   Minutos\n "+seg+"   Segundos\n"); 
         
     } 
} 
 
 


