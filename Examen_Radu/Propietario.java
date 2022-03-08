import java.util.ArrayList;

/**
 * Clase que se usa para almacenar por medio de un ArrayList los vehiculos que se tiene.
 * @author  Daniel Espinosa
 * @author Radu
 * @version 4/3/2022
 */
public class Propietario
{
    private ArrayList<Vehiculo> vehiculos;
    /**
     * Constructor para propietario 
     * Iniciamos la lista
     */
    public Propietario()
    {
        vehiculos=new ArrayList<Vehiculo>();
    }

    /**
     * Se añade el Vehiculo 
     * @param Vehiuculo A añadir a la lista
     */
    public void comprarVehiculo(Vehiculo VH){
        vehiculos.add(VH);
    }

    /**
     * Comprueba las 3 primeras letras en mayuscula o minuscula con el id del coche
     * Añade los km a los que ya se tenían 
     * @param Id del coche
     * @param km del coche
     */
    public void correrCoche(String id, int km){
        //ESTE MÉTODO RECORRE LA LISTA DE COCHES EN BUSCA DEL QUE TENGA LA ID
        //SE DEBERÁ COMPARAR LA ID INTRODUCIDAD CON LA ID DEL COCHE
        //PARA ELLO ES POSIBLE QUE HAYA QUE CONSEGUIR UNA MANERA DE ACCEDER
        //LA COMPARACIÓN ENTRE LA ID Y LA ID INTRODUCIDA SERÁ PERFECTA SI:
        //SE COMPARAN SÓLAMENTE LAS 3 PRIMERAS LETRAS DE LA CADENA
        //PARA ELLO CONTÁIS CON LA DOCUMENTACIÓN DE LA CLASE STRING
        //EL EJERCICIO ESTARÁ PARCIAL SI SE COMPARA TODA LA CADENA
        for(Vehiculo VH:vehiculos){
            if(VH instanceof Coche){
                if(VH.getId().regionMatches(true,0,id,0, 3)){
                    VH.setKilometraje(VH.getKilometraje()+km);
                }
            }
        }
        //UNA VEZ SE HAYA ENCONTRADO EL COCHE SE SUMARÁN LOS KM PASADOS
    }
    
    /**
     * Comprueba las 3 primeras letras en mayuscula o minuscula con el id de la moto
     * Añade los km a los que ya se tenían 
     * @param Id de la moto
     * @param km de la moto
     */
    public void correrMoto(String id, int km){
        //ESTE MÉTODO RECORRE LA LISTA DE MOTOS EN BUSCA DE LA QUE TENGA LA ID
        //SE DEBERÁ COMPARAR LA ID INTRODUCIDAD CON LA ID DE LA MOTO
        //PARA ELLO ES POSIBLE QUE HAYA QUE CONSEGUIR UNA MANERA DE ACCEDER
        //LA COMPARACIÓN ENTRE LA ID Y LA ID INTRODUCIDA SERÁ PERFECTA SI:
        //SE COMPARAN SÓLAMENTE LAS 3 PRIMERAS LETRAS DE LA CADENA
        //PARA ELLO CONTÁIS CON LA DOCUMENTACIÓN DE LA CLASE STRING
        //EL EJERCICIO ESTARÁ PARCIAL SI SE COMPARA TODA LA CADENA
        for(Vehiculo VH:vehiculos){
            if(VH instanceof Moto){
                if(VH.getId().regionMatches(true,0,id,0, 3)){
                    VH.setKilometraje(VH.getKilometraje()+km);
                }
            }
        }
        //UNA VEZ SE HAYA ENCONTRADO EL COCHE SE SUMARÁN LOS KM PASADOS
    }
    
    /**
     * Compreba todos los vehiculos 
     * Devuelve el que tenga más antiguedad
     * @return Vehiculo mas viejo
     */
    public Vehiculo masViejo(){
        Vehiculo VH=new Vehiculo("",0,0);
        for(Vehiculo VH1:vehiculos){
            if(VH1.getAntiguedad()>=VH.getAntiguedad()){
                VH=VH1;
            }
        }
        return VH;
    }

    /**
     * Calcula la media de km
     * @return Media de Km de los vehiculos
     */
    public double mediaKm (){
        //ESTE MÉTODO DEVOLVERÁ LA MEDIA DE LOS KILÓMETROS RECORRIDOS
        //SE CARGARÁ EL TOTAL DE KILÓMETROS RECORRIDOS Y SE DIVIDIRÁ
        //EL NÚMERO DE VEHÍCULOS SE PUEDE OBTENER DE DIVERSAS MANERAS
        double suma=0;
        for(Vehiculo VH:vehiculos){
            suma=suma+VH.getKilometraje();
        }
        return suma/vehiculos.size();
    }

    /**
     * Muestra los vehiculos diferenciando enre coches y motos
     */
    public void mostrarVehiculos(){
        System.out.println("\tDescripción Coches:\n");
        for(Vehiculo VH:vehiculos)
            if(VH instanceof Coche)
                System.out.println(VH.toString());
        System.out.println("\n\tDescripción Motos:\n");    
        for(Vehiculo VH:vehiculos)
            if(VH instanceof Moto)
                System.out.println(VH.toString());    
    }
}
