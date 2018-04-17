package domain;

public class Item
{
	Insumo insumo;
	int cantidad;
	double subtotal;
	public Item(Insumo insumo, int cantidad, double subtotal) {
		super();
		this.insumo = insumo;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
	}
	
}
