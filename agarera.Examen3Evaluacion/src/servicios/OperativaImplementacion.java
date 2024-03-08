package servicios;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import dtos.ClientesDtos;
import dtos.ComprasDtos;

public class OperativaImplementacion implements OperativaInterfaz{

	public void crearCliente(Scanner sc, List<ClientesDtos> listaCliente) {
		
		boolean cerrarCliente = false;
		
		do {
			
			ClientesDtos nuevoCliente = new ClientesDtos();
			
			System.out.println("Escriba su nombre:");
			nuevoCliente.setNombreCliente(sc.next());
			
			System.out.println("Escriba su apellido:");
			nuevoCliente.setApellidoCliente(sc.next());
			
			int idCliente = calculoIdCliente(listaCliente);
			nuevoCliente.setIdCliente(idCliente);
			
			listaCliente.add(nuevoCliente);
			
			System.out.println("¿Quiere seguir registrando clientes?. Seleccione s o n");
			if (sc.next().equals("n")) {
				
				cerrarCliente = true;
			}
			
		}while(!cerrarCliente);
	}
	
	private int calculoIdCliente(List<ClientesDtos> listaClientes) {
		
		int idCliente = 0;
		
		for(ClientesDtos calcularId : listaClientes) {
			
			idCliente = idCliente + 1;
		}
		return idCliente;
	}
	
	public void añadirCompra(Scanner sc, List<ClientesDtos> listaClientes, List<ComprasDtos> listaCompras) {
		
		ComprasDtos nuevaCompra = new ComprasDtos();
		
		System.out.println("Escriba el importe de la compra:");
		int importeCliente = sc.nextInt();
		System.out.println("Escriba el id del clienta al cual va a añadir el importe de la compra");
		
		for(ClientesDtos mostrarClientes : listaClientes) {
			
			System.out.print("Id cliente: " + mostrarClientes.getIdCliente() + "\n");
			System.out.print("Nombre Cliente: " + mostrarClientes.getNombreCliente() + "\n");
		}
		
		for(ClientesDtos busquedaIdClientes : listaClientes) 
		{
			if(sc.next().equals(busquedaIdClientes.getIdCliente())){
				
				nuevaCompra.setImporteCompra(importeCliente);
			}
		}
		
		int idCompra = calculoIdCliente(listaClientes);
	    nuevaCompra.setIdCompra(idCompra);
	    
	    LocalDate fechaImporte = LocalDate.now();
	    nuevaCompra.setFechaCompraDate(fechaImporte);
	    
	   listaCompras.add(nuevaCompra);
		
	}
	
	
	
	public void calculoDeCompras(Scanner sc, List<ComprasDtos> listaCompras) {
		
		System.out.println("Escriba la fecha para poder calcular la compra con formato dd-MM-yyyy");
		String fechaString = sc.next();

		int importeCompra = 0;
		
		for (ComprasDtos buscarCompras : listaCompras) {
			
			if(fechaString.equals(buscarCompras.getFechaCompraDate())) {
				
				importeCompra = buscarCompras.getImporteCompra() + importeCompra;
			}
		}
		System.out.println("El importe de compra de este mes ha sido de: " + importeCompra);
		
	}
	
	public void mostrarComprasCliente(Scanner sc, List<ComprasDtos> listaCompras, List<ClientesDtos> listaClientes) {
		
		for(ClientesDtos mostrarClientes : listaClientes) {
			
			System.out.print("Id cliente: " + mostrarClientes.getIdCliente() + "\n");
			System.out.print("Nombre Cliente: " + mostrarClientes.getNombreCliente() + "\n");
		}
		
		System.out.println("Escriba el id del cliente para generar formulario de compras");
		for(ComprasDtos buscarCompras : listaCompras){
			
			for(ClientesDtos mostrarClientes : listaClientes){
				
				if(sc.next().equals(mostrarClientes.getIdCliente())){
					
					System.out.print("Venta numero: " + buscarCompras.getIdCompra());
					System.out.print("Euros: " + buscarCompras.getImporteCompra() + "euros");
					System.out.print("Instante compra: " + buscarCompras.getFechaCompraDate());
				}
		    }
	     }	
	}
}


