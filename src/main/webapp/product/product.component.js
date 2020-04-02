(function (angular) {
    angular.module("facturasApp")
        .component("product", {
            templateUrl: "product/product.template.html",
            controller: Controller
        });

    Controller.$inject = ["facturaServices", "$routeParams"];

    function Controller(facturaServices, $routeParams) {
        var self = this;
    };

}(window.angular));