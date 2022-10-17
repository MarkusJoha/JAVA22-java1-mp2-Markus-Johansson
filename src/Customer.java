class Customer {

   private double totalPrice;
   private int amountOfProduct;

    Customer(double totalPrice, int amountOfProduct) {
        this.totalPrice = totalPrice;
        this.amountOfProduct = amountOfProduct;
    }

    double getTotalPrice() {
        return totalPrice;
    }

    void setTotalPrice(double price) {
        totalPrice += price;
    }

   int getAmountOfProduct() {
        return amountOfProduct;
    }

    void setAmountOfProduct(){
        amountOfProduct++;
    }
}
