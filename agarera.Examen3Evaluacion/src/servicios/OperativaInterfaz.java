package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.ClientesDtos;
import dtos.ComprasDtos;

public interface OperativaInterfaz {

	/*
	 * Metodo que crea un Cliente nuevo
	 * agb - 08/03/2024
	 */
	public void crearCliente(Scanner sc, List<ClientesDtos> listaCliente);
	
	/*
	 * Metodo que crea un Cliente nuevo
	 * agb - 08/03/2024
	 */
	public void añadirCompra(Scanner sc, List<ClientesDtos> listaClientes, List<ComprasDtos> listaCompras);
	
	/*
	 * Metodo que calcula todas las compras mensual
	 * agb - 08/03/2024
	 */
	public void calculoDeCompras(Scanner sc, List<ComprasDtos> listaCompras);
	
	/*
	 * Metodo que muestra todas las compras del cliente
	 * agb - 08/03/2024
	 */
	public void mostrarComprasCliente(Scanner sc, List<ComprasDtos> listaCompras, List<ClientesDtos> listaClientes);
}
