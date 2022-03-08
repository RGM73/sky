
/**
 * Vehiculo general que se usa para crear subclases como Moto o Coche
 * @see Moto
 * @see Coche
 * @author Radu
 * @version 4/3/2022
 */
public  class Vehiculo
{
    private String id;
    private int kilometraje;
    private int antiguedad;
    /**
     * Conctructor que crea un Vehiculo con id, km, y antiguedad
     * @param Id Id del vehiculo
     * @param Km Kilometraje del Vehiculo
     * @param Antiguedad Años del vehiculo
     */
    public Vehiculo(String id,int kilometraje,int antiguedad){
        this.id=id;
        this.kilometraje=kilometraje;
        this.antiguedad=antiguedad;
    }

    /**
     * Conctructor que crea un Vehiculo con id, km, y antiguedad
     * Id vacío
     * @param Km Kilometraje del Vehiculo
     * @param Antiguedad Años del vehiculo
     */
    public Vehiculo(int kilometraje,int antiguedad){
        id="";
        this.kilometraje=kilometraje;
        this.antiguedad=antiguedad;
    }

    /**
     * Kilometraje del vehiculo
     * @return km Del vehiculo
     */
    public int getKilometraje() {
        return this.kilometraje;
    }

    /**
     * Kilometraje del vehiculo
     * 
     * @param KM Que tiene el vehiculo
     */  
    public void setKilometraje(int km) {
        this.kilometraje = km;
    }

    /**
     * Kilometraje del vehiculo
     * 
     * @param KM Que se añade a vehiculo
     */  
    public void recorre(int km) {
        this.kilometraje += km;
    }

    /**
     * El id 
     * @return id Id del Vehiculo
     */
    public String getId(){
        return id;
    }

    /**
     * El id 
     * @return antiguedad Antiguedad del Vehiculo
     */
    public int getAntiguedad(){
        return antiguedad;
    }
    /**
     * Metodo toString que sobreescribe toString de Object
     * @return Cadena Base para cualquier vehiculo
     */
    @Override
    public String toString(){
        return getId()+ " ha hecho " + getKilometraje() + " kilometros.\n"+
        "Tiene " + antiguedad + " años de antiguedad\n";
    }
}
