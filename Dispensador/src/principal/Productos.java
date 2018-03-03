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
public class Productos {
    int cantidad,precio;
    static int totalve=0,total=30,totalc=10,totalg=10,totalch=10,totaly=10,totalga=10;
    int opc;
    static int i=0,i1=0,i2=0,i3=0,i4=0,i5=0;
    static int preciom=0,preciocho=0,precioga=0,preciochi=0,precioy=0,preciogan=0;
    static int ganancias=0;
    public Productos(){
        cantidad=30;
        precio=1_000;
}
    public Productos(int cantidad,int precio){
       this.cantidad=cantidad;
       this.precio=precio;
    }
    
    public void margaritas(){
        Scanner y=new Scanner(System.in);
        int qp;
        System.out.println("Esta seguro en comprar unas Margaritas (Si=1 o No=0)");
        qp=y.nextInt();
        if(total==0){
           total=30;
           System.out.println("Se esta recargando el producto...");
           System.out.println("");
           System.out.println("Esta seguro en comprar unas Margaritas (Si=1 o No=0)");
           qp=y.nextInt();
           if(qp==1){
            total=total-1;
            totalve=totalve+1;
            preciom=preciom+2000;
            ganancias=ganancias+2000;
            i++;
           }  
        }
        if(qp==1){
            total=total-1;
            totalve=totalve+1;
            preciom=preciom+2000;
            ganancias=ganancias+2000;
            i=i+1;
        }
    }
    
    public void chocorramo(){
        Scanner w=new Scanner(System.in);
        int e;
        System.out.println("Esta seguro en comprar un Chocorramo (Si=1 o No=0)");
        e=w.nextInt();
        if(totalc==0){
           totalc=10;
           System.out.println("Se esta recargando el producto...");
           System.out.println("");
           System.out.println("Esta seguro en comprar un Chocorramo (Si=1 o No=0)");
           e=w.nextInt();
           if(e==1){
            totalc=totalc-1;
            totalve=totalve+1;
            preciocho=preciocho+1500;
            ganancias=ganancias+1500;
            i1++;
           }  
        }
        if(e==1){
            totalc=totalc-1;
            totalve=totalve+1;
            preciocho=preciocho+1500;
            ganancias=ganancias+1500;
            i1++;
        }
    }
    
    public void galletas(){
        Scanner r=new Scanner(System.in);
        int t;
        System.out.println("Esta seguro en comprar unas Galletas (Si=1 o No=0)");
        t=r.nextInt();
        if(totalg==0){
           totalg=10;
           System.out.println("Se esta recargando el producto...");
           System.out.println("");
           System.out.println("Esta seguro en comprar unas Galletas (Si=1 o No=0)");
           t=r.nextInt();
           if(t==1){
            totalg=totalg-1;
            totalve=totalve+1;
            precioga=precioga+1000;
            ganancias=ganancias+1000;
            i2++;
           }  
        }
        if(t==1){
            totalg=totalg-1;
            totalve=totalve+1;
            precioga=precioga+1000;
            ganancias=ganancias+1000;
            i2++;
        }
    }
    
    public void chitos(){
        Scanner u=new Scanner(System.in);
        int o;
        System.out.println("Esta seguro en comprar unos Chitos (Si=1 o No=0)");
        o=u.nextInt();
        if(totalch==0){
           totalch=10;
           System.out.println("Se esta recargando el producto...");
           System.out.println("");
           System.out.println("Esta seguro en comprar unos Chitos (Si=1 o No=0)");
           o=u.nextInt();
           if(o==1){
            totalch=totalch-1;
            totalve=totalve+1;
            preciochi=preciochi+2000;
            ganancias=ganancias+2000;
            i3++;
           }  
        }
        if(o==1){
            totalch=totalch-1;
            totalve=totalve+1;
            preciochi=preciochi+2000;
            ganancias=ganancias+2000;
            i3++;
        }
    }
    
    public void yogurt(){
        Scanner f=new Scanner(System.in);
        int g;
        System.out.println("Esta seguro en comprar un Yogurt (Si=1 o No=0)");
        g=f.nextInt();
        if(totaly==0){
           totaly=10;
           System.out.println("Se esta recargando el producto...");
           System.out.println("");
           System.out.println("Esta seguro en comprar un Yogurt (Si=1 o No=0)");
           g=f.nextInt();
           if(g==1){
            totaly=totaly-1;
            totalve=totalve+1;
            precioy=precioy+1500;
            ganancias=ganancias+1500;
            i4++;
           }  
        }
        if(g==1){
            totaly=totaly-1;
            totalve=totalve+1;
            precioy=precioy+1500;
            ganancias=ganancias+1500;
            i4++;
        }
    }
    
    public void gansito(){
        Scanner j=new Scanner(System.in);
        int d;
        System.out.println("Esta seguro en comprar un Gansito (Si=1 o No=0)");
        d=j.nextInt();
        if(totalga==0){
           totalga=10;
           System.out.println("Se esta recargando el producto...");
           System.out.println("");
           System.out.println("Esta seguro en comprar un Gansito (Si=1 o No=0)");
           d=j.nextInt();
           if(d==1){
            totalga=totalga-1;
            totalve=totalve+1;
            preciogan=preciogan+1500;
            ganancias=ganancias+1500;
            i5++;
           }  
        }
        if(d==1){
            totalga=totalga-1;
            totalve=totalve+1;
            preciogan=preciogan+1000;
            ganancias=ganancias+1000;
            i5++;
        }
    }
}

