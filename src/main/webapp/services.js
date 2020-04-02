(function (angular) {
	'use strict';
	var app = angular.module('facturasApp');

	app.service('facturaServices', ['$http', '$q', Services]);

	function Services($http, $q) {

		this.getProducts = () => {
            return $http.get('rest/api/product');
		}
		
		this.getCustomers = () => {
            return $http.get('rest/api/customer');
		}
		
		this.getFacturas = () => {
            return $http.get('rest/api/factura');
		}
		
		this.saveProduct = (product) => {
            return $http.post('rest/api/product',product);
		}
		
		this.saveCustomer = (customer) => {
            return $http.post('rest/api/customer',customer);
		}
		
		this.saveFactura = (factura) => {
            return $http.post('rest/api/factura',factura);
        }
	}
}(window.angular));