package juegoahorcado;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class JuegoAhorcado {
    public static void main(String[] args) {
        
        //Declarar variables
        Scanner sc = new Scanner (System.in);
        Scanner sc2  = new Scanner (System.in);
        Scanner scInt = new Scanner (System.in);
        Random random = new Random();
  
        
        String jugar = "si";
        
        do{
            int vidas = 5; 
            int numero = 0;
            String [] listaPalabras;
            int version = 0;
            String palabra = " ";
            
            System.out.println("""
                               BIENVENIDO AL AHORCADO 
                               
                               Elige modo de juego:
                               Pulsa 1 = Elegir tu la palabra
                               Pulsa 2 = Palabra aleatoria
                               """);
            
            while(version < 1 || version > 2){
            System.out.println("Elige modo: 1 o 2");
            version = scInt.nextInt();
            }
            
            if(version == 1){
                System.out.println("Dime la palabra a adivinar");
                palabra = sc.nextLine().toLowerCase();
                
            }else {
                //Explicación + pedir el nivel
                System.out.println("""
                     ¿A que nivel te gustaria jugar? 

                     Nivel facil = 1
                     Nivel medio = 2
                     Nivel dificil = 3
                                   """);
                
                while(numero < 1 || numero > 3){
                System.out.println("Dime el nivel: 1, 2 o 3");
                numero = scInt.nextInt();
                }
            
            
                //Elección de las palabras según el nivel que diga el usuario
                switch(numero){
                    case 1:
                        listaPalabras = new String[]{"gato", "vaso", "mesa", "saco"};
                        break;
                    case 2:
                        listaPalabras = new String[]{"amigos", "camisa", "ciudad", "cometa"};
                        break;
                    case 3:
                        listaPalabras = new String[]{"murcielago", "extraterrestre", "xilofono", "biotecnologia"};
                        break;    

                    default:
                        listaPalabras = new String[]{"gato"};
             }

                //Elegir una palabra aleatoria del nivel seleccionado
                int indice = random.nextInt(listaPalabras.length);
                palabra = listaPalabras[indice];
            }
            
            

            //Convertimos la palabra en un Array y la metemos en otra variable        
            char [] aAdivinar = palabra.toCharArray();

            //Creamos un segundo array con la longitud de la palabra seleccionada.2
           
            char[] huecos = new char[palabra.length()];

            //Asignamos "_" a cada hueco
             for(int i=0; i<palabra.length(); i++){
                huecos [i] = '_';
                }

            //El juego como tal:      
            while (vidas > 0 && !Arrays.equals(huecos, aAdivinar)){


                System.out.println("Dime una letra:");
                char letra = sc.next().toLowerCase().charAt(0);
                
                System.out.println();
                boolean acierto = false;



                //Ponemos la letra en el hueco que le corresponde
                for(int j=0; j<palabra.length(); j++){
                    if(letra == aAdivinar[j]){
                        huecos[j] = letra;
                        acierto = true;
                    }
                }


                if(!acierto){
                    vidas--;
                    System.out.println("Fallaste!");
                    } else {
                        System.out.println("Acertaste!");
                    }



                System.out.println("***********");
                System.out.println("Vidas: " + vidas);
             
                

                //Imprimimos la palabra actualizada con las letras colocdas anteriormente
                for(int k =0; k<palabra.length(); k++){
                    System.out.print(huecos[k] +" ");
                }



                System.out.println();
                System.out.println();
            }

            if(vidas>0){
                System.out.println("Has ganado!");

            } else{
                System.out.println("Has perdido :(");

            }
            
            System.out.println();
            
            //Preguntar si quiere volver a jugar
            
            System.out.println("Quieres jugar otra vez? SI / NO");
            jugar = sc2.next();
            
            while(!jugar.equals("si") && !jugar.equals("no")){
                System.out.println("Quieres jugar otra vez? SI / NO");
                jugar = sc2.next().toLowerCase();
            }
            
            System.out.println();
            
        }while(jugar.equals("si") );
        
  }     
}
         

