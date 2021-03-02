package ch.heigvd.res.chill.domain.hakimbalestrieri;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class HotChocolate implements IProduct {

    public final static String NAME = "Hot chocolate";
    public final static BigDecimal PRICE = new BigDecimal(4.1);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
