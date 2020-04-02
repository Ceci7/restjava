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
        self.product = {};



        self.getProducts = () => {

            facturaServices.getProducts()
                .then(function (response) {
                    self.products = response.data;
                });

        }

        self.getProducts();


        self.saveProduct = () => {
            facturaServices
                .saveProduct(self.product)
                .then(function () {
                    self.product = {};
                    self.getProducts();
                });
        }

    };
}(window.angular));