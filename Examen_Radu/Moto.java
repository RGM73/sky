/**
 * Moto.java
 * Definición de la clase Moto
 * @author  Daniel Espinosa
 */
public class Moto extends Vehiculo {
    private String tipo;

    /**
     * Conctructor que crea una moto con id, km, antiguedad y tipo
     * @param Km Kilometraje de la moto
     * @param Antiguedad Años de la moto
     * @param Tipo de moto
     * @see Vehiculo
     */
    public Moto(int km, int años, String tipo){
        super(km,años);
        this.tipo = tipo;
    }

    /**
     * Conctructor que crea una moto con id, km, antiguedad y tipo
     * @param Id Id de la moto
     * @param Km Kilometraje de la moto
     * @param Antiguedad Años de la moto
     * @param Tipo de moto
     * @see Vehiculo
     */
    public Moto(String id,int km, int años, String tipo){
        super(id,km,años);
        this.tipo = tipo;
    }

    /**
     * Devuelve el tipo de moto
     * @return Tipo
     */
    public String getTipo(){
        return tipo;
    }

    /**
     * Devuelve cadena que te dice de que tipo es y que es una moto
     * @return Cadena 
     * @see Vehiculo
     */
    @Override
    public String toString (){
        return "La moto "+super.toString()+"Es una moto de tipología: " + tipo+"\n";
    }
}
