package com.arquitecturajava.aplicacion.dao;

import com.arquitecturajava.aplicacion.dao.jpa.FacturaDAOJPAImpl;
import com.arquitecturajava.aplicacion.dao.jpa.ProductDAOJPAImpl;
import com.arquitecturajava.aplicacion.dao.jpa.CustomerDAOJAPImpl;
import com.arquitecturajava.aplicacion.dao.jpa.DetailDAOJPAImpl;

public class DAOJPAFactory implements DAOFactory {

	public FacturaDAO getFacturaDAO() {
		return new FacturaDAOJPAImpl();
	}

	public DetailDAO getDetailDAO() {
		return new DetailDAOJPAImpl();
	}
	
	public CustomerDAO getCustomerDAO() {
		return new CustomerDAOJAPImpl();
	}
	
	public ProductDAO getProductDAO() {
		return new ProductDAOJPAImpl();
	}
}
