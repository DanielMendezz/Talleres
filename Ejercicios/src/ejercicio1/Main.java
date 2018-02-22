/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Alison Ramos
 */
import java.util.Scanner;//importamos las librerias  
          
public class Main {  
Scanner entradaTecldo=new Scanner(System.in);//declaracion de un instancia   
    String nom;//Declaracion vaariables  
  
    /**  
     * @param args the command line arguments  
     */  
    public static void main(String[] args) {  
        // TODO code application logic here  
        Scanner s=new Scanner(System.in);//lectura de dato ingresado  
        System.out.println("Ingrese nombre estudiante");  
        String nom = s.nextLine();//almacenamiento de dato  
         
         Scanner m=new Scanner(System.in);  
        System.out.println("Ingrese numero de notas");  
        int n = m.nextInt();  
        System.out.println("El dato ingresado es: "+ n);  
        //declaracion   
        double i=1.0;  
        double prom=0.0;  
        double suma=0.0; 
        
        while(i>=1 && i<=n ){  
            i++;  
            System.out.println("Ingrese notas actuales");  
            int notas;  
            notas = m.nextInt();  
            suma=suma+notas;  
              
        }  
        prom=suma/n;  
        System.out.println("La suma de notas es: "+ suma);  
        System.out.println("El promedio total es: "+ prom);  
          
          
  
    }  
}
 
