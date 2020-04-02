angular.module("facturasApp").config(RouteConfig);

RouteConfig.$inject = ["$locationProvider", "$routeProvider"]

function RouteConfig($locationProvider, $routeProvider) {

    $locationProvider.hashPrefix("!");

    $routeProvider
        .when("/product-list", { template: "<product-list></product-list>" })      
        .when("/customer-list", { template: "<customer-list></customer-list>" })       
        .otherwise("/product-list");

}