"use strict";
exports.__esModule = true;
var Product = /** @class */ (function () {
    function Product(name, price) {
        this.name = name;
        this.price = price;
    }
    Product.prototype.print = function () {
        console.log(this.name);
        console.log(this.price);
    };
    return Product;
}());
exports.Product = Product;
console.log("Product");
console.log("---------------------------------------------------");
var p1 = new Product("Samsung Galaxy s9", 57900);
p1.print();
