package marioparty;

import java.util.Scanner;

public class Partida {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int cantidadMonedas;
    
    //PRIMERA PRUEBA
    Jugador j1 = new Jugador("manu", 0, 0, 0);
    
    System.out.println("Cúantas monedas quieres darle al J1");
    cantidadMonedas = sc.nextInt();
    
    //mandarle monedas
    j1.alterMonedas(cantidadMonedas);
    
    System.out.println("monedas actuales " + j1.getMonedas());
            
    System.out.println("Cuantas monedsa pierde el J1");
    cantidadMonedas = sc.nextInt();
            

    j1.alterMonedas(cantidadMonedas);
            
    System.out.println("monedas actuales " + j1.getMonedas());
            
    
        
        
        
    }
}
