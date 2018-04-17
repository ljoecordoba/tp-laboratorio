package preconfiguracion;

import java.util.List;

import domain.OrdenDeCompra;

public class ListaInsumosSingletone
{
	List<OrdenDeCompra> ordenes;
	private static ListaInsumosSingletone instance;
	private ListaInsumosSingletone()
	{
		OrdenesLoader ordLoader = new OrdenesLoader();
		ordenes = ordLoader.getOrdenes();
	}
	
	public ListaInsumosSingletone getInstance()
	{
		if (instance == null) {
			instance = new ListaInsumosSingletone();
			return instance;
		}
		else {
			return instance;
		}
	}
}
