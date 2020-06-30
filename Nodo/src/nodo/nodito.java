
package nodo;

import java.util.Scanner;


public class nodito {
         Scanner lector = new Scanner(System.in);
    
    Nodo primero = new Nodo();
    Nodo ultimo = new Nodo();
    
    public nodito(){
        primero = null;
        ultimo = null;
    }
    public void insertarnodo(){
         
         Nodo nuevo = new Nodo();
         System.out.println("ingrese el dato para el nodo: ");
         nuevo.dato = lector.nextInt();
         if(primero == null){
             primero = nuevo;
             primero.siguiente = null;
             ultimo = nuevo;
         }else{
             ultimo.siguiente = nuevo;
             nuevo.siguiente = null;
             ultimo = nuevo;
             
         }
         System.out.println("el dato fue ingresado correctamente");     
     }
    
    public void mostrarNodo(){
        Nodo actual= new Nodo();
        actual = primero;
        if(primero != null){
                System.out.println("los datos son: ");
         while(actual != null){            
             System.out.print("["+actual.dato+"]--->");            
             actual = actual.siguiente;
         } 
       }else{
            System.out.println("la lista se encuentra vacia");
        }     
    }
    
    public void eliminarnodo(){
            
        Nodo actual = new Nodo();
        actual=primero;
        Nodo anterior = new Nodo();
        anterior = null;
        boolean encontrado = false;
        System.out.println("ingrese el dato del nodo a eliminar: ");
        int buscando = lector.nextInt();
        if(primero != null ){
          while(actual != null && encontrado != true){
            if(actual.dato == buscando){
              if(actual == primero){
               primero = primero.siguiente;
              }else{
               anterior.siguiente = actual.siguiente;
              }
              System.out.println("el nodo eliminado es: " + actual.dato );
              encontrado=true;
              }
              anterior = actual;
              actual = actual.siguiente;
          }  
          if(!encontrado){
              System.out.println("el nodo no se ha encontrado");
          }
        }else{
            System.out.println("la pila esta vacia");
        }
    }
}
