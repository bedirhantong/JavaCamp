package kodlamaIO.DayTwo.oopIntro;
/*
 When u click any prodyct on amazon, you will see that
 there is too many attribute of product that shows up to you
 I mean the amount of sales,unit price,detail of product, name of the product, photo of product vs.
 */
public class Product {
    public Product(){
        System.out.println("oluştum");
    }
    public Product(int id,String name,double unitPrice,String detail){
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
    }
    /*
    There may exist too many product with same name. By id ( identity ) we can find out
    which product that we are deal with.
    */
    int id;
    String name;
    double unitPrice;
    String detail;


}
