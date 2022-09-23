package dad.persona;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Encuesta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Persona p;
		
		String nombre, apellidos;
		int edad;
		
		System.out.print("Nombre: ");
		nombre = entrada.nextLine();
		System.out.print("Apellidos: ");
		apellidos = entrada.nextLine();
		System.out.print("Edad: ");
		edad = Integer.parseInt(entrada.nextLine());

		p = new Persona(nombre, apellidos, edad);
		
		String json = gson.toJson(p);
		System.out.println(json);
		
		
		entrada.close();
	}

}
