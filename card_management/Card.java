package card_management;

public class Card {
  private NumberType number;
  private SuitType suit;

  public Card(NumberType number,  SuitType suit){
    this.number = number;
    this.suit = suit;
  }

  public SuitType getSuit(){
    return this.suit;
  }

  public NumberType getNumber(){
    return this.number;
  }

  // public void getValue(){
  //   this.suit + this.number;
  // }
}