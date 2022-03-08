/**
 * Objeto coche que tiene diferentes campos heredados de Vehiculo
 * @see Vehiculo
 * @author  Daniel Espinosa
 * @author  Radu
 * @version 4/3/2022
 */
public class Coche extends Vehiculo {
    private int puertas;
    /**
     * Conctructor que crea un coche con id, km, antiguedad,puertas
     * @param Id Id del coche
     * @param Km Kilometraje del coche
     * @param Antiguedad Años del coche
     * @param Puertas del  coche
     * @see Vehiculo
     */
    public Coche(String id, int km, int años, int puertas){
        super(id,km,años);
        this.puertas = puertas;
    }

    /**
     * Devuelve cadena que te dice cantidad de puertas y que es un coche
     * @return Cadena 
     * @see Vehiculo
     */
    @Override
    public String toString (){
        String cadena = "El coche ";
        cadena+=super.toString();
        if (puertas <= 3)
            cadena += "Es un coche dinámico";
        else
            cadena += "Es un coche cómodo, tiene 5 puertas";
        return cadena+"\n";
    }
}