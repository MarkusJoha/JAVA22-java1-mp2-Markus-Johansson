class ReducedProduct extends Product {
    private double discount;

    ReducedProduct(double discount, String name, double price, int stock) {
        super(name, price, stock);
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        return super.getPrice()*discount;
    }

    void getDiscount(){

   }
}
