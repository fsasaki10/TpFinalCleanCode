import java.util.function.Function;


public enum TaxAmountTotal {

        IMPORTE(product-> product.getPrice()*0.05),
        TVA(Product-> Product.getPrice()*0.1),
        IMPORTEDANDTVA(Product-> Product.getPrice()*0.15);


        public Function<Product, Double> taxAmount ;

        public Function<Product, Double> getTaxAmount() {
            return taxAmount;
        }

        TaxAmountTotal(Function<Product, Double> taxAmount){
            this.taxAmount = taxAmount;
        }

}
