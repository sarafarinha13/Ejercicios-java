package javaapplication2;

public class Conductor {
    
     String nombre;
     boolean carnet;
     Vehiculo tipoVehiculo;
    
    
    public Conductor(String nombre, boolean carnet, Vehiculo tipoVehiculo){
        this.nombre = nombre;
        this.carnet = carnet;
        this.tipoVehiculo = tipoVehiculo;
}
  
    public String obtenerMarcaCoche(){
        return tipoVehiculo.getMarca();
    }
}
