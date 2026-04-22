package juegotresenraya;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
    
    //metodo para cargar posiciones
    private static void cargarPosiciones(){
        JuegoTresEnRaya.posiciones.put(1,new Integer[]{0,0});
        JuegoTresEnRaya.posiciones.put(2,new Integer[]{0,1});
        JuegoTresEnRaya.posiciones.put(3,new Integer[]{0,2});
        
        JuegoTresEnRaya.posiciones.put(4,new Integer[]{1,0});
        JuegoTresEnRaya.posiciones.put(5,new Integer[]{1,1});
        JuegoTresEnRaya.posiciones.put(6,new Integer[]{1,2});
        
        JuegoTresEnRaya.posiciones.put(7,new Integer[]{2,0});
        JuegoTresEnRaya.posiciones.put(8,new Integer[]{2,1});
        JuegoTresEnRaya.posiciones.put(9,new Integer[]{2,2});
    }
    
    
    
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
    Scanner sc = new Scanner(System.in);
    
    System.out.println(JuegoTresEnRaya.nombreJuego);
    
    //traemos el método pintar tablero 
    cargarPosiciones();
    pintarTablero();
    
    
    //Aquí le pedimos al usuario que nos ponga la posición de x
    System.out.println("Elige la posición?");
    int posicionElegida = sc.nextInt(); 
    
    
    //validamos que el numero que entre sea válido
    while(posicionElegida<1 || posicionElegida>9){
        System.out.println("Introduce un número del 1 al 9");
        posicionElegida = sc.nextInt(); 
    }
    
    
    //Convierto el número que me dan en una coordenada
    Integer [] coordenadas = posiciones.get(posicionElegida);
        
  
    //pongo la X en el tableto 
    tablero[coordenadas[0]][coordenadas[1]] = JuegoTresEnRaya.jugador;
    
    pintarTablero();
    
}

}
