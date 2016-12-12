package card_management;
import java.util.*;

public class Deck {
  private ArrayList<Card> deck;

  public Deck(){
    this.deck = new ArrayList<Card>();
  }

  public int cardCount(){
    return deck.size();
  }

  public void createDeck(){
    for (SuitType suit : SuitType.values()){
      for (NumberType number : NumberType.values()){
        deck.add(new Card(number, suit));
      }
    }
  }


  //   Collections.shuffle(numbers);
  // }

  // public void drawCard(){
  //   return deck.remove(deck.size() - 1);
  // }
}
  // want a deal method that removes from an ArrayList and adds to a player/dealer hand?

