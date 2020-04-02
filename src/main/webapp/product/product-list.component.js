(function (angular) {
    angular.module("facturasApp")
        .component("productList", {
            templateUrl: "product/product-list.template.html",
            controller: Controller
        });

    Controller.$inject = ["facturaServices", "$routeParams"];

    function Controller(facturaServices, $routeParams) {
        var self = this;
        self.title = "Products";
        facturaServices.getProducts()
            .then(function (products) {
                self.products = products
            });

    };
}(window.angular));