(function (angular) {
    angular.module("facturasApp")
        .component("products", {
            templateUrl: "products/products.template.html",
            controller: ProductCtrl
        });

    ProductCtrl.$inject = ["facturaServices", "$routeParams"];

    function ProductCtrl(facturaServices, $routeParams) {
        var self = this;
        self.title = "Products";
        facturaServices.getProducts()
            .then(function (products) {
                self.products = products
            });
       
    };
}(window.angular));