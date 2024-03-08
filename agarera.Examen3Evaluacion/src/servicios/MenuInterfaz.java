package servicios;

import java.util.Scanner;

public interface MenuInterfaz {

	/*
	 * Metodo que muestra por pantalla el menu principal
	 * agb - 08/03/2024
	 */
	public int menuYSeleccion(Scanner sc);
	/*
	 * Metodo que muestra por pantalla el menu empleados
	 * agb - 08/03/2024
	 */
	public int menuEmpleado(Scanner sc);
	/*
	 * Metodo que muestra por pantalla el menu gerencias
	 * agb - 08/03/2024
	 */
	public int menuGerencia(Scanner sc);
	
	}
