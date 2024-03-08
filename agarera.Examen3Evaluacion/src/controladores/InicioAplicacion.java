package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.ClientesDtos;
import dtos.ComprasDtos;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;

public class InicioAplicacion 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<ClientesDtos> listaClientes = new ArrayList<ClientesDtos>();
		List<ComprasDtos> listaCompras = new ArrayList<ComprasDtos>();
		
		MenuInterfaz alpha = new MenuImplementacion();
		OperativaInterfaz omega = new OperativaImplementacion();
		
		int opcionSeleccionada;
		boolean cerrarMenu = false;
		
		
		while(!cerrarMenu) 
		{
			
			opcionSeleccionada = alpha.menuYSeleccion(sc);
			
			switch(opcionSeleccionada) 
			{
			case 1:
				boolean cerrarEmpleado = false;
				int opcionEmpleado;
				
				while(!cerrarEmpleado) {
					
					opcionEmpleado = alpha.menuEmpleado(sc);
					
					switch(opcionEmpleado) {
					
					case 1:
						omega.calculoDeCompras(sc, listaCompras);
						break;
					case 2:
						omega.añadirCompra(sc, listaClientes, listaCompras);
						break;
					case 3:
						System.out.println("Menu principal");
						cerrarEmpleado = true;
						break;
						
						default:
							break;
					}
				}
				break;
			case 2:
				
				boolean cerrarGerencia = false;
				int opcionGerencia;
				
				while(!cerrarGerencia) {
					
					opcionGerencia = alpha.menuGerencia(sc);
					
					switch(opcionGerencia) {
					
					case 1:
						omega.mostrarComprasCliente(sc, listaCompras, listaClientes);
						break;
					case 2:
						omega.crearCliente(sc, listaClientes);
						break;
					case 3:
						System.out.println("Menu principal");
						cerrarGerencia = true;
						break;
						
						default:
							break;
					}
				}
				break;
			case 3:
				System.out.println("Menu Cerrado");
				cerrarMenu = true;
				break;
				
				default:
					break;
			}
		}
	}
}