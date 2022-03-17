package kodlamaIO.DayTwo.oopIntro;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1,"macbook",15000,"8gb M1"); // referance creation
        Product product2 = new Product(2,"asus",9000,"8gb ram"); // referance creation
        Product product3 = new Product(3,"acer",17000,"16gb ram"); // referance creation
        Product[] products = {product1,product2,product3};
        for (Product product:products) {
            System.out.println("id: "+product.id);
            System.out.println("name: "+product.name);
            System.out.println("detail: "+product.detail);
            System.out.println("unitPrice: "+product.unitPrice);
            System.out.println();
        }
        System.out.println("length: "+products.length);

        Category category1 = new Category();
        category1.id = 1;
        category1.name = "tasarım";

        Category category2 = new Category();
        category2.id = 2;
        category2.name = "Bilgisayar";
        ProductManager productManager = new ProductManager();
        productManager.addToCart();



    }
}
