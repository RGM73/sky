
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PropietarioTest.
 *
 * @author  Radu
 * @version 4/3/2022
 */
public class PropietarioTest
{
    private Coche coche1;
    private Coche coche2;
    private Moto moto1;
    private Moto moto2;
    private Moto moto3;
    private Propietario propieta1;

    /**
     * Default constructor for test class PropietarioTest
     */
    public PropietarioTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        coche1 = new Coche("AAA", 10, 1, 4);
        coche2 = new Coche("BBB", 50, 2, 2);
        moto1 = new Moto(70, 2, "Deportiva");
        moto2 = new Moto(45, 5, "Vespa");
        moto3 = new Moto("CCC",120, 3, "GP");
        propieta1 = new Propietario();
        propieta1.comprarVehiculo(coche1);
        propieta1.comprarVehiculo(coche2);
        propieta1.comprarVehiculo(moto1);
        propieta1.comprarVehiculo(moto2);
        propieta1.comprarVehiculo(moto3);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void mostrar()
    {
        propieta1.mostrarVehiculos();
    }
    
    @Test
    public void Viejo()
    {
        System.out.println("La moto más antigua es: ");
        System.out.println(propieta1.masViejo().toString());
    }

    @Test
    public void CorreCoche()
    {
        propieta1.correrCoche("BBB", 15);
        propieta1.mostrarVehiculos();
    }
    
    @Test
    public void CorreMoto()
    {
        propieta1.correrMoto("CCC", 12);
        propieta1.mostrarVehiculos();
    }
}


