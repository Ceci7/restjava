package com.arquitecturajava.aplicacion.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.arquitecturajava.aplicacion.bo.Customer;
import com.arquitecturajava.aplicacion.bo.Factura;
import com.arquitecturajava.aplicacion.bo.Product;
import com.arquitecturajava.aplicacion.dto.ProductDTO;
import com.arquitecturajava.aplicacion.servicios.FacturaService;
import com.arquitecturajava.aplicacion.servicios.impl.FacturaServiceImpl;

@Path("api")
public class FacturaRest {

	private FacturaService service;

	public FacturaRest() {
		this.service = new FacturaServiceImpl();
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getTestService() {
		return "Hello World! This is coming from webservice!!";
	}

	@Path("/product")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProducts() {
		List<Product> products = service.getProducts();
		
		ProductDTO obj = new ProductDTO();
		
		List<ProductDTO> collect = new ArrayList<ProductDTO>();
		for(Product x:products) {
			obj = new ProductDTO();
			obj.setId(x.getId());
			obj.setDescription(x.getDescription());
			obj.setPurchasePrice(x.getPurchasePrice());
			obj.setRetailPrice(x.getRetailPrice());
			obj.setSalePrice(x.getSalePrice());
			obj.setStock(x.getStock());
			obj.setName(x.getName());
			collect.add(obj);
		}

		

		return Response.ok(collect).build();
	}

	@Path("/product")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response saveProduct(Product product) {
		service.saveProduct(product);
		return Response.ok().build();
	}

	@Path("/customer")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getCustomers() {
		return Response.ok(service.getCustomers()).build();
	}

	@Path("/customer")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response saveCustomer(Customer customer) {
		service.saveCustomer(customer);
		return Response.ok().build();
	}

	@Path("/factura")
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getFacturas() {
		return Response.ok(service.getFacturas()).build();
	}

	@Path("/factura")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response saveCustomer(Factura factura) {
		service.saveFactura(factura);
		return Response.ok().build();
	}

}
