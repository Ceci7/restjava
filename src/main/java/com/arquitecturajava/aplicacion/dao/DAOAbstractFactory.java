package com.arquitecturajava.aplicacion.dao;

public class DAOAbstractFactory {

	public static DAOFactory getInstance() {
		
		return new DAOJPAFactory();
		
	}

}
