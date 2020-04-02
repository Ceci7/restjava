(function (angular) {
    angular.module("facturasApp")
        .component("customerList", {
            templateUrl: "customer/customer-list.template.html",
            controller: Controller
        });

    Controller.$inject = ["facturaServices", "$routeParams"];

    function Controller(facturaServices, $routeParams) {
        var self = this;
        self.title = "Clientes";
        self.customer = {};



        self.getCustomers = () => {

            facturaServices.getCustomers()
                .then(function (response) {
                    self.customers = response.data;
                });

        }

        self.getCustomers();


        self.saveCustomer = () => {
            facturaServices
                .saveCustomer(self.customer)
                .then(function () {
                    self.customer = {};
                    self.getCustomers();
                });
        }

    };
}(window.angular));