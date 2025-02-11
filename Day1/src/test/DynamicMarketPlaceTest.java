
import org.generics.dynamicmarket.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class DynamicMarketPlaceTest {
    private ProductCatalog catalog;
    private GadgetCategory smartphones;
    private Product<GadgetCategory> phone;

    @BeforeEach
    void setUp() {
        catalog = new ProductCatalog();
        smartphones = new GadgetCategory(
                "Smartphones",
                "Modern mobile devices",
                "Mobile",
                true
        );
        phone = new Product<>(
                "SmartPhone X",
                999.99,
                smartphones,
                "Latest flagship smartphone"
        );
    }
    @Test
    void testAddProduct() {
        catalog.addProduct(phone);
        List<Product<GadgetCategory>> gadgets = catalog.getProductsByCategory(GadgetCategory.class);
        assertEquals(1, gadgets.size());
        assertEquals(phone, gadgets.get(0));
    }

    @Test
    void testProductToString() {
        catalog.addProduct(phone);
        String expected = "Product: SmartPhone X, Price: $999.99, Category: Smartphones, Description: Latest flagship smartphone";
        assertEquals(expected, phone.toString());
    }
}
