package domain;

public class Proveedor
{
	String cuit;
	String nombre;
	Domicilio domicilio;
	public Proveedor(String cuit, String nombre, Domicilio domicilio) {
		super();
		this.cuit = cuit;
		this.nombre = nombre;
		this.domicilio = domicilio;
	}
	
}
