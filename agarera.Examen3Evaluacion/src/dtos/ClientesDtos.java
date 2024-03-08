package dtos;

public class ClientesDtos {

	String nombreCliente;
	String apellidoCliente;
	int idCliente;
	
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidoCliente() {
		return apellidoCliente;
	}
	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	
	public ClientesDtos() {
		
	}
	
    public ClientesDtos(String nombreCLiente, String apellidoCliente, int idCliente) {
		
    	this.nombreCliente = nombreCLiente;
    	this.apellidoCliente = apellidoCliente;
    	this.idCliente = idCliente;
    	
    }
}
