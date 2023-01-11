public class Deck {
    Card[] cards;
    public Deck(){
        cards = new Card[52];
    
    for (int i = 0 ; i < 52; i++){
        cards[i] = new Card(i);

    }
    }
public String ShowDeck(){
    String output = "";
    for(int i = 0; i < 52; i++){
        output +=  this.cards[i].Face() + " of " + this.cards[i].Suit();
        output += "\n";
}
return output;
}
}
