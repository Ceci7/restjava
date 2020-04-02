package com.arquitecturajava.aplicacion.dao;

public interface DAOFactory {

	public FacturaDAO getFacturaDAO();

	public DetailDAO getDetailDAO();
	
	public ProductDAO getProductDAO();
	
	public CustomerDAO getCustomerDAO();
}
