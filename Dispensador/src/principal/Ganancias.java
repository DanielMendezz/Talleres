/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import static principal.Productos.ganancias;
import static principal.Productos.preciochi;
import static principal.Productos.preciocho;
import static principal.Productos.precioga;
import static principal.Productos.preciogan;
import static principal.Productos.preciom;
import static principal.Productos.precioy;

/**
 *
 * @author Sales Rep01
 */
public class Ganancias {
    public void gananciasMargaritas(){
        System.out.println("La cantidad de ganancias de Margaritas es: "+preciom);
    }
    
    public void gananciasChocorramo(){
        System.out.println("La cantidad de ganancias de Chocorramo es: "+preciocho);
    }
    
    public void gananciasGalletas(){
        System.out.println("La cantidad de ganancias de Galletas es: "+precioga);
    }
    
    public void gananciasChitos(){
        System.out.println("La cantidad de ganancias de Chitos es: "+preciochi);
    }
    
    public void gananciasYogurt(){
        System.out.println("La cantidad de ganancias de Yogurt es: "+precioy);
    }
    
    public void gananciasGansito(){
        System.out.println("La cantidad de ganancias de Gansitos es: "+preciogan);
    }
    
    public void gananciasTotal(){
        System.out.println("La cantidad de ganancias total es: "+ganancias);
    }
}
