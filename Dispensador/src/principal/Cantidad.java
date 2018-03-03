/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import static principal.Productos.i;
import static principal.Productos.i1;
import static principal.Productos.i2;
import static principal.Productos.i3;
import static principal.Productos.i4;
import static principal.Productos.i5;
import static principal.Productos.totalve;


/**
 *
 * @author Sales Rep01
 */
public class Cantidad {
    public void cantidadMargaritas(){
        System.out.println("La cantidad de ventas de Margaritas: "+i);
    }
    
    public void cantidadChocorramo(){
        System.out.println("La cantidad de ventas de Chocorramo: "+i1);
    }
    
    public void cantidadGalletas(){
        System.out.println("La cantiddad de ventas de Galletas: "+i2);
    }
    
    public void cantidadChitos(){
        System.out.println("La cantidad de ventas de Chitos: "+i3);
    }
    
    public void cantidadYogurt(){
        System.out.println("La cantidad de ventas de Yogurt: "+i4);
    }
    
    public void cantidadGansito(){
        System.out.println("La cantidad de ventas de Gansito: "+i5);
    }
    
    public void cantidadTotal(){
        System.out.println("La cantidad de ventas Total: "+totalve);
    }
}
