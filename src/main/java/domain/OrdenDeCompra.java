package domain;

import java.util.List;

public class OrdenDeCompra
{
	int id;
	Proveedor proveedor;
	List<Item> items;
	double total;
	Estado estado;
	public OrdenDeCompra(int id, Proveedor proveedor, List<Item> items, double total) {
		this.id = id;
		this.proveedor = proveedor;
		this.items = items;
		this.total = total;
		this.estado = Estado.INICIADA;
	}
	
}
