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
            return $http.put('rest/api/product',product);
		}
		
		this.saveCustomer = (customer) => {
            return $http.put('rest/api/customer',customer);
		}
		
		this.saveFactura = (factura) => {
            return $http.put('rest/api/factura',factura);
        }
	}
}(window.angular));