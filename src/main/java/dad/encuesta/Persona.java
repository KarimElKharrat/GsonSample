package dad.encuesta;

public class Persona {
	String nombre, apellidos;
	int edad;
	
	public Persona() {}
	
	public Persona(String nombre, String apellidos, int edad) {
		if(nombreValido(nombre) && nombreValido(apellidos)) {
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.edad = edad;
		} else {
			throw new RuntimeException("nombre o apellidos invalido");
		}
	}
	
	public boolean nombreValido(String str) {
		int i, result = 0;
		for(i = 0; i < str.length(); i++) {
			if(!Character.isLetter(str.charAt(i)) && str.charAt(i) != ' ') {
				result++;
			}
		}
		return result == 0;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nEdad: " + edad;
	}
}
