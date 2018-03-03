/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author Sales Rep01
 */
public class Main {

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n=new Scanner(System.in);
        int opc;
    do{
        System.out.println(" _________________________________________ ");
        System.out.println("|  Por favor escoja una opcion del menu   |");
        System.out.println("|_________________________________________|");
        System.out.println("|                1.Comprar                |");
        System.out.println("|_________________________________________|");
        System.out.println("|            2.Cantidad ventas            |");
        System.out.println("|_________________________________________|");
        System.out.println("|               3.Ganancias               |");
        System.out.println("|_________________________________________|");
        System.out.println("|                4.Salir                  |");
        System.out.println("|_________________________________________|");
        System.out.println("");
        opc=n.nextInt();
        switch(opc){
            case 1:
                Productos m=new Productos();
                Scanner q=new Scanner(System.in);
                System.out.println("");
                Scanner k=new Scanner(System.in);
                int op;
                do{
                System.out.println(" _________________________________________");
                System.out.println("|  Por favor escoja una opcion del menu   |");
                System.out.println("|_________________________________________|");
                System.out.println("|               1.Margaritas              |");
                System.out.println("|_________________________________________|");
                System.out.println("|               2.Chocorramo              |");
                System.out.println("|_________________________________________|");
                System.out.println("|               3.Galletas                |");
                System.out.println("|_________________________________________|");
                System.out.println("|               4.Chitos                  |");
                System.out.println("|_________________________________________|");  
                System.out.println("|               5.Yogurt                  |");
                System.out.println("|_________________________________________|");
                System.out.println("|               6.Gansito                 |");
                System.out.println("|_________________________________________|");
                System.out.println("|               7.Salir                   |");
                System.out.println("|_________________________________________|");
                System.out.println("");
                op=k.nextInt();
                switch(op){
                    case 1:
                        m.margaritas(); 
                        break;
                    case 2:
                        m.chocorramo();
                        break;
                    case 3:
                        m.galletas();
                        break;
                    case 4:
                        m.chitos();
                        break;
                    case 5:
                        m.yogurt();
                        break;
                    case 6:
                        m.gansito();
                        break;
                }
                }while(op!=7);
                break;
            case 2:
                Cantidad l=new Cantidad();
                Scanner ve=new Scanner(System.in);
                int o;
                do{
                    System.out.println(" _____________________________________________");
                    System.out.println("| Por favor escoja una opcion de nuestro menu |");
                    System.out.println("|_____________________________________________|");
                    System.out.println("|         1.Cantidad ventas Margaritas        |");
                    System.out.println("|_____________________________________________|");
                    System.out.println("|         2.Cantidad ventas Chocorramo        |");
                    System.out.println("|_____________________________________________|");
                    System.out.println("|         3.Cantidad ventas Galletas          |");
                    System.out.println("|_____________________________________________|");
                    System.out.println("|          4.Cantidad ventas Chitos           |");
                    System.out.println("|_____________________________________________|");
                    System.out.println("|          5.Cantidad ventas Yogurt           |");
                    System.out.println("|_____________________________________________|");
                    System.out.println("|         6.Cantidad ventas Gansito           |");
                    System.out.println("|_____________________________________________|");
                    System.out.println("|          7.Cantidad ventas Total            |");
                    System.out.println("|_____________________________________________|");
                    System.out.println("|                  8.Salir                    |");
                    System.out.println("|_____________________________________________|");
                    System.out.println("");
                    o=ve.nextInt();
                    switch(o){
                        case 1:
                            l.cantidadMargaritas();
                            break;
                        case 2:
                            l.cantidadChocorramo();
                            break;
                        case 3:
                            l.cantidadGalletas();
                            break;
                        case 4:
                            l.cantidadChitos();
                            break;
                        case 5:
                            l.cantidadYogurt();
                            break;
                        case 6:
                            l.cantidadGansito();
                            break;
                        case 7:
                            l.cantidadTotal();
                            break;
                    }
                }while(o!=8);
                break;
            case 3:
                Ganancias ga=new Ganancias();
                Scanner g=new Scanner(System.in);
                int opci;
                do{
                    System.out.println(" _____________________________________________");
                    System.out.println("| Por favor escoja una opcion de nuestro menu |");
                    System.out.println("|_____________________________________________|");
                    System.out.println("|          1.Ganancias de Margaritas          |");
                    System.out.println("|_____________________________________________|");
                    System.out.println("|          2.Ganancias de Chocorramo          |");
                    System.out.println("|_____________________________________________|");
                    System.out.println("|           3.Ganancias de Galletas           |");
                    System.out.println("|_____________________________________________|");
                    System.out.println("|            4.Ganancias de Chitos            |");
                    System.out.println("|_____________________________________________|");
                    System.out.println("|             5.Ganancias de Yogurt           |");
                    System.out.println("|_____________________________________________|");
                    System.out.println("|            6.Ganancias de Gansito           |");
                    System.out.println("|_____________________________________________|");
                    System.out.println("|              7.Ganancias Total              |");
                    System.out.println("|_____________________________________________|");
                    System.out.println("|                  8.Salir                    |");
                    System.out.println("|_____________________________________________|");
                    System.out.println("");  
                    opci=g.nextInt();
                    switch(opci){
                        case 1:
                            ga.gananciasMargaritas();
                            break;
                        case 2:
                            ga.gananciasChocorramo();
                            break;
                        case 3:
                            ga.gananciasGalletas();
                            break;
                        case 4:
                            ga.gananciasChitos();
                            break;
                        case 5:
                            ga.gananciasYogurt();
                            break;
                        case 6:
                            ga.gananciasGansito();
                            break;
                        case 7:
                            ga.gananciasTotal();
                            break;
                    }
                }while(opci!=8);
        }
    
            
       
           
        
    }while(opc!=4);}

}
