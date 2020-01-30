"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var product_1 = require("./product");
var DiscountProduct = /** @class */ (function (_super) {
    __extends(DiscountProduct, _super);
    function DiscountProduct(name, price, discountRate) {
        var _this = _super.call(this, name, price) || this;
        _this.discountRate = discountRate;
        return _this;
    }
    DiscountProduct.prototype.print = function () {
        _super.prototype.print.call(this);
        console.log(this.discountRate + "%");
    };
    DiscountProduct.prototype.getNetPrice = function () {
        return this.price - this.price * this.discountRate / 100;
    };
    return DiscountProduct;
}(product_1.Product));
console.log("Product and Discounted Product");
console.log("---------------------------------------------------");
var p = new product_1.Product("Redmi 5 Gold", 10999);
p.print();
var dp = new DiscountProduct("Dell Laptop i7 8th Generation", 76490, 5);
dp.print();
console.log("Net Price : " + dp.getNetPrice());
