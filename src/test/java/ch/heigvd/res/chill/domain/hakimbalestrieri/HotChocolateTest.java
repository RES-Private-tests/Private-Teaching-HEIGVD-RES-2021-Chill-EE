package ch.heigvd.res.chill.domain.hakimbalestrieri;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HotChocolateTest {

    @Test
    void thePriceAndNameForFeldschlosschenShouldBeCorrect() {
        HotChocolate hotChocolate = new HotChocolate();
        assertEquals(hotChocolate.getName(), HotChocolate.NAME);
        assertEquals(hotChocolate.getPrice(), HotChocolate.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForFeldschlosschen() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.hakimbalestrieri.HotChocolate";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = HotChocolate.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
