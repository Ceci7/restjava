angular.module("facturasApp").config(RouteConfig);

RouteConfig.$inject = ["$locationProvider", "$routeProvider"]

function RouteConfig($locationProvider, $routeProvider) {

    $locationProvider.hashPrefix("!");

    $routeProvider
        .when("/product-list", { template: "<product-list></product-list>" })
        .when("/product", { template: "<product></product>" })
        .when("/customer-list", { template: "<customer-list></customer-list>" })
        .when("/customer", { template: "<customer></customer>" })
        .otherwise("/product-list");

}