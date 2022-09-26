package ch.heigvd.dai.chill.domain.JorisDecoppetHeigVd;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SuzeAOCTest {

  @Test
  void thePriceAndNameForSuzeAOCShouldBeCorrect() {
    SuzeAOC beer = new SuzeAOC();
    assertEquals(beer.getName(), SuzeAOC.NAME);
    assertEquals(beer.getPrice(), SuzeAOC.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForSuzeAOC() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.dai.chill.domain.JorisDecoppetHeigVd.SuzeAOC";
    OrderRequest request = new OrderRequest(3, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = SuzeAOC.PRICE.multiply(new BigDecimal(3));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}
