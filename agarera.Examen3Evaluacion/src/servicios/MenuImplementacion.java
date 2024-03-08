package servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	public int menuYSeleccion(Scanner sc) {
		
		System.out.println("-------------------");
		System.out.println("|1. Menú empleado |");
		System.out.println("|2. Menú gerencia |");
		System.out.println("|3. Cerrar menu   |");
		System.out.println("-------------------");
		
		int opcion = sc.nextInt();
		
		return opcion;
	}
	
	public int menuEmpleado(Scanner sc) {
		
		System.out.println("-------------------------------------");
		System.out.println("|1. Cálculo total de ventas mensual |");
		System.out.println("|2. Añadir compra a un cliente      |");
		System.out.println("|3. Volver al menu principal        |");
		System.out.println("-------------------------------------");
		
		int opcion = sc.nextInt();
		
		return opcion;
	}
	
	public int menuGerencia(Scanner sc) {
		
		System.out.println("---------------------------------------------");
		System.out.println("|1. Mostrar todas las compras de un cliente |");
		System.out.println("|2. Crear un nuevo cliente                  |");
		System.out.println("|3. Volver al menu principal                |");
		System.out.println("---------------------------------------------");
		
		int opcion = sc.nextInt();
		
		return opcion;
	}
}
