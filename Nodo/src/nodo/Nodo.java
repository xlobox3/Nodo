
package nodo;

import java.util.Scanner;

public class Nodo {
 
    int dato;
    Nodo siguiente;
       
    public static void main(String[] args) {
     Scanner lector = new Scanner(System.in);
        int opcion;
        
        nodito n = new nodito();
        
        do {            
            System.out.println("\n1.- Agregar nodo");
            System.out.println("2.- Mostrar nodo");
            System.out.println("3.- Eliminar nodo");
            System.out.println("4.- Salir\n");

            System.out.print("Su opcion es --> ");
            
            opcion = lector.nextInt();
            switch(opcion)
            {
              case 1:
                  n.insertarnodo();
                    break;
              case 2:
                  n.mostrarNodo();
                  break;
              case 3:
                  n.eliminarnodo();
                  break;
              default: System.out.println("elija una opcion valida");
                }
        }
        while(opcion !=4);
            
    }
    
}
