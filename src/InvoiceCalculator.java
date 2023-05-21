import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class InvoiceCalculator {

    private static double invoiceAmount;
    public static double invoiceTaxAmount;
    private static Object TaxAmountTotal;

    public static double calculateInvoiceAmount(List<Product> list){
        list.forEach(product -> invoiceAmount+=product.getPrice());

        //list.forEach(product -> System.out.println(invoiceAmount= invoiceAmount+product.getPrice()));
        invoiceAmount = Math.round(invoiceAmount*100)/100;

        System.out.println(invoiceAmount);
        invoiceAmount+=RoundHalfUp(invoiceTaxAmount);
        return invoiceAmount;

    }

    public static double RoundHalfUp(double number){
        return new BigDecimal(number).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static double calculateInvoiceTaxAmount(List<Product> list) {
        //list.stream().filter(product -> product.getTvaProduct()==true).map(product -> TaxAmountTotal.

                    /*employes
        .stream()
        .filter(e -> e.getGenre() == Genre.HOMME)
        .mapToInt(e -> e.getTaille())
        .average()
        .orElse(0);
*/
        list.forEach(product -> invoiceTaxAmount+=product.getTvaProduct());
        list.forEach(product -> invoiceTaxAmount+=product.getImportedProduct());
        return RoundHalfUp(invoiceTaxAmount);
    }
}
