import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);

        Product firstProduct = new Product("Apple", 1.39, 13);
        Product secondProduct = new Product("Pineapple", 1.65, 15);
        ReducedProduct reducedProduct = new ReducedProduct(0.50, "Banana", 12.50, 24);
        Customer customer = new Customer(0, 0);

        while (true) {

            System.out.println("1. " + firstProduct);
            System.out.println("2. " + secondProduct);
            System.out.println("3. " + reducedProduct);
            System.out.println("4. Quit");

            System.out.println("Make a purchase: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    if (firstProduct.getStock() > 0) {
                        firstProduct.setStock(firstProduct.getStock());
                        System.out.println("You chose an apple.");
                        customer.setTotalPrice(firstProduct.getPrice());
                        customer.setAmountOfProduct();
                    }
                    else {
                        System.out.println("Sold out!");
                    }

                    break;

                case 2:
                    if (secondProduct.getStock() > 0) {
                        secondProduct.setStock(secondProduct.getStock());
                        System.out.println("You chose a pineapple.");
                        customer.setTotalPrice(secondProduct.getPrice());
                        customer.setAmountOfProduct();
                    }

                    else {
                        System.out.println("Sold out!");
                    }
                    break;

                case 3:
                    if (reducedProduct.getStock() > 0 ) {
                        reducedProduct.setStock(reducedProduct.getStock());
                        System.out.println("You chose a banana.");
                        customer.setTotalPrice(reducedProduct.getPrice());
                        customer.setAmountOfProduct();
                    }
                    else {
                        System.out.println("Sold out!");
                    }
                    break;

                case 4:
                    System.out.println("Goodbye, you bought: " + customer.getAmountOfProduct() + " products and your total price is: " + customer.getTotalPrice() + ". Have a great day!");
                    System.exit(0);

                default:
                    System.out.println("Choose a number between 1 and 4");

            }


        }
    }
}