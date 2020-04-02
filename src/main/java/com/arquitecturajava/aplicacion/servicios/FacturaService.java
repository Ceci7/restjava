package com.arquitecturajava.aplicacion.servicios;

import java.util.List;

import com.arquitecturajava.aplicacion.bo.Factura;
import com.arquitecturajava.aplicacion.bo.Product;
import com.arquitecturajava.aplicacion.bo.Customer;
import com.arquitecturajava.aplicacion.bo.Detail;

public interface FacturaService {

	public void saveFactura(Factura factura);

	public void saveCustomer(Customer customer);
	
	public void saveProduct(Product product);

	public List<Customer> getCustomers();

	public List<Product> getProducts();
	
	public List<Factura> getFacturas();
	

}
