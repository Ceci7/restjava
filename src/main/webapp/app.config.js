angular.module("facturasApp").config(RouteConfig);

RouteConfig.$inject = ["$locationProvider", "$routeProvider"]

function RouteConfig($locationProvider, $routeProvider) {

    $locationProvider.hashPrefix("!");
    $routeProvider        
        .when("/products", { template: "<products></products>" })
        .when("/customers", { template: "<customers></customers>" })
        .otherwise("/products");

}