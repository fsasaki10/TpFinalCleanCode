import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class InvoiceTest {

    public List<Product> list =
            Arrays.asList(new Product("flacon de parfum importé", 27.99, true, true, 1),
            new Product("flacon de parfum", 18.99, false, true, 1),
            new Product("boite de pilule contre la migraine", 9.75, false, false, 1),
            new Product("boite de chocolats importés", 11.25, true, false, 1)
            );

    @Test
    public void test(){
        assertEquals("1 flacon de parfum importé : 27.99\n" +
                "1 flacon de parfum : 18.99\n" +
                "1 boite de pilule contre la migraine : 9.75\n" +
                "1 boite de chocolats importés : 11.25\n" +
                "Montant des taxes : 6.70\n" +
                "Total : 74.68 ",
                InvoiceDisplayer.display(list));
    }
}
