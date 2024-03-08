package dtos;

import java.time.LocalDate;

public class ComprasDtos {

	int importeCompra;
	int idCompra;
	LocalDate fechaCompraDate;
	
	public int getImporteCompra() {
		return importeCompra;
	}
	public void setImporteCompra(int importeCompra) {
		this.importeCompra = importeCompra;
	}
	public int getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}
	public LocalDate getFechaCompraDate() {
		return fechaCompraDate;
	}
	public void setFechaCompraDate(LocalDate fechaCompraDate) {
		this.fechaCompraDate = fechaCompraDate;
	}
	
	public ComprasDtos() {
		
	}
	
	public ComprasDtos(int importeCompra, int idCompra, LocalDate fechaCompraDate) {
		
		this.importeCompra = importeCompra;
		this.idCompra = importeCompra;
		this.fechaCompraDate = fechaCompraDate;
	}
}
