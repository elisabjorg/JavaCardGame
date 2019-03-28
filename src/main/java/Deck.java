import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck;
    private Player player;

    public Deck() {
        this.deck = new ArrayList<>();
        this.player = new Player();
    }

    public Card createCard(SuitType suit, Rank rank) {
        Card card = new Card(suit, rank);
        return card;
    }

    public void populateDeck() {
        Rank[] ranks = Rank.values();
        SuitType[] suits = SuitType.values();
        for(int i = 0; i < suits.length; i++) {
            for(int j = 0; j < ranks.length; j++) {
                SuitType suit = SuitType.values()[i];
                Rank rank = Rank.values()[j];
                Card card = createCard(suit, rank);
                deck.add(card);
            }
        }
    }

    public Card getCard(int Index) {
        return this.deck.get(0);
    }

    public int countDeck() {
        return this.deck.size();
    }
    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public void dealCard(Player player) {
        Card card = this.deck.get(0);
        player.hand.add(card);
    }

}
