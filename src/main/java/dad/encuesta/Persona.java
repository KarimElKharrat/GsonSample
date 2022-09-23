package dad.encuesta;

public class Persona {
	String nombre, apellidos;
	int edad;
	
	public Persona() {}
	
	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nEdad: " + edad;
	}
}
