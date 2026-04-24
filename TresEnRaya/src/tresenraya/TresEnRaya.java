package tresenraya;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TresEnRaya {

    private static String nombreJuego = "BIENVENIDO AL TRES EN RAYA!";
    
    
    //creamos los jugadores
    private static String jugador1 = "X";
    private static String jugador2 = "O";
    
    
    //crear tablero 
    private static String [][] tablero = {
        {"1", "2","3"},
        {"4", "5","6"},
        {"7", "8","9"} 
    };
    
    
    //Crear un hashmap 
    private static Map<Integer, int[]> coordenadas = new HashMap<>();
    
    //MÉTODO PARA TRADUCIR
    private static void traducirCoordenadas(){
        //Fila 0
        coordenadas.put(1, new int[]{0,0});
        coordenadas.put(2, new int[]{0,1});
        coordenadas.put(3, new int[]{0,2});

        //Fila 1
        coordenadas.put(4, new int[]{1,0});
        coordenadas.put(5, new int[]{1,1});
        coordenadas.put(6, new int[]{1,2});

        //Fila 2
        coordenadas.put(7, new int[]{2,0});
        coordenadas.put(8, new int[]{2,1});
        coordenadas.put(9, new int[]{2,2});
    }
    
    
    
    //crear método para printear el tablero 
    private static void printTablero(){

        for(int i=0; i<3; i++){
            
            System.out.println("---+---+---");
            
            for(int j=0; j<3; j++){
                System.out.print(" " + tablero[i][j] + " |");
            }
            System.out.println();
        }
        
        System.out.println("---+---+---");  
    }
    
    
    
    
    
    
  
    public static void main(String[] args) {
        
        //Declarar variables 
        int numElegido = 0;
        int contador = 0;
      
        int usados [] = {0,0,0,0,0,0,0,0,0};
        int [] traducirNumACoordenada;
        Boolean juego = true;
        Boolean turnoX = true;
        
        traducirCoordenadas();
        Scanner sc = new Scanner(System.in);
   
        //Inicio del juego 
        System.out.println(TresEnRaya.nombreJuego);
        printTablero();
        
 
       
        while(juego){
            if(turnoX){
               
                //pedir numero a X
                while(numElegido<1 || numElegido>9 ){
                    System.out.println("Dime que posición quieres");
                    numElegido = sc.nextInt();
                }
                
                
                //añadir nums usados al array
                usados[contador] = numElegido;
                contador++;
                

                //sustitución
                traducirNumACoordenada = coordenadas.get(numElegido);
                tablero[traducirNumACoordenada[0]][traducirNumACoordenada[1]] = TresEnRaya.jugador1;
                
                //printear tablero y cambiar de jugador
                printTablero();
                turnoX = false;
                numElegido = 0;
            }
            if(!turnoX){

                //pedir numero a y 
                while(numElegido<1 || numElegido>9){
                    System.out.println("Dime que posición quieres");
                    numElegido = sc.nextInt();
                }
                
                //añadir nums usados al array
                usados[contador] = numElegido;
                contador++;
                
                //sustitución
                traducirNumACoordenada = coordenadas.get (numElegido);
                tablero[traducirNumACoordenada[0]][traducirNumACoordenada[1]] = TresEnRaya.jugador2;

                printTablero();
                turnoX = true;
                numElegido = 0;
                
                for(int i=0; i<usados.length; i++){
                    System.out.println(usados[i]);
                }
            }
        
        }
    }
    
}
