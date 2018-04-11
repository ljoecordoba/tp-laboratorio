package com.tplaboratorio.persistencia.daointerface;

import java.util.List;

import domain.OrdenDeCompra;

public interface OrdenDeCompraDAO
{
	public List<OrdenDeCompra> findAll();
	boolean insertOrden(OrdenDeCompra orden);
	boolean updateOrden(OrdenDeCompra orden);
	boolean deleteOrden(OrdenDeCompra orden);	
}
