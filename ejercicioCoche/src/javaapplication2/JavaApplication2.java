package javaapplication2;

public class JavaApplication2 {

    public static void main(String[] args) {
      
    Coche c1 = new Coche(150, 4, true, "Citröen", 5, true);
    Moto m1 = new Moto(125, 5, true, "Vespa", 1, false);
    Conductor con1 = new Conductor("Manu", true, c1);
    
    
   System.out.println(con1.obtenerMarcaCoche());
    
   con1.tipoVehiculo = m1;
   
   System.out.println(con1.obtenerMarcaCoche());
    
    
    
    
    }
}