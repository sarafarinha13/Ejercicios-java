package juegotresenraya;

import java.util.HashMap;
import java.util.Map;

public class JuegoTresEnRaya {
    // Vamos a usar la clase JuegoTresEnRaya y además el main
    private static String nombreJuego = "¡Tres en Raya!";
    
    //Creamos el tablero 
    private static String [][] tablero = {
          {"1","2","3"},
          {"4","5","6"},
          {"7","8","9"}
      };
      
    
    //creamos el jugador
    private static String jugador = "X";
    
    
    
    private static Map<Integer, Integer[]> posiciones = new HashMap<>();
    
    
    
    
    //Creamos un método que pinte el tablero. Como solo imprime no va a devolver nada por lo tanto es void
    private static void pintarTablero()
    {
        //creamos los bucles para recorrerar el tablero (matriz)
        for( int i=0; i<3; i++){

            System.out.println(" -------------");
            System.out.print(" | ");


            for(int j=0; j<3; j++){
                System.out.print(JuegoTresEnRaya.tablero[i][j] + " | ");
            }

            System.out.println();
        }
        System.out.println(" -------------");
    }
    

public static void main(String[] args) {
    
    //traemos el nombre de la clase JuegoTresEnRaya
    System.out.println(JuegoTresEnRaya.nombreJuego);
    
    
    //traemos el método pintar tablero 
    pintarTablero();

    
    

}

}
