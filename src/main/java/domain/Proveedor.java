package domain;

import java.util.List;

public class Proveedor
{
	String cuit;
	String nombre;
	Domicilio domicilio;
	List<Insumo> insumos;
	public Proveedor(String cuit, String nombre, Domicilio domicilio, List<Insumo> insumos) {
		super();
		this.cuit = cuit;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.insumos = insumos;
	}
	
}
