import static org.junit.Assert.*;
import org.junit.*;
import card_management.*;

public class DeckTest {
  Deck deck;

  @Before
  public void before(){
    deck = new Deck();
  }

  @Test
  public void createDeck(){
    deck.createDeck();
    assertEquals(52, deck.cardCount());
  }

  @Test
  public void removeCard(){
    deck.removeCard();
    assertEquals(51, deck.cardCount());
  }
}