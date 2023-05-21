import java.util.List;

public class InvoiceDisplayer {
    public static StringBuilder display(List<Product> list) {
        StringBuilder invoice = new StringBuilder();
        list.forEach(product -> invoice.append(product.StringProduct()+"\n"));
        invoice.append("Montant des taxes :"+ InvoiceCalculator.calculateInvoiceTaxAmount(list)+"\n");
        invoice.append("Total :"+ InvoiceCalculator.calculateInvoiceAmount(list));
        return invoice;
    }






}
