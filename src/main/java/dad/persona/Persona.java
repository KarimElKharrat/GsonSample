package dad.persona;

public class Persona {
	String nombre, apellidos;
	int edad;
	
	public Persona() {}
	
	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nEdad: " + edad;
	}
}
