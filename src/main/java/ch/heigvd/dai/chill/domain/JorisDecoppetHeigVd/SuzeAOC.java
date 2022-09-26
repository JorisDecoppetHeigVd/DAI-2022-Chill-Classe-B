package ch.heigvd.dai.chill.domain.JorisDecoppetHeigVd;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class SuzeAOC implements IProduct {

  public final static String NAME = "Suze AOC";
  public final static BigDecimal PRICE = new BigDecimal(7.9);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
