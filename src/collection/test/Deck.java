package collection.test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Deck {

    private List<Card> cards = new LinkedList<>();

    public Deck() {
        initCard();
        shuffle();
    }

    private void initCard(){
        for (int i = 0; i < 13; i++) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card(i, suit));
            }
        }
    }

    private void shuffle(){
        Collections.shuffle(cards);
    }

    public Card drawCard(){
        return cards.remove(0);
    }
}
