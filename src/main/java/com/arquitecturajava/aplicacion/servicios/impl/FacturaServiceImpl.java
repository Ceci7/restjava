package com.arquitecturajava.aplicacion.servicios.impl;

import java.util.List;

import com.arquitecturajava.aplicacion.bo.Factura;
import com.arquitecturajava.aplicacion.bo.Product;
import com.arquitecturajava.aplicacion.bo.Customer;
import com.arquitecturajava.aplicacion.dao.FacturaDAO;
import com.arquitecturajava.aplicacion.dao.ProductDAO;
import com.arquitecturajava.aplicacion.dao.CustomerDAO;
import com.arquitecturajava.aplicacion.dao.DAOAbstractFactory;
import com.arquitecturajava.aplicacion.dao.DAOFactory;
import com.arquitecturajava.aplicacion.servicios.FacturaService;

public class FacturaServiceImpl implements FacturaService {

	private FacturaDAO facturaDAO;
	private CustomerDAO customerDAO;
	private ProductDAO productDAO;

	public FacturaServiceImpl() {
		DAOFactory factoria = DAOAbstractFactory.getInstance();
		facturaDAO = factoria.getFacturaDAO();		
		customerDAO = factoria.getCustomerDAO();
		productDAO = factoria.getProductDAO();
				
	}

	public void saveFactura(Factura factura) {
		facturaDAO.salvar(factura);
	}

	public void saveCustomer(Customer customer) {
		customerDAO.salvar(customer);
	}
	
	public void saveProduct(Product product) {
		productDAO.salvar(product);
	}

	public List<Factura> getFacturas() {
		return facturaDAO.buscarTodos();
	}

	public List<Customer> getCustomers() {
		return customerDAO.buscarTodos();
	}

	public List<Product> getProducts() {
		return productDAO.buscarTodos();
	}
	

}
