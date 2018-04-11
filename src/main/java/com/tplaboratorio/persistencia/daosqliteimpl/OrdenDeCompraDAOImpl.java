package com.tplaboratorio.persistencia.daosqliteimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.tplaboratorio.persistencia.daointerface.OrdenDeCompraDAO;
import com.tplaboratorio.persistencia.sqliteconnection.SQLiteJDBCDriverConnection;

import domain.Estado;
import domain.Item;
import domain.OrdenDeCompra;
import domain.Proveedor;

public class OrdenDeCompraDAOImpl implements OrdenDeCompraDAO
{
	private Connection conn;
	public OrdenDeCompraDAOImpl()
	{
		conn = SQLiteJDBCDriverConnection.getConnection();
	}

	@Override
	public List<OrdenDeCompra> findAll()
	{
		try {
			List<OrdenDeCompra> ordenes = new ArrayList<OrdenDeCompra>();
			PreparedStatement st = conn.prepareStatement("SELECT * FROM ORDEN_COMPRA");
			ResultSet set = st.executeQuery();
			while (set.next())
			{
				int id = set.getInt(1);
				Proveedor proveedor = null;
				List<Item> items = null;
				double total = set.getDouble(4);
				Estado estado = null;
				OrdenDeCompra orden = new OrdenDeCompra(id, proveedor, items, total, estado);
				
			}
			
			return ordenes;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean insertOrden(OrdenDeCompra orden)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateOrden(OrdenDeCompra orden)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteOrden(OrdenDeCompra orden)
	{
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
