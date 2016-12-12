import static org.junit.Assert.*;
import org.junit.*;
import card_management.*;

public class CardTest {
  Card card;

  @Before
  public void before(){
    card = new Card(NumberType.TWO, SuitType.DIAMONDS);
  }

  @Test
  public void canGetSuit(){
    assertEquals(SuitType.DIAMONDS, card.getSuit());
  }

  @Test
  public void canGetNumber(){
    assertEquals(NumberType.TWO, card.getNumber());
  }

  // @Test
  // public void canGetVALUE(){
  //   assertEquals(SuitType.DIAMONDS, card.getSuit() + NumberType.TWO, card.getNumber());
  // }
}