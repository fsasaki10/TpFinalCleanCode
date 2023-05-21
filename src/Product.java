public class Product {



    private String name;
    private double price;
    private boolean importedProduct;
    private boolean tvaProduct;
    private Integer quantity;

    public Product(String name, double price, boolean importedProduct, boolean tvaProduct, Integer quantity) {
        this.name = name;
        this.price = price;
        this.importedProduct = importedProduct;
        this.tvaProduct = tvaProduct;
        this.quantity = quantity;
    }


    public String StringProduct() {
        return this.quantity + " "+
                this.name +
                " : " + this.price ;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public double getImportedProduct(){
        if(importedProduct){
        return price*0.05;}
        return 0.0;
    }

    public double getTvaProduct(){
        if(tvaProduct){
            return price*0.1;}
        return 0.0;
    }

     /*
    public boolean getImportedProduct(){
        return importedProduct;
    }

    public boolean getTvaProduct(){
        return tvaProduct;
    }

      */

}
