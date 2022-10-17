class Product {
   private final String productName;
   private double price;
   private int stock;

   Product(String productName, double price, int stock) {
       this.productName = productName;
       this.price = price;
       this.stock = stock;
   }

   int getStock() {

       return stock;
   }

   void setStock(int stock){
       this.stock = --stock;
   }

    public double getPrice() {
        return price;
    }

    String getProductName() {
       return productName;
    }

    public String toString() {
       return getProductName() + ", " + getPrice() + "£, " + getStock() + " left in stock";
   }

}
