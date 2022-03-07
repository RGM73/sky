package semaforo;
public class Estudiante extends Persona{
	// Incluye un metodo de clase que se une a los heredados
	int i_Curso;
    	public Estudiante() {
		i_Edad=20;
		s_Nombre = "Radu Gabriel Maria";
		i_Curso = 1;
	}
	public void presentarse(){
	System.out.println("Soy " + s_Nombre + " Alumno de " + Integer.toString(i_Curso) + " y 	tengo una edad de: " + Integer.toString(i_Edad));	
    	}
	public String preguntacolor(){
		presentarse();
		Ordenador mipc = new Ordenador();
        	return mipc.color();
    	}
        public void hi(){
            System.out.println("Hello");
        }
                
}
