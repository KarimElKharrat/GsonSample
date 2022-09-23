package dad.persona;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Encuesta {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		Persona p = new Persona();
		
		System.out.print("Nombre: ");
		p.setNombre(entrada.nextLine());
		System.out.print("Apellidos: ");
		p.setApellidos(entrada.nextLine());
		System.out.print("Edad: ");
		p.setEdad(Integer.parseInt(entrada.nextLine()));

		
		String json = gson.toJson(p);
		System.out.println(json);
		
		
		entrada.close();
	}

}
